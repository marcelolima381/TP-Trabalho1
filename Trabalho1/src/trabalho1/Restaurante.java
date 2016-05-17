package trabalho1;

public class Restaurante {

//--------------Atributos-------------//
    private Mesa[] mesas;
    private String nome;
    private String cnpj;
    private Funcionario[] crew;
    private Prato[] pedidos;
    private double capital;

//-------------Construtor----------------//
    Restaurante(String nome, String cnpj, Gerente gerente){
        this.nome = nome;
        this.cnpj = cnpj;
        this.crew = new Funcionario[1];
        this.crew[0] = gerente;
    }
    
//-------------Métodos-------------------//
    public Prato getPrato(int index) {
        return pedidos[index];
    }
    public void preparaPrato(int index){
        for(int i = index+1; i < this.pedidos.length; i+=1){
            if(i>0){
                this.pedidos[i-1] = this.pedidos[i];
            }
            if(i==this.pedidos.length-1){
                this.pedidos[i] = null;
            }
        }
    }
    public void addPrato(Prato novoPedido) {
        if(this.pedidos == null){
            this.pedidos = new Prato[1];
            this.pedidos[0] = novoPedido;
        }
        else{
            Prato[] novaLista = new Prato[this.pedidos.length+1];
            for(int i = 0; i < this.pedidos.length; i += 1){
                novaLista[i] = this.pedidos[i];
            }
            novaLista[this.pedidos.length] = novoPedido;
            this.pedidos = novaLista;
        }
    }
    public void recebePagamento(double pagamento){
        this.capital += pagamento;
    }
    public void addMesa(Mesa novaMesa){
        if(this.mesas == null){
            this.mesas = new Mesa[1];
            this.mesas[0] = novaMesa;
        }
        else{
            Mesa[] novaLista = new Mesa[this.mesas.length+1];
            for(int i = 0; i < this.mesas.length; i += 1){
                novaLista[i] = this.mesas[i];
            }
            novaLista[this.mesas.length] = novaMesa;
        }
    }
}
