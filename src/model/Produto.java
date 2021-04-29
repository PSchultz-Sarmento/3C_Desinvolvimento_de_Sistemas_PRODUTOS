package model;

public class Produto { //classe abstrata do produto

	//ATRIBUTOS
    String nome;
    double preco;

    //GETTERS E SETTER
    public String getNome(){
        return this.nome;
    }

    public  void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public String toString() { //TOSTRING DO NOME E PREÇO DO PRODUTO
        return "\nProduto: "+nome+"\nPreço: R$"+preco + "\n";
    }
}