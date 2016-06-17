<%-- 
    Document   : cielo
    Created on : 15-jun-2016, 9:30:27
    Author     : Alex Lopez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #99e6ff">
        <div>
            <table>
                <%
                    boolean existe = false;
                for(int i = 0; i < 10; i++){
                    out.print("<tr>");
                    out.print("<td>");
                    for(int j = 0; j < 10; j++){
                    int img = (int)(Math.random()*10+1);
                    
                    if(img == 6){
                        out.print("<img src=\"avion.png\">");
                    }
                    else if(img == 7){
                        out.print("<img src=\"nube.png\">");
                    }
                    else if(img == 8){
                        out.print("<img src=\"pajaro.png\">");
                    }
                    else if(img == 9){
                        out.print("<img src=\"platillo.png\">");
                    }
                    else if(img == 10 && !existe){
                        out.print("<img src=\"sol.png\">");
                        existe=true;
                    } else {
                        out.print("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
                    }
                    }
                }
            %>
            </table>
        </div>
    </body>
</html>
