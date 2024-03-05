package com.co.demo.entity;

import java.io.Serializable;
import jakarta.persistence.*;


@Entity
@Table(name="datosFormulario")
public class DatosFormulario implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombres;
    private String apellidos;
    private String correo;
    private int semestre;
    private String descripcion;
    public long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getNombres(){
        return nombres;
    }
    public void setNombres(String nombres){
        this.nombres = nombres;
    }

    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }

    public int getSemestre(){
        return semestre;
    }
    public void setSemestre(int semestre){
        this.semestre = semestre;
    }


    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    @Override
    public String toString(){
        return "DatosFormulario [id=" + id + ", nombre=" + nombres +", apellidos= " + apellidos +", correo= " + correo +", semestre= " + semestre + ", descripcion= " + descripcion + "]";
    }

    
    
}