package com.mundodevp.sigpaco.model;

import com.mundodevp.sigpaco.model.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2025-11-25T16:08:10")
@StaticMetamodel(Instructor.class)
public class Instructor_ extends Persona_ {

    public static volatile SingularAttribute<Instructor, String> cedula;
    public static volatile SingularAttribute<Instructor, Usuario> usuarioInst;
    public static volatile SingularAttribute<Instructor, String> carrera;

}