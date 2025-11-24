/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mundodevp.sigpaco.web.instructores;

import com.mundodevp.sigpaco.model.Instructor;
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
@WebServlet(name = "EditarInstructorServ", urlPatterns = {"/editar-instructor"})
public class EditarInstructorServ extends HttpServlet {
    InstructorService instructorService = new InstructorService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        editar(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    public void editar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        long idInstructor = Long.parseLong(request.getParameter("id"));
        Instructor instructor = instructorService.obtenerInstructor(idInstructor);
        request.setAttribute("instructor", instructor);
        
        request.getRequestDispatcher("editar-instructor.jsp").forward(request, response);
        

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
