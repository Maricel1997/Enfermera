<%-- 
    Document   : create
    Created on : 23 may. 2023, 22:33:14
    Author     : Usuario
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Registro de Enfermera</title>
        <link rel="stylesheet" href="<%=request.getContextPath() %>/webjars/bootstrap/5.3.0-alpha3/dist/css/bootstrap.min.css"/>
        <script defer src="<%= request.getContextPath() %>/webjars/bootstrap/5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg bg-info-subtle">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">PV</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">Enfermera</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <h1 class="text-center text-primary">Registro de Enfermera</h1>
        <div class="container">
            <form action="<%= request.getContextPath()%>/EnfermeraServlet?action=create" method="POST">
                <div class="mb-3">
                    <label for="id" class="form-label">Id:</label> 
                    <input type="text" class="form-control"  name="id" id="id" required minlength="1" maxlength="100" placeholder="Numero de Id">
                </div>
                <div class="mb-3">
                    <label for="apellido" class="form-label">Nombre:</label>
                    <input type="text" class="form-control" name="nombre" id="nombre" required minlength="1" maxlength="100" placeholder="Nombre de Enfermera"/>
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">Especialidad:</label>
                    <input type="text" class="form-control" name="especialidad" id="especialidad" required minlength="6" maxlength="50" placeholder="Nombre de Especialidad"/>
                </div>
                <div class="mb-3">
                    <label for="descripcion" class="form-label" >Telefono:</label>
                    <input type="text" class="form-control" name="telefono" id="telefono" required minlength="1" maxlength="100" placeholder="Numero de Telefono"/>
                </div>
                <div class="mb-3">
                    <label for="descripcion" class="form-label" >Email:</label>
                    <input type="text" class="form-control" name="email" id="email" required minlength="1" maxlength="100" placeholder="micorreo@mail.com"/>
                </div>
                <button type="submit" class="btn btn-primary">Guardar</button>
            </form>
        </div>
    </body>
</html>