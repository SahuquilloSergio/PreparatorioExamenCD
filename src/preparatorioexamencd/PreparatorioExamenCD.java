package preparatorioexamencd;

import java.util.Scanner;
/**
 *
 * @author Sergio "Sauky" Sahuquillo & abrandarizdominguez
 */
public class PreparatorioExamenCD {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Pedir ped = new Pedir();
    
       //Pedimos el nombre y llamamos al metodo de setnombre
        System.out.println("Hola, cuál es tu nombre?");
        String nombre = ler.next();
        ped.setNombre(nombre);
        ped.getNombre();
        // Se instancia un objeto de tipo Mostrar y llamo al método "saludar"
        Mostrar mos = new Mostrar(nombre);
        mos.saludar(nombre);
        mos.toString();
        System.out.println("Menudo timo, devuelvanme mi dinero");
            System.out.println("Eso, eso");
    }
    
}
