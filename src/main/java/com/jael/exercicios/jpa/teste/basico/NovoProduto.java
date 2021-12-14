package com.jael.exercicios.jpa.teste.basico;

import com.jael.exercicios.jpa.infra.DAO;
import com.jael.exercicios.jpa.modelo.basico.Produto;

public class NovoProduto {

    public static void main(String[] args) {

        Produto p1 = new Produto("GeForce RTX 2060", 4899.99);
        Produto p2 = new Produto("TV OLED", 6499.99);
        Produto p3 = new Produto("Impressora Lexmark MX722", 3299.99);
        Produto p4 = new Produto("Monitor SAMSUNG Odyssey G5", 2899.99);
        DAO<Produto> dao = new DAO<>(Produto.class);

        dao.incluirAtomico(p1);
        dao.incluirAtomico(p2);
        dao.incluirAtomico(p3);
        dao.incluirAtomico(p4).fecharDAO();
        ;
    }

}
