/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mundodevp.sigpaco.web.instructores;

import com.mundodevp.sigpaco.model.Instructor;
import com.mundodevp.sigpaco.model.Usuario;
import com.mundodevp.sigpaco.service.InstructorService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mundodevp
 */
@WebServlet(name = "RegistrarInstructorServ", urlPatterns = {"/registrar-instructor"})
public class RegistrarInstructorServ extends HttpServlet {

    InstructorService instructorService = new InstructorService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("registrar-instructor.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        registrar(request, response);

    }

    public void registrar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        String telefono = request.getParameter("telefono");
        String carrera = request.getParameter("carrera");
        String cedula = request.getParameter("cedula");
        String correo = request.getParameter("correo");
        String contrasenia = request.getParameter("contrasenia");
        String confcontrasenia = request.getParameter("confcontrasenia");
        String rol = "Instructor";
        
        boolean registrado;
        if (contrasenia.equals(confcontrasenia)) {
            
            registrado = instructorService.crear(new Instructor(nombre, apellidos, telefono, "default.jpg", carrera, cedula, new Usuario(correo, contrasenia, rol)));
            if (registrado) {

                request.setAttribute("status", "success");
                //response.sendRedirect(request.getContextPath() + "/index");
                request.getRequestDispatcher("registrar-instructor.jsp").forward(request, response);

            } else {
                
                requestError(request, response,
                        "Usuario ya existe, elegir otro.",
                        "registrar-instructor.jsp");
            }

        } else {
            requestError(request, response,
                    "La confirmación de contraseña es diferente.",
                    "registrar-instructor.jsp");
        }

    }

    public void requestError(HttpServletRequest request, HttpServletResponse response, String msg, String url) throws IOException, ServletException {
        request.setAttribute("msg", msg);
        request.getRequestDispatcher(url).forward(request, response);
    }

}
