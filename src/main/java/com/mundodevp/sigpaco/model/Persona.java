/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mundodevp.sigpaco.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author mundodevp
 */
@Entity
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String foto;

    public Persona() {
       this.nombre = "Sin nombre";
       this.apellidos = "Sin apellidos";
       this.telefono = "000-000-0000";
       this.foto = "default.jpg";
    }
    
    public Persona(String nombre, String apellidos, String telefono, String foto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.foto = foto;
    }

    public Persona(Long id, String nombre, String apellidos, String telefono, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.foto = foto;
    }
    
    

}
