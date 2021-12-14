package com.jael.exercicios.jpa.infra;

import com.jael.exercicios.jpa.modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto> {

    public ProdutoDAO() {
        super(Produto.class);
    }

}
