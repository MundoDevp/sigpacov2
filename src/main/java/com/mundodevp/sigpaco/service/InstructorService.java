/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mundodevp.sigpaco.service;

import com.mundodevp.sigpaco.bl.InstructorBL;
import com.mundodevp.sigpaco.bl.UsuarioBL;
import com.mundodevp.sigpaco.model.Instructor;
import java.util.List;

/**
 *
 * @author mundodevp
 */
public class InstructorService {
    private final InstructorBL instructorBL;
    private final UsuarioBL usuarioBL;

    public InstructorService() {
        this.instructorBL = new InstructorBL();
        this.usuarioBL = new UsuarioBL();
    }
    
    public boolean crear(Instructor instructor){
        if(!usuarioBL.existeUsuario(instructor.getUsuarioInst().getEmail())){
            instructorBL.crear(instructor);
            return true;
        }
        return false;
    }
    
    public List<Instructor>listar(){
        return instructorBL.listar();
    }
    
    public Instructor obtenerInstructor(long id){
        return instructorBL.getInstructor(id);
    }
    
    public Instructor buscarId(long id){
        return instructorBL.buscarId(id);
    }
    
    public boolean eliminar(long id){
        return instructorBL.eliminar(id);
    }
    
    public boolean editar(Instructor instructor){
        return instructorBL.editar(instructor);
    }
    
    
    
}
