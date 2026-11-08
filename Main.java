import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=== SISTEMA DE BIBLIOTECA ===");
        // REGISTRO DE UNA NOVELA
        System.out.println("\n=== REGISTRAR NOVELA ===");
        System.out.print("Título: ");
        String tituloNovela = entrada.nextLine();
        System.out.print("Autor: ");
        String autorNovela = entrada.nextLine();
        System.out.print("Categoría: ");
        String categoriaNovela = entrada.nextLine();
        System.out.print("Género literario: ");
        String genero = entrada.nextLine();

        // Creamos un objeto de la clase Novela
        Novela novela = new Novela(tituloNovela, autorNovela, categoriaNovela, genero);

        // REGISTRO DE UN LIBRO ESCOLAR
        System.out.println("\n=== REGISTRAR LIBRO ESCOLAR ===");
        System.out.print("Título: ");
        String tituloEscolar = entrada.nextLine();
        System.out.print("Autor: ");
        String autorEscolar = entrada.nextLine();
        System.out.print("Categoría: ");
        String categoriaEscolar = entrada.nextLine();
        System.out.print("Materia: ");
        String materia = entrada.nextLine();
        System.out.print("Grado escolar: ");
        String grado = entrada.nextLine();

        // Creamos un objeto de la clase LibroEscolar
        LibroEscolar libroEscolar = new LibroEscolar(tituloEscolar, autorEscolar, categoriaEscolar,materia, grado);

        // metodo para MOSTRAR INFORMACIÓN DE LOS LIBROS
        System.out.println("\n=== INFORMACIÓN DE LOS LIBROS ===");
        novela.mostrarInformacion(); // Muestra los datos de la novela
        novela.describirNovela();    // Ejecuta un método exclusivo de Novela

        System.out.println();
        libroEscolar.mostrarInformacion(); // Muestra los datos del libro escolar
        libroEscolar.describirContenido(); // Ejecuta un método exclusivo de LibroEscolar
        entrada.close();
    }
}
// CLASE BASE
class Libro {
    // Atributos compartidos por las clases derivadas
    String titulo;
    String autor;
    String categoria;

    // Constructor de la clase base
    public Libro(String titulo, String autor, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }
    // Método heredado por las clases derivadas
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Categoría: " + categoria);
    }
}
// CLASE DERIVADA: NOVELA
class Novela extends Libro { // Hereda los atributos y métodos de Libro

    String genero; // Atributo exclusivo de Novela

    // Constructor de la clase derivada
    public Novela(String titulo, String autor,
                  String categoria, String genero) {

        super(titulo, autor, categoria); // Inicializa los atributos heredados

        this.genero = genero; // Inicializa el atributo propio de Novela
    }
    // Sobrescribe el método heredado de Libro
    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion(); // Reutiliza el método de la clase base

        System.out.println("Género literario: " + genero); // Agrega el género
    }
    // Método exclusivo de la clase Novela
    public void describirNovela() {
        System.out.println("Este libro pertenece al género de novela.");
    }
}
// CLASE DERIVADA: LIBRO ESCOLAR
class LibroEscolar extends Libro { // Hereda los atributos y métodos de Libro
    String materia; // Atributo exclusivo de LibroEscolar
    String grado;   // Otro atributo exclusivo de LibroEscolar

    // Constructor de la clase derivada
    public LibroEscolar(String titulo, String autor,
                        String categoria, String materia,
                        String grado) {

        super(titulo, autor, categoria); // Inicializa los atributos heredados

        this.materia = materia; // Inicializa el atributo materia
        this.grado = grado;     // Inicializa el atributo grado
    }
    // Sobrescribe el método heredado de Libro
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Reutiliza el método de la clase base

        System.out.println("Materia: " + materia); // Agrega la materia
        System.out.println("Grado escolar: " + grado); // Agrega el grado
    }

    // Método exclusivo de la clase LibroEscolar
    public void describirContenido() {
        System.out.println("Este libro es utilizado como material escolar.");
    }
}