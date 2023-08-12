<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyBegins.jsp" %>

    <h1>Alta Usuarios</h1>
    <form class="user">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombreusu"
                                            placeholder="Nombre Usuario">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="password" class="form-control form-control-user" id="password"
                                            placeholder="Contraseña">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="rol"
                                            placeholder="Rol">
                                    </div>                                   
                                </div>
                                
                                <a href="#" class="btn btn-primary btn-user btn-block">
                                    Crear Usuario
                                </a>
                                
                            </form>

<%@include file="components/bodyEnds.jsp" %>
