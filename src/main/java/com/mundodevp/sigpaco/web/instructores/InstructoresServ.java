/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mundodevp.sigpaco.web.instructores;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mundodevp.sigpaco.service.InstructorService;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import javax.servlet.http.HttpSession;
/**
 *
 * @author mundodevp
 */
@WebServlet(name = "InstructoresServ", urlPatterns = {"/instructores"})
public class InstructoresServ extends HttpServlet {
    InstructorService instructorServicie = new InstructorService();
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion = request.getSession();
        sesion.setAttribute("instructores", instructorServicie.listar());
        response.sendRedirect("instructores.jsp");    
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
    }



}
