package com.jael.exercicios.jpa.teste.umpramuitos;

import com.jael.exercicios.jpa.infra.DAO;
import com.jael.exercicios.jpa.modelo.umpramuitos.ItemPedido;
import com.jael.exercicios.jpa.modelo.umpramuitos.Pedido;

public class ObterPedido {

    public static void main(String[] args) {

        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorID(1L);

        for (ItemPedido item : pedido.getItens()) {
            System.out.println(item.getQuantidade());
            System.out.println(item.getProduto().getNome());
        }

        dao.fecharDAO();
    }

}
