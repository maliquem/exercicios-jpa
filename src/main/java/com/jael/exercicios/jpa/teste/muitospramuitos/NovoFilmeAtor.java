package com.jael.exercicios.jpa.teste.muitospramuitos;

import com.jael.exercicios.jpa.infra.DAO;
import com.jael.exercicios.jpa.modelo.muitospramuitos.Ator;
import com.jael.exercicios.jpa.modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

    public static void main(String[] args) {

        Filme f1 = new Filme("The Godfather", 10);
        Filme f2 = new Filme("Dune", 9);
        Filme f3 = new Filme("Apocalypse Now", 10);

        Ator a1 = new Ator("Marlon Brandon");
        Ator a2 = new Ator("Zandaya");
        Ator a3 = new Ator("Al Pacino");

        f1.adicionarAtor(a1);
        f1.adicionarAtor(a3);
        f2.adicionarAtor(a2);
        f3.adicionarAtor(a1);

        DAO<Filme> dao = new DAO<>();

        dao.incluirAtomico(f1).incluirAtomico(f2).incluirAtomico(f3).fecharDAO();

    }

}
