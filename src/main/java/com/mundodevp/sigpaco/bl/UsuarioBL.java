/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mundodevp.sigpaco.bl;

/**
 *
 * @author mundodevp
 */
import com.mundodevp.sigpaco.model.Usuario;
import com.mundodevp.sigpaco.persistence.UsuarioJpaController;
import com.mundodevp.sigpaco.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class UsuarioBL {
    private final UsuarioJpaController usuarioJpa;

    public UsuarioBL() {
        this.usuarioJpa = new UsuarioJpaController();
    }
    
    public List<Usuario> listar(){
        return usuarioJpa.findUsuarioEntities();
    }
    
    public void crear(Usuario u){
        usuarioJpa.create(u);
    }
    
    public boolean existeUsuario(String correo){
        for (Usuario usuario : listar()) {
            if(usuario.getEmail().equals(correo))
                return true;
        }   
        return false;
    }
    
    public Usuario existeUsuario(String correo,String contrasenia){
       for (Usuario usuario : listar()) {
            if(usuario.getEmail().equals(correo) && usuario.getContrasenia().equals(contrasenia))
                return usuario;
        }   
        return null; 
    }
    
    public Usuario buscarId(long id){
        return usuarioJpa.findUsuario(id);
    }
    
    public boolean eliminar(long id){
        try {
            usuarioJpa.destroy(id);
            return true;
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(UsuarioBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
   
    
    
    
    
    
    
}
