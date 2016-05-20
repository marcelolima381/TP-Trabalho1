package trabalho1;

public class Gerente extends Funcionario {

    private String senhaDoSistema;

    public void bonificacao() {
        this.capital += this.salario*1.5;
    }
    public void pagamento() {
        this.capital += this.salario;
    }
    public void contrata(Funcionario novoFuncionario){
        this.empregador.addFuncionario(novoFuncionario);
    }
}
