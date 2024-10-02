import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el nombre de tu pelicula: ");
        String nombre = scanner.nextLine();
        System.out.println("Escrbie la fecha de lanzamiento: ");
        int fechaLanzamineto = scanner.nextInt();
        System.out.println("Escrbie la nota que le das a esa pelicula: ");
        double nota = scanner.nextDouble();

        System.out.println(nombre);
        System.out.println(fechaLanzamineto);
        System.out.println(nota);
    }
}
