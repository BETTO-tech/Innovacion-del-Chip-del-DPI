package com.mycompany.uso_dpi.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paciente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_persona;
    private String cui;
    private String nombres;
    private String apellidos;
    private String edad;
    private String tipo_sangre;
    private String alergias;
    private String cronica;    
    private String fechanac;

    public Paciente() {
    }

    public Paciente(int id_persona, String cui, String nombres, String apellidos, String edad, String fechanac, String tipo_sangre, String alergias, String cronica) {
        this.id_persona = id_persona;
        this.cui = cui;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fechanac = fechanac;
        this.tipo_sangre = tipo_sangre;
        this.alergias = alergias;
        this.cronica = cronica;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getCronica() {
        return cronica;
    }

    public void setCronica(String cronica) {
        this.cronica = cronica;
    }
    
    
}
