public class Main {
    public static void main(String[] args) {
        suma(1,2,3);
        Coche miCoche= new Coche();
        miCoche.incrementarPuerta();
        System.out.println("Numero de Puertas: " + miCoche.numeroPuertas);
    }
    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}
class Coche {
    public int numeroPuertas = 4;

    public void incrementarPuerta() {
        this.numeroPuertas++;
    }
}
