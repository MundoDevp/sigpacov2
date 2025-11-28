/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mundodevp.sigpaco.bl;

import com.mundodevp.sigpaco.model.Estudiante;
import com.mundodevp.sigpaco.persistence.EstudianteJpaController;
import java.util.List;

/**
 *
 * @author mundodevp
 */
public class EstudianteBL {
    private final EstudianteJpaController estudianteJpa;

    public EstudianteBL() {
        this.estudianteJpa = new EstudianteJpaController();
    }
    public List<Estudiante>listar(){
        return estudianteJpa.findEstudianteEntities();
    }
    public int contarEstudiantes(){
        return listar().size();
    }
    
    
    
}
