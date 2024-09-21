public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2+6+9)/3;
        System.out.println("Valoración: "+media);

        String sinopsis = """
                Sinopsis: Matriz es una paradoja
                La mejor pelicula del fin del milenio
                Fué lanzado en: 
                """ + fechaDeLanzamiento;

        System.out.println(sinopsis);

        int clasificacion = (int) media / 2;
        System.out.println(clasificacion);

    }
}