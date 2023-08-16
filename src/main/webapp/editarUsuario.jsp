<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyBegins.jsp" %>

    <h1>Editar Usuario</h1>
    
    <% Usuario usu = (Usuario) request.getSession().getAttribute("usuEditar"); %>
    
    <form class="user" action="SvEditUsuarios" method="POST">
        <div class="form-group col">
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="nombreusu" name="nombreusu" placeholder="Nombre Usuario" 
                       value="<%=usu.getNombreUsuario() %>">
            </div>
            <div class="col-sm-6 mb-3">
                <input type="password" class="form-control form-control-user" id="password" name="password" placeholder="Contraseña"
                       value="<%=usu.getPassword() %>">
            </div>
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="rol" name="rol" placeholder="Rol"
                       value="<%=usu.getRol() %>">
            </div>                                   
        </div>
                                
        <button type="submit" class="btn btn-primary btn-user btn-block">
            Guardar Cambios
        </button>
                                
    </form>

<%@include file="components/bodyEnds.jsp" %>
