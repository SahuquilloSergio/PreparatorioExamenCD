package preparatorioexamencd;

import java.util.Scanner;
/**
 *
 * @author Sergio "Sauky" Sahuquillo & abrandarizdominguez
 */
public class PreparatorioExamenCD {

    public static void main(String[] args) {
        // Se instancia un objeto de tipo Scanner
        Scanner ler = new Scanner(System.in);
        // Se instancia un objeto de tipo Pedir
        Pedir ped = new Pedir();
        // Se pide el nombre
        System.out.println("Hola, cuál es tu nombre?");
        String nombre = ler.next();
        ped.setNombre(nombre);
        // Se instancia un objeto de tipo Mostrar y llamo al método "saludar"
        Mostrar mos = new Mostrar();
        mos.saludar(nombre);
    }
    
}
