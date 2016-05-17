package trabalho1;

public class Prato {

//----------------Atributos----------------//
    private String nome;
    private double preco;
    private String ingredientes;
    
//--------------Construtor----------------//
    Prato(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
//---------------Métodos-----------------//

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public String getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    
}
