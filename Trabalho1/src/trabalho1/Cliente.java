package trabalho1;

public class Cliente extends Pessoa {

//-------------------Atributos--------------//
    private double contaPessoal;
    private Restaurante estabelicimento;
    private boolean contaPaga;
    private Mesa suaMesa;

//------------------Construtor--------------//
    Cliente(String nome, String cpf, int idade, Data dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.dataDeNascimento = dataDeNascimento;
        this.capital = 0;
    }
    
//------------------Métodos----------------//
    public void pagaContaPessoal() {
        this.capital -= this.getContaPessoal();
        this.estabelicimento.recebePagamento(getContaPessoal());
        contaPessoal = 0;
    }
    public void pagaContaDaMesa (double conta) {
        this.capital -= conta;
        this.contaPessoal = 0;
    }
    public boolean verificaPagamento(){
        if(this.getContaPessoal() == 0){
            return true;
        }
        else return false;
    }
    public void fazPedido(Prato pedido) {
        this.contaPessoal += pedido.getPreco();
        this.suaMesa.fazPedido(pedido);
    }
    public double getContaPessoal() {
        return contaPessoal;
    }
    
}
