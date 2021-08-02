package com.example.persona.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "localidad")
@Audited
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Localidad extends Base{
    @Column(name = "denominacion")
    private String denominacion;
/*
    public Localidad(Long id, String denominacion) {
        super(id);
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
*/
}

