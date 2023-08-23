package Services;
import Models.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaService {

    public static ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

    public static ArrayList generarPeliculas(){
        Scanner rd = new Scanner(System.in);
        int cant;

        System.out.println("Ingrese cantidad de peliculas que quiera crear");
        cant = rd.nextInt();
        rd.nextLine();

        for (int i=0; i<cant;i++){
            Pelicula movie = new Pelicula();

            System.out.println("Ingrese nombre de la pelicula");
            movie.setTitulo(rd.nextLine());

            System.out.println("Ingrese duaracion de la pelicula en minutos");
            movie.setDuracion(rd.nextInt());
            rd.nextLine();

            System.out.println("Ingrese edad minima del espectador");
            movie.setEdadMinima(rd.nextInt());
            rd.nextLine();

            System.out.println("Ingrese nombre del director");
            movie.setDirector(rd.nextLine());

            listaPeliculas.add(movie);
        }
        Collections.shuffle(listaPeliculas);
        return listaPeliculas;
    }
}
