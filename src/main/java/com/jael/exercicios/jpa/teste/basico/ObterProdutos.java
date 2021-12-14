package com.jael.exercicios.jpa.teste.basico;

import java.util.List;

import com.jael.exercicios.jpa.infra.ProdutoDAO;
import com.jael.exercicios.jpa.modelo.basico.Produto;

public class ObterProdutos {

    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos();

        for (Produto produto : produtos) {
            System.out.println(produto.getId() + " => " + produto.getNome() + " R$" + produto.getPreco());
        }

        double precoTotal = produtos.stream().map(Produto::getPreco).reduce(0.0, (t, p) -> t + p).doubleValue();

        System.out.println("O valor total é R$" + precoTotal);

    }

}
