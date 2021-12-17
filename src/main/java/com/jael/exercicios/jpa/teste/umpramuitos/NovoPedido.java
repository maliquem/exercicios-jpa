package com.jael.exercicios.jpa.teste.umpramuitos;

import com.jael.exercicios.jpa.infra.DAO;
import com.jael.exercicios.jpa.modelo.basico.Produto;
import com.jael.exercicios.jpa.modelo.umpramuitos.ItemPedido;
import com.jael.exercicios.jpa.modelo.umpramuitos.Pedido;

public class NovoPedido {

    public static void main(String[] args) {

        DAO<Object> dao = new DAO<>();

        Produto produto = new Produto("Geladeira", 3899.99);
        Pedido pedido = new Pedido();
        ItemPedido item = new ItemPedido(pedido, produto, 5);

        dao.incluirAtomico(item).fecharDAO();

    }

}
