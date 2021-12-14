package com.jael.exercicios.jpa.teste.umpraum;

import com.jael.exercicios.jpa.infra.DAO;
import com.jael.exercicios.jpa.modelo.umpraum.Assento;
import com.jael.exercicios.jpa.modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

    public static void main(String[] args) {

        Assento assento = new Assento("14C");
        Cliente cliente = new Cliente("Henrique Keven", assento);

        DAO<Object> dao = new DAO<>();

        dao.abrirT().incluirT(assento).incluirT(cliente).fecharT().fecharDAO();
    }

}
