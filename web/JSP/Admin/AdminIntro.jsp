
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
        <style>
            body{width: 1000px;
                 height: 1300px;
                 background: linear-gradient(to bottom,black,white ,black );  }


            #mainNiv{width: 1100px;
                     height: 90px;
                     background: linear-gradient(to bottom,black,white ,black ); 
                     margin-left: auto;
                     margin-right: auto;

                     left: 120px;
                     position: absolute;
                     bottom:500px;

            }


            .ourPage{
                float: left;
                list-style-type: none;


                margin: 10px;}
            li {
                float: left;
            }

            li a {
                display: white;
                color: black;
                text-align: center;
                padding: 16px;
                text-decoration: none;
                font-size:30px; 
            }

            li a:hover {
                background-color:white;
                border-radius:  90px 90px 90px 90px;
            }

            .choses{
                display: white;
                color: black;
                text-align: center;
                padding: 25px;
                text-decoration: none;
                font-size:30px; 
                background-color:white;
                border-radius:  90px 90px 90px 90px;
list-style-type: none;
margin: 25px;

            }
            .choses:hover{
                    color: white;
                background-color:black;
                border-radius:  90px 90px 90px 90px;

            }
            li {
                float: left;
            }



            #bage
            {
               
                width: auto;
                height: 350px;
                margin-left: auto;
                margin-right: auto;
                position: absolute;
                top:180px;
                left: 500px;

            }



        </style>

    </head>


    <body>
        >

        <nav id="mainNiv">
            <ul id="navmenu">
             
                <li class="ourPage"><a href="../about.html" target="_blank">ABOUT</a></li>

                <li class="ourPage"><a href="../contact.html" target="_blank">CONTACT</a></li>
            </ul>



        </nav>


        <div id="bage">
            <a href="../User/itemShow_Page.jsp">  <h1 class="choses">show items </h1></a>
            <a href="insert_items.jsp">    <h1 class="choses">add items </h1></a>
       

        </div>


    </body>
</html>
