<%-- 
    Document   : dashboard
    Created on : 15 nov 2025, 17:42:35
    Author     : mundodevp
--%>

<%@page import="com.mundodevp.sigpaco.model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Usuario usuario = (Usuario) session.getAttribute("usuario");

%>
<!DOCTYPE html>

<!-- =========================================================
* Sneat - Bootstrap 5 HTML Admin Template - Pro | v1.0.0
==============================================================

* Product Page: https://themeselection.com/products/sneat-bootstrap-html-admin-template/
* Created by: ThemeSelection
* License: You must have a valid license purchased in order to legally use the theme for your project.
* Copyright ThemeSelection (https://themeselection.com)

=========================================================
-->
<!-- beautify ignore:start -->
<html
    lang="en"
    class="light-style layout-menu-fixed"
    dir="ltr"
    data-theme="theme-default"
    data-assets-path="assets/"
    data-template="vertical-menu-template-free"
    >
    <head>
        <meta charset="utf-8" />
        <meta
            name="viewport"
            content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0"
            />

        <title>Dashboard</title>

        <meta name="description" content="" />

        <!-- Favicon -->
        <link rel="icon" type="image/x-icon" href="assets/img/favicon/favicon.ico" />
        <!-- CSS -->
        <%@include file="template/css.jsp"%>

 
    </head>

    <body>
        <!-- Layout wrapper -->
        <div class="layout-wrapper layout-content-navbar">
            <div class="layout-container">
                <!-- Menu -->

                <%@include file="template/menu-lateral.jsp"%>

                <!-- Layout container -->
                <div class="layout-page">
                     <!-- Nav - Top Menu -->
                    <%@include file="template/menu-top.jsp"%>

                    <!-- / Navbar -->

                    <!-- Content wrapper -->
                    <div class="content-wrapper">
                        <!-- Content -->

                        <div class="container-xxl flex-grow-1 container-p-y">
                            <h4 class="fw-bold py-3 mb-4"><span class="text-muted fw-light">Instructor /</span> Registrar</h4>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="card mb-4">
                                        <h5 class="card-header">Información</h5> 
                                        <hr class="my-0" />
                                        <div class="card-body">
                                            <form id="formAccountSettings" method="POST" action="<%= request.getContextPath()%>/registrar-instructor">
                                                <input type="hidden" id="status" value="<%=request.getAttribute("status")%>"/>
                                                <div class="row">
                                                    <div class="mb-3 col-md-6">
                                                        <label for="firstName" class="form-label">Nombre</label>
                                                        <input
                                                            class="form-control"
                                                            type="text"
                                                            id="firstName"
                                                            name="nombre"
                                                            required

                                                            autofocus
                                                            />
                                                    </div>
                                                    <div class="mb-3 col-md-6">
                                                        <label for="lastName" class="form-label">Apellidos</label>
                                                        <input class="form-control" type="text" name="apellidos" id="lastName" required/>
                                                    </div>  

                                                    <div class="mb-3 col-md-6">
                                                        <label class="form-label" for="phoneNumber">Télefono</label>
                                                        <div class="input-group input-group-merge">

                                                            <input
                                                                type="text"
                                                                id="phoneNumber"
                                                                name="telefono"
                                                                class="form-control"
                                                                placeholder="202 555 0111"
                                                                required
                                                                />
                                                        </div>
                                                    </div>
                                                    <div class="mb-3 col-md-6">
                                                        <label for="address" class="form-label">Carrera</label>
                                                        <input type="text" class="form-control" id="carrera" name="carrera" placeholder="Carrera" required />
                                                    </div>
                                                    <div class="mb-3 col-md-6">
                                                        <label for="state" class="form-label">Cédula Profesional</label>
                                                        <input class="form-control" type="text" id="cedula" name="cedula" placeholder="2679392" required/>
                                                    </div>
                                                    <div class="mb-3 col-md-6">
                                                        <label for="email" class="form-label">Nombre de usuario</label>
                                                        <input
                                                            class="form-control"
                                                            type="text"
                                                            id="email"
                                                            name="correo"

                                                            placeholder="john.doe@example.com"
                                                            required
                                                            />
                                                    </div>
                                                    <div class="mb-3 form-password-toggle col-md-6">

                                                        <label class="form-label" for="password">Contraseña</label>
                                                        <div class="input-group input-group-merge">
                                                            <input type="password" id="password" class="form-control" name="contrasenia" required placeholder="············" aria-describedby="password">
                                                            <span class="input-group-text cursor-pointer"><i class="bx bx-hide"></i></span>
                                                        </div>

                                                    </div>
                                                    <div class="mb-3 form-password-toggle col-md-6">

                                                        <label class="form-label" for="password">Confirmar Contraseña</label>
                                                        <div class="input-group input-group-merge">
                                                            <input type="password" id="password" class="form-control" name="confcontrasenia" 
                                                                   placeholder="············" 
                                                                   aria-describedby="password" required>
                                                            <span class="input-group-text cursor-pointer"><i class="bx bx-hide"></i></span>
                                                        </div>

                                                    </div>
                                                </div>
                                                <div class="mb-3">
                                                    <%
                                                        if (request.getAttribute("msg") != null) {
                                                    %>
                                                    <div class="alert alert-danger alert-dismissible" role="alert">
                                                        <%= request.getAttribute("msg")%>
                                                        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                                                    </div>
                                                    <%
                                                        }
                                                    %>

                                                </div>
                                               
                                                <div class="mt-2">
                                                    <button type="submit" class="btn btn-primary me-2">Guardar Instructor</button>
                                                    <button type="reset" class="btn btn-outline-secondary">Cancelar</button>
                                                </div>
                                            </form>

                                        </div>


                                    </div> 

                                </div>

                            </div>




                        </div>
                        <!-- / Content -->

                        <!-- Footer -->
                        <footer class="content-footer footer bg-footer-theme">
                            <div class="container-xxl d-flex flex-wrap justify-content-between py-2 flex-md-row flex-column">
                                <div class="mb-2 mb-md-0">
                                    ©
                                    <script>
                                        document.write(new Date().getFullYear());
                                    </script>
                                    , made with ❤️ by
                                    <a href="https://themeselection.com" target="_blank" class="footer-link fw-bolder">ThemeSelection</a>
                                </div>
                                <div>
                                    <a href="https://themeselection.com/license/" class="footer-link me-4" target="_blank">License</a>
                                    <a href="https://themeselection.com/" target="_blank" class="footer-link me-4">More Themes</a>

                                    <a
                                        href="https://themeselection.com/demo/sneat-bootstrap-html-admin-template/documentation/"
                                        target="_blank"
                                        class="footer-link me-4"
                                        >Documentation</a
                                    >

                                    <a
                                        href="https://github.com/themeselection/sneat-html-admin-template-free/issues"
                                        target="_blank"
                                        class="footer-link me-4"
                                        >Support</a
                                    >
                                </div>
                            </div>
                        </footer>
                        <!-- / Footer -->

                        <div class="content-backdrop fade"></div>
                    </div>
                    <!-- Content wrapper -->
                </div>
                <!-- / Layout page -->
            </div>

            <!-- Overlay -->
            <div class="layout-overlay layout-menu-toggle"></div>
        </div>
        <!-- / Layout wrapper -->



        <!-- Core JS -->

        <%@include file="template/js.jsp"%>

        <!-- Page JS -->
        <script src="assets/js/dashboards-analytics.js"></script>

        <script>
          
              
                var status = document.getElementById("status").value;
                if (status == "success") {
                    Swal.fire({
                        icon: "success",
                        title: "Instructor registrado.",
                        showConfirmButton: false,
                        timer: 1500
                    });
                    setInterval(function(){
                        window.location = "<%=request.getContextPath() %>/instructores";  
                    },1000);
                }
    
                
          
        </script>
    </body>
</html>

