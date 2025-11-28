/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mundodevp.sigpaco.web;

import com.mundodevp.sigpaco.service.EstudianteService;
import com.mundodevp.sigpaco.service.InstructorService;
import com.mundodevp.sigpaco.service.UsuarioService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mundodevp
 */
@WebServlet(name = "DashboardServ", urlPatterns = {"/dashboard"})
public class DashboardServ extends HttpServlet {
    
     UsuarioService usuarioService = new UsuarioService();
     InstructorService instructorService = new InstructorService();
     EstudianteService estudianteService =  new EstudianteService();
        

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion = request.getSession();
        sesion.setAttribute("numeroInstructores", instructorService.contarInstructores());
        sesion.setAttribute("numeroUsuarios", usuarioService.contarUsuarios());
        sesion.setAttribute("numeroEstudiantes", estudianteService.contarEstudiantes());
        response.sendRedirect("dashboard.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
