package preparatorioexamencd;
import java.util.Scanner;
public class PreparatorioExamenCD {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Pedir ped = new Pedir();
    Mostrar mos = new Mostrar();
    
        System.out.println("Hola, cuál es tu nombre?");
        nombre = ler.next();
        ped.setNombre(nombre);
    }
    
}
