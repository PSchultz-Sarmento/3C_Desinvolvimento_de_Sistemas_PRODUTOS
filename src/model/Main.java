package model;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
    	
    	ArrayList<Produto> produtos = new ArrayList<>(); // ARRAY DE PRODUTOS
    	
    	Produto produto = new Produto();//DEFINE O NOME INTERNO DO PRODUTO
        produto.setNome("Salgado");//NOME DO PRODUTO
        produto.setPreco(3);//PREÇO DO PRODUTO
        
        Produto produto2 = new Produto();
        produto2.setNome("Suco");
        produto2.setPreco(1);
        
        Produto produto3 = new Produto();
        produto3.setNome("Doce");
        produto3.setPreco(2.50);
        
        produtos.add(produto); //ADICIONA AO ARRAY
        produtos.add(produto2);
        produtos.add(produto3);
        
        System.out.println(produtos); // PRINTA A PRIMEIRA LISTA, COM OS 3 PRODUTOS
        
        produtos.remove(2);//REMOVE O ITEM NA POSIÇÃO DESEJADA
        
        System.out.println(produtos); // PRINTA A LISTA NOVAMENTE
    }

}