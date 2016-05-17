package trabalho1;

public class Hora {

//------------------Atributos-------------//
    private int horas;
    private int minutos;
    private int segundos;
    
//----------------Construtor--------------//
    Hora(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
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
    
}
