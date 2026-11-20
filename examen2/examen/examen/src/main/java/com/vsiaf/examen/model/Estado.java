package com.vsiaf.examen.model;

import jakarta.persistence.*;

@Entity
@Table(name = "estado")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codestado")
    private Long codestado;

    @Column(name = "nomestado")
    private String nomestado;

    public Estado() {}

    public Estado(Long codestado, String nomestado) {
        this.codestado = codestado;
        this.nomestado = nomestado;
    }

    public Long getCodestado() { return codestado; }
    public void setCodestado(Long codestado) { this.codestado = codestado; }

    public String getNomestado() { return nomestado; }
    public void setNomestado(String nomestado) { this.nomestado = nomestado; }
}