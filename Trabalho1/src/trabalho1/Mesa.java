package trabalho1;

public class Mesa {

//--------------------Atributos-------------//
    private Cliente[] clientes;
    private int lugares;
    private double contaDaMesa;
    private Garcon atendendo;
    private Restaurante estabelecimento;
    
    
//-----------------Construtor--------//
    Mesa(int lugares, Garcon atendente, Restaurante estabelecimento){
        this.lugares = lugares;
        this.atendendo = atendente;
        this.estabelecimento = estabelecimento;
    }
    
//-------------Métodos---------------//
    public void clienteAcomodado(Cliente novoCliente) {
        if(this.clientes == null){
            clientes = new Cliente[1];
            clientes[0] = novoCliente;
        }
        else if(this.clientes.length==this.lugares){
            System.out.println("Não há espaço suficiente na mesa");
        }
        else{
            Cliente[] novaLista = new Cliente[this.clientes.length+1];
            for(int i = 0; i < this.clientes.length; i += 1){
                novaLista[i] = this.clientes[i];
            }
            novaLista[this.clientes.length] = novoCliente;
            this.clientes = novaLista;
        }
    }
    public void clienteVazou() {
    }
    public void pagaContaDaMesa() {
        double conta=0;
        for(int i = 0; i < this.clientes.length; i += 1){
            conta += this.clientes[i].getContaPessoal();
        }
        double media = conta/this.clientes.length;
        for(int i = 0; i < this.clientes.length; i += 1){
            this.clientes[i].pagaContaDaMesa(media);
            this.estabelecimento.recebePagamento(conta);
        }
    }
    public void fazPedido(Prato pedido){
        this.atendendo.fazPedido(pedido);
    }
}
