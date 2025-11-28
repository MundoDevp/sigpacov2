/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mundodevp.sigpaco.service;

import com.mundodevp.sigpaco.bl.EstudianteBL;

/**
 *
 * @author mundodevp
 */
public class EstudianteService {
    private final EstudianteBL estudianteBl;

    public EstudianteService() {
        this.estudianteBl = new EstudianteBL();
    }
    
    public int contarEstudiantes(){
        return estudianteBl.contarEstudiantes();
    }
    
    
    
}
