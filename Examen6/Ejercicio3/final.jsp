<%-- 
    Document   : final
    Created on : 14-jun-2016, 10:41:38
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
        <h1 style="text-align: center">TU COCINA ESTA LISTA!</h1>
        <%
            String acabado = request.getParameter("acabado");
            String asa = request.getParameter("asa");
            String electro = request.getParameter("electro");
            
            if (acabado.equals("madera") && asa.equals("larga")) {
                out.print("<img src=\"maderalargo.jpg\">");
            }
            if (acabado.equals("madera") && asa.equals("corta")) {
                out.print("<img src=\"maderacorto.jpg\">");
            }
            if (acabado.equals("naranja") && asa.equals("larga")) {
                out.print("<img src=\"naranjalargo.jpg\">");
            }
            if (acabado.equals("naranja") && asa.equals("corta")) {
                out.print("<img src=\"naranjacorto.jpg\">");
            }
            if (acabado.equals("verde") && asa.equals("larga")) {
                out.print("<img src=\"verdelargo.jpg\">");
            }
            if (acabado.equals("verde") && asa.equals("corta")) {
                out.print("<img src=\"verdecorto.jpg\">");
            }
            
        %>
        
        <table>
            <tr>
                <td>Precio Base</td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td><%
                int precioCocina=0;
                if(acabado.equals("madera")){
                    precioCocina=9000;
                    out.print("9000");
                } else {
                    precioCocina=8000;
                    out.print("8000");
                }%></td> 
            </tr>
            <tr>
                <td>Precio Electrodomésticos</td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td><% int precioElectro=0;
                    if(electro.equals("comprar")){
                    precioElectro=4500;
                    out.print("4500");
                } else {
                    precioElectro=0;
                    out.print("0");
                }
                %>
                </td>
            </tr>
            <tr>
                <td>IVA 21%</td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td><%
                    out.print(((precioCocina+precioElectro)*21)/100);
                %></td>
            </tr>
            <tr>
                <td>TOTAL</td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td><%out.print((precioCocina + precioElectro) + ((precioCocina+precioElectro)*21)/100);%></td>
            </tr>
        </table>
    </body>
</html>
