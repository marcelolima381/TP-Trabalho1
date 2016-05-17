package trabalho1;

public class Garcon extends Funcionario {

//-------------------Atributos--------------------//
    private Mesa[] atendendo;

//------------------Construtor--------------------//
    Garcon(String nome, String cpf, int idade, Data dataDeNascimento, Hora chegada, Hora saida, double salario, Restaurante empregador){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.dataDeNascimento = dataDeNascimento;
        this.capital = 0;
        this.horarioDeChegada = chegada;
        this.horarioDeSaida = saida;
        this.salario = salario;
        this.empregador = empregador;
        Funcionario.codigoDeFuncionario += 1;
        this.codigo = Funcionario.codigoDeFuncionario;
    }
    
//-----------------Métodos-----------------------//
    public void bonificacao() {
        this.capital += this.salario*1.2;
    }
    public void pagamento() {
        this.capital += this.salario;
    }
    public void fazPedido (Prato pedido){
        this.empregador.addPrato(pedido);
    }
}
