/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mundodevp.sigpaco.lib;

/**
 *
 * @author mundodevp
 */
public class Valid {
    
    public static boolean estanVacios(String correo,String contrasenia, String rol){
        return (correo.trim().isEmpty())&&(contrasenia.trim().isEmpty())
                && (rol.trim().isEmpty());
    }
    
}
