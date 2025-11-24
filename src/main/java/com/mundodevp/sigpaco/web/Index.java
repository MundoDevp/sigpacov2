/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mundodevp.sigpaco.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mundodevp
 */

import com.mundodevp.sigpaco.service.UsuarioService;
@WebServlet(name = "Index", urlPatterns = {"/index"})
public class Index extends HttpServlet {
    UsuarioService usuarioService =  new UsuarioService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        loguear(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    public void loguear(HttpServletRequest request, HttpServletResponse response) throws IOException {
        boolean userExist = usuarioService.listar().isEmpty();
        if (!userExist) {
            response.sendRedirect(request.getContextPath()+"/login");
        } else {
            response.sendRedirect(request.getContextPath()+"/admin");
        }
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
