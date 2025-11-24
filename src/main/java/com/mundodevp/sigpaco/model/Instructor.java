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
import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author mundodevp
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Instructor extends Persona implements Serializable  {

    private static final long serialVersionUID = 1L;
    private String carrera;
    private String cedula;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="USUARIO_ID")
    private Usuario usuarioInst;

    public Instructor(Long id, String nombre, String apellidos, String telefono, String foto,String carrera, String cedula) {
        super(id, nombre, apellidos, telefono, foto);
        this.carrera = carrera;
        this.cedula = cedula;
    }

    public Instructor(String nombre, String apellidos, String telefono, String foto,String carrera, String cedula, Usuario usuario) {
        super(nombre, apellidos, telefono, foto);
        this.carrera = carrera;
        this.cedula = cedula;
        this.usuarioInst = usuario;
        
    }
    
    
    
    
    
    
    
}
