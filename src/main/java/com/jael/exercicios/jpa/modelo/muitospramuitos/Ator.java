package com.jael.exercicios.jpa.modelo.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Ator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(mappedBy = "atores")
    private List<Filme> filmes = new ArrayList<>();

    public Ator() {
    }

    public Ator(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Filme> getFilmes() {
        return this.filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

}