<%-- 
    Document   : enfermeraget
    Created on : 23 may. 2023, 22:26:18
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Pagina de registtro de Enfermera</h1>
        <form action="<%= request.getContextPath()%>/EnfermeraServlet" method="GET">
            <label>ID:</label>
            <input type="text" name="id">
            <br>
            <label>Nombre:</label>
            <input type="name" nome="nombre">
            <br>
            <label>Especialidad:</label>
            <input type="email" name="especialidad">
            <br>
            <label>Telefono:</label>
            <input type="text" name="telefono">
            <br>
            <label>Email:</label>
            <input type="text" email="email">
            <br>
            <input type="submit" value="Registrar">
    </body>
</html>
