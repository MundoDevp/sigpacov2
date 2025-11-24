/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mundodevp.sigpaco.web;

import com.mundodevp.sigpaco.service.AdminService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mundodevp
 */


@WebServlet(name = "RegisterServ", urlPatterns = {"/admin"})
public class RegisterServ extends HttpServlet {


    AdminService adminService =  new AdminService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("register.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        registrarAdmin(request, response);

    }
    
    public void registrarAdmin(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String correo = request.getParameter("correo");
        String contrasenia = request.getParameter("contrasenia");
        String confcontrasenia = request.getParameter("confcontrasenia");
        String rol = "Administrador";
        boolean registrado;
        
        request.setAttribute("correo", correo);
        request.setAttribute("contrasenia", contrasenia);
        request.setAttribute("confContrasenia", confcontrasenia);
        
        if (contrasenia.equals(confcontrasenia)) {
            registrado = adminService.crearAdmin(correo, contrasenia, rol);
            if (registrado) {
               
                request.setAttribute("status", "success");
                //response.sendRedirect(request.getContextPath() + "/index");
                request.getRequestDispatcher("register.jsp").forward(request, response);
                
            } else {
                request.setAttribute("status", "failed");
                requestError(request, response, 
                        "Usuario ya existe, elegir otro.", 
                        "register.jsp");   
            }

        } else {
            requestError(request, response, 
                        "La confirmación de contraseña es diferente.", 
                        "register.jsp");
        }
        
    }
    
    public void requestError(HttpServletRequest request, HttpServletResponse response,String msg,String url) throws IOException, ServletException{
        request.setAttribute("msg", msg);
        request.getRequestDispatcher(url).forward(request, response);
    }

}
