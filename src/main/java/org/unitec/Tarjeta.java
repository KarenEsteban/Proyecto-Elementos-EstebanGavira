/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author T-107
 */
@Entity
public class Tarjeta {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Clientes clien;
    private String tipo;
    private float saldo;
    private Date fecha_c;

    public Tarjeta() {
    }

    public Tarjeta(Long id, Clientes clien, String tipo, float saldo, Date fecha_c) {
        this.id = id;
        this.clien = clien;
        this.tipo = tipo;
        this.saldo = saldo;
        this.fecha_c = fecha_c;
    }

    public Tarjeta(Long id) {
        this.id = id;
    }

    public Tarjeta(Clientes clien, String tipo, float saldo, Date fecha_c) {
        this.clien = clien;
        this.tipo = tipo;
        this.saldo = saldo;
        this.fecha_c = fecha_c;
    }

    public Tarjeta(Date fecha_c) {
        this.fecha_c = fecha_c;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Clientes getClien() {
        return clien;
    }

    public void setClien(Clientes clien) {
        this.clien = clien;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Date getFecha_c() {
        return fecha_c;
    }

    public void setFecha_c(Date fecha_c) {
        this.fecha_c = fecha_c;
    }
   
    
    
}
