package trabalho1;

public abstract class Funcionario extends Pessoa implements FuncionarioRemunerado {

    protected Hora horarioDeChegada;
    protected Hora horarioDeSaida;
    protected double salario;
    protected static int codigoDeFuncionario = 0;
    protected int codigo;
    protected Restaurante empregador;
}
