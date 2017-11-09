package preparatorioexamencd;
/**
 *
 * @author Sergio "Sauky" Sahuquillo & abrandarizdominguez
 */
public class Mostrar {
    private String nombre;
    // Constructor por defecto:
    // Constructor por parámetros:
    public Mostrar(String nom){
        nom = nombre;
    }
    // Método que recibe el nombre y muestra un saludo
    public String saludar (String nom){
        nom = nombre;
        System.out.println("Hola " +nombre+"haz el examen de COD por mi.\n PD: Damián apruébanos.");
        return nombre;
       
        //System.out.println("Hola "+nom+", haz el examen de COD por mi.\n PD: Damián apruébanos.");
       }
    @Override
    public String toString(){
        return ("Hola "+nombre+", Damián dijo que tenía que aparecer ésto.");
    }
    
}
