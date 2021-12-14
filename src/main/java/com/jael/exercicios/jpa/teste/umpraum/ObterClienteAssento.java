package com.jael.exercicios.jpa.teste.umpraum;

import com.jael.exercicios.jpa.infra.DAO;
import com.jael.exercicios.jpa.modelo.umpraum.Assento;
import com.jael.exercicios.jpa.modelo.umpraum.Cliente;

public class ObterClienteAssento {

    public static void main(String[] args) {

        DAO<Cliente> daoCliente = new DAO<>(Cliente.class);

        Cliente cliente = daoCliente.obterPorID(1L);
        System.out.println(cliente.getAssento().getNome());
        daoCliente.fecharDAO();

        DAO<Assento> daoAssento = new DAO<>(Assento.class);

        Assento assento = daoAssento.obterPorID(1L);
        System.out.println(assento.getCliente().getNome());
        daoAssento.fecharDAO();

    }

}
