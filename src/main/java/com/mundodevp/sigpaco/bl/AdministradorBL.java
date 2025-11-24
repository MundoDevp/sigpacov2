/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mundodevp.sigpaco.bl;

import com.mundodevp.sigpaco.model.Administrador;
import com.mundodevp.sigpaco.persistence.AdministradorJpaController;


/**
 *
 * @author mundodevp
 */
public class AdministradorBL {
    private final AdministradorJpaController adminJpa;

    public AdministradorBL() {
        adminJpa = new AdministradorJpaController();
    }
    
    public void crear(Administrador admin){
        adminJpa.create(admin);
    }
    
    
    
}
