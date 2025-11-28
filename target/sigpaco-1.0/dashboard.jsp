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
                            <div class="row">
                                <div class="col-lg-12 col-md-12 order-0">
                                    <div class="row">
                                        <div class="col-lg-3 col-md-12 col-3 mb-4">
                                            <div class="card">
                                                <div class="card-body">
                                                    <div class="card-title d-flex align-items-start justify-content-between">
                                                        <div class="avatar flex-shrink-0 me-3">
                                                            <span class="avatar-initial rounded bg-label-primary"><i class="bi bi-person-workspace"></i></span>
                                                        </div>

                                                    </div>
                                                    <span class="fw-semibold d-block mb-1 text-primary">Instructores</span>
                                                    <h3 class="card-title text-success fw-semibold text-nowrap mb-1"><%= "" + session.getAttribute("numeroInstructores") %></h3>

                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-lg-3 col-md-12 col-3 mb-4">
                                            <div class="card">
                                                <div class="card-body">
                                                    <div class="card-title d-flex align-items-start justify-content-between">
                                                      
                                                       <div class="avatar flex-shrink-0 me-3">
                                                            <span class="avatar-initial rounded bg-label-primary"><i class="bi bi-person-video2"></i></span>
                                                        </div>

                                                    </div>
                                                    <span class="fw-semibold d-block mb-1 text-primary">Estudiantes</span>
                                                    <h3 class="card-title text-success fw-semibold text-nowrap mb-1"><%= "" +  session.getAttribute("numeroEstudiantes") %></h3>

                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-lg-3 col-md-12 col-3 mb-4">
                                            <div class="card">
                                                <div class="card-body">
                                                    <div class="card-title d-flex align-items-start justify-content-between">
                                                        <div class="avatar flex-shrink-0 me-3">
                                                            <span class="avatar-initial rounded bg-label-primary"><i class="bi bi-people"></i></span>
                                                        </div>
                                                    </div>
                                                    <span class="fw-semibold d-block mb-1 text-primary">Usuario</span>
                                                    <h3 class="card-title text-success fw-semibold text-nowrap mb-1"><%= "" +  session.getAttribute("numeroUsuarios") %></h3>

                                                </div>
                                            </div>
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




    </body>
</html>

