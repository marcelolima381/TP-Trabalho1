package trabalho1;

public class Data {

//--------------------Atributos-------------//
    private int dia;
    private int mes;
    private int ano;
    
//------------------Construtor--------------//
    Data(int dia, int mes, int ano){
        if(this.validaData(dia, mes, ano)){
            this.ano = ano;
            this.dia = dia;
            this.mes = mes;
        }
        else {
            this.ano = 0;
            this.dia = 0;
            this.mes = 0;
        }
    }
    
//---------------------métodos-------------//
    private boolean validaData (int dia, int mes, int ano) {
        if(mes>12 || mes<=0){
            return false;
        }
        if(dia>31 || dia<=0){    //Entao o dia pode ser 0? e os meses com 30 dias, podem ter um 31o?
            return false;
        }
        if ((mes==4 || mes==6 || mes==9 || mes==11) && (dia>30 || dia<1)) {
            return false;
        }
        if((mes==2 && (dia>28 || dia<1) )||( mes==2 && (dia>29 || dia<1) && ano%4!=0)){
            return false;
        }
        return true;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAno() {
        return ano;
    }
    
}
