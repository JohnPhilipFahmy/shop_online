
package bl.classses;

import daoClasses.OrderDAO;
import daoClasses.OrderItemDAO;
import java.util.List;
import orm.Order;
import orm.OrderItem;

/**
 *
 * @author hp
 */
public class OrderBL {

    OrderDAO orderDAO;
    OrderItemDAO orderItemDAO;

    public OrderBL() throws ClassNotFoundException {
        this.orderItemDAO = new OrderItemDAO();
        this.orderDAO = new OrderDAO();
    }

    public List<Order> findAll() {
        List<Order> orders = orderDAO.findAll();
        return orders;
    }

    public Order find(int id) {
        Order order = orderDAO.find(id);
        System.out.println(order.getOrderId());
        List<OrderItem> orderItems = orderItemDAO.findByFKOrder(id);
        order.setOrderItems(orderItems);
        return order;
    }
    public List<Order> findByUserId(int userId){
        List<Order> orders = orderDAO.findByUserId(userId);
    return orders;
    
    
    }
    
    
     public Order findByOrderId(int orderId){
       
    return orderDAO.findByOrderId(orderId);
    
    
    }
    
    public void update(Order order) throws ClassNotFoundException {
        OrderDAO orderDAO=new OrderDAO();
                orderDAO.update(order);
    }
  
    public Order create(Order order) throws ClassNotFoundException {
        OrderDAO orderDAO = new OrderDAO();
 orderDAO.create(order);
      return order;
      
    }
}
