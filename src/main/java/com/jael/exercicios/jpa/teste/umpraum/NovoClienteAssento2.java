package com.jael.exercicios.jpa.teste.umpraum;

import com.jael.exercicios.jpa.infra.DAO;
import com.jael.exercicios.jpa.modelo.umpraum.Assento;
import com.jael.exercicios.jpa.modelo.umpraum.Cliente;

public class NovoClienteAssento2 {

    public static void main(String[] args) {

        Assento assento = new Assento("4C");
        Cliente cliente = new Cliente("Nathan Castelo", assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);

        dao.incluirAtomico(cliente).fecharDAO();

    }

}
