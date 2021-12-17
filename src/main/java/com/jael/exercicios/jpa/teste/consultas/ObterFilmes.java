package com.jael.exercicios.jpa.teste.consultas;

import java.util.List;

import com.jael.exercicios.jpa.infra.DAO;
import com.jael.exercicios.jpa.modelo.muitospramuitos.Filme;

public class ObterFilmes {

    public static void main(String[] args) {

        DAO<Filme> dao = new DAO<>(Filme.class);
        List<Filme> filmes = dao.consultar("filmesNotaMaiorQue", "nota", 8.5);

        for (Filme filme : filmes) {
            System.out.println(filme.getNome() + " (" + filme.getNota() + ")");
        }

    }

}
