<%-- 
    Document   : apuesta
    Created on : 02-feb-2016, 9:32:26
    Author     : Moisés Rodríguez Naranjo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Premio</title>
        <style>
 root {
  display: block;
}

body {
  font-family: Arial, sans-serif;
  background-color: #bcdeff;
}

p {
  text-align: center;
}

h3 {
  text-align: center;
  color: white;
  text-shadow: #242424 2px 2px 1px;
}



form {
  text-align: center;
}

table {
  background-color: #abcdef;
  margin: auto;
  padding: 20px;
  box-shadow: #242424 4px 4px 4px;
  text-align: right;
  border: 0px;
  border-collapse: collapse;
}

th {
  background-color: #aaaadd;
  color: white;
  padding: 4px;
  margin: 2px;
}

td {
  padding: 10px;
}

td.imagen{
    text-align: center;
}

#img1{
    
    width:350px; 
    height:200px;
}

#img2{
    
    width:250px; 
    height:220px;
}

        </style>
    </head>
    <body>
        <%
        int apuesta = 0;
        String premio = "";
        String mensaje ="";
        int apostado = Integer.parseInt(request.getParameter("apostar"));
     
        apuesta= (int)(Math.random()* 6 + 1);
        if (apostado==apuesta){
          premio="iphone.jpg";
          mensaje="Has acertado. Tu premio es un teléfono móvil";
        }else{
          premio="euro.jpg";
          mensaje="No has acertado. Tu premio es una moneda de chocolate";
        } 
        String imagen = "rasca"+ apuesta + ".jpg";
        
        
        %>
        
        <table>
            <tr>
                <td class="imagen">
                    <img id="img1" src="<%= imagen %>">
                </td>
            </tr>
        
            <tr>
                <td>
                    <h3>
                         <%= mensaje %>
                    </h3>
                </td>
            </tr>
            
            <tr>
                <td class="imagen">
                     <img id="img2" src="<%= premio %>">
                </td>
            </tr>
            <tr>
                <td>
                    <form method="post" action="index.html">
                        <input type="submit" value="Volver a jugar">
                    </form>
                <td>
            </tr>
        </table>
    </body>
</html>
