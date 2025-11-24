/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mundodevp.sigpaco.web.instructores;

import com.mundodevp.sigpaco.model.Instructor;
import com.mundodevp.sigpaco.model.Usuario;
import com.mundodevp.sigpaco.service.InstructorService;
import com.mundodevp.sigpaco.service.UsuarioService;
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
@WebServlet(name = "EliminarInstructorServ", urlPatterns = {"/eliminar-instructor"})
public class EliminarInstructorServ extends HttpServlet {
    UsuarioService usuarioservice = new UsuarioService();
    InstructorService instructorService = new InstructorService();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        eliminar(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }
    
    public void eliminar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long id = Long.parseLong(request.getParameter("id"));
        System.out.println("Id maestro" + id);
        Instructor instructor = instructorService.buscarId(id);
        Usuario usuario = usuarioservice.buscarId(instructor.getUsuarioInst().getId());
        instructorService.eliminar(id);
        usuarioservice.eliminar(usuario.getId());

    }



}
