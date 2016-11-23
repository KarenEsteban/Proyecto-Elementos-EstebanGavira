/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author T-107
 */
@Entity
public class Direccion {
    @Id
    @GeneratedValue
    private Long id;
    private Long numero;
    private Long cp;
    private String colonia;

    public Direccion(Long id, Long numero, String colonia) {
        this.id = id;
        this.numero = numero;
        this.colonia = colonia;
    }

    public Direccion(Long id, Long numero, Long cp) {
        this.id = id;
        this.numero = numero;
        this.cp = cp;
    }
    
    public Direccion(Long numero, Long cp) {
        this.numero = numero;
        this.cp = cp;
    }

    public Direccion() {
    }

    public Direccion(Long id, Long numero, Long cp, String colonia) {
        this.id = id;
        this.numero = numero;
        this.cp = cp;
        this.colonia = colonia;
    }

    public Direccion(Long id) {
        this.id = id;
    }

    public Direccion(String colonia) {
        this.colonia = colonia;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Long getCp() {
        return cp;
    }

    public void setCp(Long cp) {
        this.cp = cp;
    }
    
    
    
}
