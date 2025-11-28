/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mundodevp.sigpaco.bl;

import com.mundodevp.sigpaco.model.Instructor;
import com.mundodevp.sigpaco.persistence.InstructorJpaController;
import com.mundodevp.sigpaco.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mundodevp
 */
public class InstructorBL {
    private final InstructorJpaController instructorJpa;

    public InstructorBL() {
        this.instructorJpa = new InstructorJpaController();
    }
    
    public void crear(Instructor instructor){
        instructorJpa.create(instructor);
    }
    
    public List<Instructor> listar(){
        return instructorJpa.findInstructorEntities();
    }
    
    public Instructor getInstructor(long id){
        for(Instructor ins : listar()){
            if(ins.getId()== id){
                return ins;
            }
        }
        return null;
    }
    
    public Instructor buscarId(long id){
        return instructorJpa.findInstructor(id);
    }
    
    public boolean eliminar(long id){
        try {
            instructorJpa.destroy(id);
            return true;
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(InstructorBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
     
    public boolean editar(Instructor instructor){
        try {
            instructorJpa.edit(instructor);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(InstructorBL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
     }
    
    public int contarInstructores(){
        return listar().size();
        
    }
   
    
}
