package com.api_futbol.futbolistas_api.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "futbolista")
public class FutbolistaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String caracteristicas;

    @ManyToOne
    @JoinColumn(name = "posicion_id")
    private PosicionModel posicion;

    public PosicionModel getPosicion() {
        return posicion;
    }

    public void setPosicion(PosicionModel posicion) {
        this.posicion = posicion;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    
    
    
}
