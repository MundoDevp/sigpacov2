/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mundodevp.sigpaco.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author mundodevp
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String contrasenia;
    private String rol;
    private boolean activo;
    
    public Usuario(String email, String contrasenia, String rol) {
        this.email = email;
        this.contrasenia = contrasenia;
        this.rol = rol;
        this.activo = true;
    }

    public Usuario(String email, String contrasenia, String rol, boolean activo) {
        this.email = email;
        this.contrasenia = contrasenia;
        this.rol = rol;
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "com.mundodevp.sigpaco.model.Usuario[ id=" + id + " ]";
    }
    
}
