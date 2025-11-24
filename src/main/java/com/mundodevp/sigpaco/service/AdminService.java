/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mundodevp.sigpaco.service;

import com.mundodevp.sigpaco.bl.AdministradorBL;
import com.mundodevp.sigpaco.bl.UsuarioBL;
import com.mundodevp.sigpaco.model.Administrador;
import com.mundodevp.sigpaco.model.Usuario;
public class AdminService {
    private final AdministradorBL adminBl;
    private final UsuarioBL usuarioBL;
    
    public AdminService(){
        adminBl = new AdministradorBL();
        usuarioBL = new UsuarioBL();
    }
    
    public boolean crearAdmin(String correo, String contrasenia, String rol){
        if(!usuarioBL.existeUsuario(correo)){
                 adminBl.crear(new Administrador(new Usuario(correo, contrasenia, rol)));
                 return true;
            }  
        return false;
    }
    
}
