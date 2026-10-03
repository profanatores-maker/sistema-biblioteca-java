import java.util.Scanner; // permite utilizar el comando Scanner
// scanner es una clase de Java que permite leer datos ingresados por el usuario u otras fuentes

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // creamos un objeto de tipo Scanner llamado "entrada"

        System.out.println("=== SISTEMA DE BIBLIOTECA ===");
        System.out.println();

        // Solicitar información del libro
        System.out.print("Ingresa el título del libro: ");
        String titulo = entrada.nextLine(); // el programa espera que el usuario escriba datos

        System.out.print("Ingresa el autor: ");
        String autor = entrada.nextLine(); // el programa espera que el usuario escriba datos

        System.out.print("Ingresa la categoría: ");
        String categoria = entrada.nextLine(); // el programa espera que el usuario escriba datos

        // Libro es la clase, libro es el objeto que estamos creando, new indica que queremos crear un nuevo objeto 
        // y los valores entre paréntesis se envían al constructor para inicializar sus atributos.
        Libro libro = new Libro(titulo, autor, categoria);

        System.out.println();
        System.out.println("=== INFORMACIÓN DEL LIBRO ===");

        // Mostrar información
        libro.mostrarInformacion();

        entrada.close();
    }
}

class Libro { // Se crea la clase "Libro"
    // Se crean los atributos de la clase "Libro"
    // los atributos en cierto modo son variables de una clase, ya que son los datos de cada objeto
    String titulo;
    String autor;
    String categoria;

    // Se crea el constructor
    public Libro(String titulo, String autor, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    } // "Los atributos son variables que representan las características de un objeto. 
     // En este caso, un libro tiene título, autor y categoría. 
     // El constructor se utiliza al crear el objeto para inicializar esos atributos con los valores que le proporcionamos."

    // Se crea el método "mostrarInformacion"
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Categoría: " + categoria);
    }
}