/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mundodevp.sigpaco.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author mundodevp
 */
@Entity
@Getter
@Setter
public class Administrador extends Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="USUARIO_ID")
    private Usuario usuario;

    public Administrador() {
    }

    public Administrador(Usuario usuarioAdmin) {
        super();
        this.usuario = usuarioAdmin;
    }

    public Administrador(String nombre, String apellidos, String telefono, String foto,Usuario usuarioAdmin) {
        super(nombre, apellidos, telefono, foto);
        this.usuario = usuarioAdmin;
    }
  
}
