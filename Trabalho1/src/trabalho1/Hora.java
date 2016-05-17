package trabalho1;

public class Hora {

//------------------Atributos-------------//
    private int horas;
    private int minutos;
    private int segundos;
    
//----------------Construtor--------------//
    Hora(int horas, int minutos, int segundos){
        if(this.validaHora(horas, minutos, segundos)){
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }
        else {
            this.horas = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }
    
//---------------Métodos------------------//
    public int getHoras() {
        return horas;
    }
    public int getMinutos() {
        return minutos;
    }
    public int getSegundos() {
        return segundos;
    }
    public void printHora(){
        System.out.printf("%d horas, 5d minutos e %d segundos", this.horas, this.minutos, this.segundos);
    }
    public void printHoraf(){
        System.out.printf("%d/%d/%d",this.horas, this.minutos, this.segundos);
    }
    public boolean validaHora (int horas, int minutos, int segundos){
        if(horas<24 && horas>=0 && minutos<60 && minutos>=0 && segundos<60 && segundos>=0){
            return true;
        }
        else return false;
    } 
}
