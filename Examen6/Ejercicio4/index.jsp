<%-- 
    Document   : index
    Created on : 14-jun-2016, 10:21:50
    Author     : Alex Lopez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int dado1=0;
            int dado2=0;
            int dado3=0;
            
            do{
               dado1=(int)(Math.random()*6)+1;
               dado2=(int)(Math.random()*6)+1;
               dado3=(int)(Math.random()*6)+1;
               out.print("<img width=\"153\" height=\"149\" src=\"./img/dado" + dado1 + ".png\">");
               out.print("<img width=\"153\" height=\"149\" src=\"./img/dado" + dado2 + ".png\">");
               out.print("<img width=\"153\" height=\"149\" src=\"./img/dado" + dado3 + ".png\">");
               out.print("<br>");
            }while((dado1 != dado2)&&(dado1 != dado3)&&(dado2 != dado3));
            
        %>
    </body>
</html>
