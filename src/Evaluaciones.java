import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        int contador = 0;

        while (nota != -1) {
            System.out.println("Escrbie la nota que le darias la pelicula Matrix: ");
            nota = scanner.nextDouble();
            if (nota!=-1) {
                mediaEvaluaciones += nota; // abreviacion de: mediaEvaluaciones = mediaEvaluaciones + nota;
                contador++;
            }
        }
        System.out.println("La media de evaluaciones para Matriz es: " + mediaEvaluaciones / contador);
    }

}
