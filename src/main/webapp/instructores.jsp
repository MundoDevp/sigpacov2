<%-- 
    Document   : dashboard
    Created on : 15 nov 2025, 17:42:35
    Author     : mundodevp
--%>

<%@page import="com.mundodevp.sigpaco.model.Instructor"%>
<%@page import="java.util.List"%>
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

                    <!-- Content wrapper -->
                    <div class="content-wrapper">
                        <!-- Content -->

                        <div class="container-xxl flex-grow-1 container-p-y">
                            <h4 class="fw-bold py-3 mb-4"><span class="text-muted fw-light">Instructores /</span> Registrados</h4>
                            <div class="card">
                                <h5 class="card-header">Instructores</h5>
                                <div class="table-responsive text-nowrap">
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th>Id</th>
                                                <th>Instructor</th>
                                                <th>Télefono</th>
                                                <th>Foto</th>
                                                <th>Usuario</th>
                                                <th>Actions</th>
                                            </tr>
                                        </thead>
                                        <tbody class="table-border-bottom-0">
                                            <%                                                int id = 0;
                                                List<Instructor> instructores = (List<Instructor>) session.getAttribute("instructores");

                                                for (Instructor maestro : instructores) {

                                            %>
                                            <tr>
                                                <td><%= ++id%></td>
                                                <td><%= maestro.getNombre() + " " + maestro.getApellidos()%></td>
                                                <td><%= maestro.getTelefono()%></td>
                                                <td>
                                                    <ul class="list-unstyled users-list m-0 avatar-group d-flex align-items-center">
                                                        <li data-bs-toggle="tooltip" data-popup="tooltip-custom" data-bs-placement="top" class="avatar avatar-xs pull-up" title="" data-bs-original-title="<%= maestro.getNombre() + " " + maestro.getApellidos()%>">
                                                            <img src="assets/img/avatars/5.png" alt="Avatar" class="rounded-circle">
                                                        </li>

                                                    </ul>
                                                </td>

                                                <td><%= maestro.getUsuarioInst().getEmail()%></td>
                                                <td>
                                                    <!-- comment<a class="btn rounded-pill btn-icon btn-info" href="">
                                                        <span class="tf-icons bi bi-eye"></span>
                                                    </a> -->
                                                    <a href="<%= request.getContextPath()%>/editar-instructor?id=<%= maestro.getId() %>" class="btn rounded-pill btn-icon btn-warning">
                                                        <span class="tf-icons bi bi-pencil-square"></span>
                                                    </a>
                                                    <a href="#" onclick="eliminar(<%= maestro.getId() %>)" class="btn rounded-pill btn-icon btn-danger">
                                                        <span class="tf-icons bi bi-trash3"></span>
                                                    </a>
                                                    
                                                </td>
                                            </tr>

                                            <%
                                                }
                                            %>

                                        </tbody>
                                    </table>
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
        <!-- Place this tag in your head or just before your close body tag. -->
        <script async defer src="https://buttons.github.io/buttons.js"></script>
        <script src="js/eliminar/eliminarInstructor.js" type="text/javascript"></script>
    </body>
</html>

