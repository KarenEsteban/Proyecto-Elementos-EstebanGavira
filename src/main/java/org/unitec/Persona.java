/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author T-107
 */
@Entity
public class Persona {
    @Id
    @GeneratedValue
    private Long id;
    
    @OneToOne
    @JoinColumn(name="id_direccion")
    private Direccion dire;
    private String nombre;
    private String telefono;

    public Persona() {
    }

    public Persona(Long id, Direccion dire, String nombre, String telefono) {
        this.id = id;
        this.dire = dire;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Persona(Long id) {
        this.id = id;
    }

    public Persona(Direccion dire) {
        this.dire = dire;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(Long id, Direccion dire) {
        this.id = id;
        this.dire = dire;
    }

    public Persona(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Persona(Long id, Direccion dire, String nombre) {
        this.id = id;
        this.dire = dire;
        this.nombre = nombre;
    }

    public Persona(Long id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Persona(Direccion dire, String nombre) {
        this.dire = dire;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Direccion getDire() {
        return dire;
    }

    public void setDire(Direccion dire) {
        this.dire = dire;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
}
