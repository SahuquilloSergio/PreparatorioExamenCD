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
        System.out.println("Ultimo intento");
        System.out.println("Me voy a hacer un commit D en una clase nueva");
    }
    
}
