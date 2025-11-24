/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mundodevp.sigpaco.web;

import com.mundodevp.sigpaco.model.Usuario;
import com.mundodevp.sigpaco.service.UsuarioService;
import java.io.IOException;
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
@WebServlet(name = "LoginServ", urlPatterns = {"/login"})
public class LoginServ extends HttpServlet {
    UsuarioService usuarioService = new UsuarioService();

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("login.jsp");
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String correo = request.getParameter("correo");
        String contrasenia = request.getParameter("contrasenia");
        HttpSession sesion = request.getSession();
        request.setAttribute("correo", correo);
        request.setAttribute("contrasenia", contrasenia);
        Usuario usuario = usuarioService.ingresar(correo, contrasenia);
        if(usuario!=null){
            sesion.setAttribute("usuario",usuario);
            response.sendRedirect(request.getContextPath()+"/dashboard");
            
        }else{
            request.setAttribute("error", "Usuario o contraseña incorrecta");
            request.getRequestDispatcher("login.jsp").forward(request, response);
            
        }
        
    }

 
}
