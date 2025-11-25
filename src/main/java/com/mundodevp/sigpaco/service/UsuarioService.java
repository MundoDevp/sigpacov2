/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mundodevp.sigpaco.service;

/**
 *
 * @author mundodevp
 */
import com.mundodevp.sigpaco.bl.UsuarioBL;
import com.mundodevp.sigpaco.lib.Valid;
import com.mundodevp.sigpaco.model.Usuario;
import java.util.List;
public class UsuarioService {

    private final UsuarioBL usuarioBl;
    public UsuarioService() {
        this.usuarioBl = new UsuarioBL();
    }
    
    public List<Usuario>listar(){
        return usuarioBl.listar();
    }
    
    public boolean crear(String correo,String contrasenia, String rol){
        
        if(!Valid.estanVacios(correo, contrasenia, rol) ){
            if(!usuarioBl.existeUsuario(correo)){
                 usuarioBl.crear(new Usuario(correo, contrasenia, rol));
                 return true;
            }  
        }
        return false;
    }
    
    public Usuario ingresar(String correo,String contreasenia){
        return usuarioBl.existeUsuario(correo, contreasenia);
    }
    
    public Usuario buscarId(long id){
        return usuarioBl.buscarId(id);
    }
    
    public boolean eliminar(long id){
        return usuarioBl.eliminar(id);
    }
    
    public boolean editar(Usuario usuario){
        return usuarioBl.editar(usuario);
    }
    
    
    
    
    
}
