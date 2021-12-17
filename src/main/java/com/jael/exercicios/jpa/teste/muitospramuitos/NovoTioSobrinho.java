package com.jael.exercicios.jpa.teste.muitospramuitos;

import com.jael.exercicios.jpa.infra.DAO;
import com.jael.exercicios.jpa.modelo.muitospramuitos.Sobrinho;
import com.jael.exercicios.jpa.modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

    public static void main(String[] args) {

        Tio t1 = new Tio("Branco Nobre Rabelo");
        Tio t2 = new Tio("Ivan Nobre Rabelo");

        Sobrinho s1 = new Sobrinho("Taline Araripe Rabelo");
        Sobrinho s2 = new Sobrinho("Jael Araripe Rabelo");

        t1.getSobrinhos().add(s1);
        s1.getTios().add(t1);

        t1.getSobrinhos().add(s2);
        s2.getTios().add(t1);

        t2.getSobrinhos().add(s1);
        s1.getTios().add(t2);

        t2.getSobrinhos().add(s2);
        s2.getTios().add(t2);

        DAO<Object> dao = new DAO<>();

        dao.abrirT().incluirT(t1).incluirT(t2).incluirT(s1).incluirT(s2).fecharT().fecharDAO();

    }

}
