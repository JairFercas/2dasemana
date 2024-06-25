package com.idat.segundadasemana.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblPersona")
// -> Pasa a .....
public class Persona { //1) Se crean el modelo -> interfaces del modelo
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    @Column(name = "nombres", nullable = false, length = 50)
    private String nombres;
    @Column(name = "apellidos", nullable = false, length = 50)    
    private String apellidos;

    public Long getIdPersona() {
        return idPersona;
    }
    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
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

    
    
}
