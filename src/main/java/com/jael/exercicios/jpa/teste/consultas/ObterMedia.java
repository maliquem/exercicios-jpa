package com.jael.exercicios.jpa.teste.consultas;

import com.jael.exercicios.jpa.infra.DAO;
import com.jael.exercicios.jpa.modelo.consulta.NotaFilme;

public class ObterMedia {

    public static void main(String[] args) {

        DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
        NotaFilme nota = dao.consultarUm("obterMediaGeralDosFilmes");

        System.out.println(nota.getMedia());

        dao.fecharDAO();
    }

}
