<%@page import="logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyBegins.jsp" %>

    <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">Ver Usuarios</h1>
                    

                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Usuarios</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>Id</th>
                                            <th>Nombre Usuario</th>
                                            <th>Rol</th>                                            
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                            <th>Id</th>
                                            <th>Nombre Usuario</th>
                                            <th>Rol</th> 
                                        </tr>
                                    </tfoot>
                                    
                                    <% List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsu"); %>
                                    
                                    <tbody>
                                        <% for (Usuario usu: listaUsuarios) {%>
                                        <tr>
                                            <td><%= usu.getId_usuario() %></td>
                                            <td><%= usu.getNombreUsuario() %></td>
                                            <td><%= usu.getRol() %></td>                                            
                                        </tr> 
                                        <% } %>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- /.container-fluid -->

<%@include file="components/bodyEnds.jsp" %>
