package com.jael.exercicios.jpa.teste.heranca;

import com.jael.exercicios.jpa.infra.DAO;
import com.jael.exercicios.jpa.modelo.heranca.Aluno;
import com.jael.exercicios.jpa.modelo.heranca.AlunoBolsista;

public class NovoAluno {

    public static void main(String[] args) {

        DAO<Aluno> DAOAluno = new DAO<>();

        Aluno aluno1 = new Aluno(2468L, "Henrique Keven");
        AlunoBolsista aluno2 = new AlunoBolsista(2398L, "Roberto Dias", 2000);

        DAOAluno.incluirAtomico(aluno1);
        DAOAluno.incluirAtomico(aluno2);
        DAOAluno.fecharDAO();
    }

}
