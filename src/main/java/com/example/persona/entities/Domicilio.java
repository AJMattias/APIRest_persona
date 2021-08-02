package com.example.persona.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "domicilio")
@Audited
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Domicilio extends Base{

    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private int numero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
/*
    public Domicilio() {
    }

    public Domicilio(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public Domicilio(String calle, int numero, Localidad localidad) {
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
    }

    public Domicilio(Long id, String calle, int numero, Localidad localidad) {
        super(id);
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    */
}
