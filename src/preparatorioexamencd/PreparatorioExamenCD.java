package preparatorioexamencd;
import java.util.Scanner;
public class PreparatorioExamenCD {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Pedir ped = new Pedir();
    Mostrar mos = new Mostrar();
       //Pedimos el nombre y llamamos al metodo de setnombre
        System.out.println("Hola, cuál es tu nombre?");
        String nombre = ler.next();
        ped.setNombre(nombre);
    }
    
}
