<%-- 
    Document   : juego
    Created on : 02-feb-2016, 10:40:43
    Author     : Moisés Rodríguez Naranjo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Juego piedra papel tijera</title>
        <style>


body {
  font-family: Arial, sans-serif;
  background-color: greenyellow;
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
  width: 280px;
  height: 500px;
  box-shadow: #242424 4px 4px 4px;
  text-align: right;
  border: 0px;
  border-collapse: collapse;
}


td {
  padding: 10px;
}

td.imagen{
    text-align: center;
}


img.img1{
    
    width:150px; 
    height:120px;
}
        </style>
    </head>
    <body>
         <%
        int apuesta = 0;
        String imagen = "";
        String imagenOrdenador = "";
        String premio = "";
        String mensaje ="";
        int apostado = Integer.parseInt(request.getParameter("apostar"));
        
        apuesta= (int)(Math.random()* 3 + 1);
        
        if (apostado==1 && apuesta==2){
          mensaje="Gana el Ordenador";
        }else if (apostado==2 && apuesta==1){
          mensaje="Gana el Jugador";
        } else if (apostado==3 && apuesta==1){ 
          mensaje="Gana el Ordenador";
        } else if (apostado==1 && apuesta==3) {
          mensaje="Gana el Jugador";
        }else if  (apostado==2 && apuesta==3){ 
          mensaje="Gana el Ordenador";
        }else if (apostado==3 && apuesta==2){
           mensaje="Gana el Jugador";
        }else if (apostado==1 && apuesta==1 || (apostado==2 && apuesta==2) || 
                 (apostado==3 && apuesta==3))
           mensaje="Empate";
   
        
      
        if(apostado==1){
        imagen = "piedra.png";
        }
        if(apostado==2){
        imagen = "papel.png";
        }
        if(apostado==3){
        imagen = "tijera.png";
        }
        
        if(apuesta==1){
        imagenOrdenador = "piedra.png";
        }
        if(apuesta==2){
        imagenOrdenador = "papel.png";
        }
        if(apuesta==3){
        imagenOrdenador = "tijera.png";
        }
        
        %>
        
          <table>
            <tr>
                <td class="imagen">
                    <h3>Jugador:</h3>
                    <img class="img1" src="<%= imagen %>">
                </td>
            </tr>
            
            <tr>
                <td class="imagen">
                    <h3>Ordenador:</h3>
                    <img class="img1" src="<%= imagenOrdenador %>">
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
                <td>
                    <form method="post" action="index.html">
                        <input type="submit" value="Volver a jugar">
                    </form>
                <td>
            </tr>
        </table>
    </body>
</html>
