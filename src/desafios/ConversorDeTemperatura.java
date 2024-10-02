package desafios;
import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        //Peticion de temperatura
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la temperatura en grados Celsius: ");

        //Definicion de variables:
        double temperaturaEnCelsius = scanner.nextDouble();
        double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;

        //Mensaje por consola:
        String mensaje = String.format("La temperatura de %f Celsius es equivalente a %f Fahrenheit", temperaturaEnCelsius, temperaturaEnFahrenheit);
        System.out.println(mensaje);

        //Casting:
        int temperaturaEnFahrenheitEntero = (int) temperaturaEnFahrenheit;
        System.out.println("La temperatura en Fahrenheit entera es: " + temperaturaEnFahrenheitEntero);
    }
}
