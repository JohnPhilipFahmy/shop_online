<%-- 
    Document   : TimeRemained
    Created on : May 10, 2019, 1:54:36 PM
    Author     : hp
--%>

<%@page import="orm.Order"%>
<%@page import="bl.classses.OrderBL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    
    <style>
    body {
    background: black;
}

.clock {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translateX(-50%)
        translateY(-50%);
    color: #17D4FE;
    font-size: 60px;
    font-family: Orbitron;
    letter-spacing: 7px;
   


}
        </style>
<script>

 // Set the date we're counting down to
    <%
    int orderId=Integer.parseInt(request.getParameter("TimeRemained"));
    
    OrderBL orderBL=new OrderBL();
    Order order= orderBL.findByOrderId(orderId);
   System.out.println(order.getTimeOfOrder());
    %>
var countDownDate = new Date("<%= order.getTimeOfOrder()%>").getTime();

// Update the count down every 1 second
var x = setInterval(function() {

  // Get todays date and time
  var now = new Date().getTime();
    
  // Find the distance between now and the count down date
  var distance = countDownDate - now;
    
  // Time calculations for days, hours, minutes and seconds
  var days = Math.floor(distance / (1000 * 60 * 60 * 24));
  var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
  var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
  var seconds = Math.floor((distance % (1000 * 60)) / 1000);
    
  // Output the result in an element with id="demo"
  document.getElementById("MyClockDisplay").innerHTML = days + "d " + hours + "h "
  + minutes + "m " + seconds + "s ";
    
  // If the count down is over, write some text 
  if (distance < 0) {
    clearInterval(x);
    document.getElementById("demo").innerHTML = "EXPIRED";
  }
}, 1000);
  
</script>
</head>

<body>

<div id="MyClockDisplay" class="clock" ></div>

</body>

</html>
