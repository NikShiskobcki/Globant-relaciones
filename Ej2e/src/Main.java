//Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
//(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
//sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
//el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
//nombre, edad y el dinero que tiene disponible.
//Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
//etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
//la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
//ocupado se muestra una X, sino un espacio vacío.
//Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
//ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
//ocupado el asiento).
//Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
//podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
//libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
//ocupado se le debe buscar uno libre.
//Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
//cada asiento o solo las X y espacios vacíos.

import Models.*;
import Services.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Generar peliculas");
        ArrayList<Pelicula> listaPeliculas = PeliculaService.generarPeliculas();

        System.out.println("Generar cine");
        Cine cine = CineService.createCinema(listaPeliculas);

        System.out.println("Generar espectadores");
        ArrayList<Espectador> listaEspectadores = EspectadorService.generarEspectadores();

        System.out.println("Llenar sala");
        CineService.llenarSala(cine,listaEspectadores);

        System.out.println(cine.toString());
        String [][] sala =cine.getSala();
        System.out.println("Sala:");
        for (int i=0;i<8;i++){
            for (int j=0;j<6;j++){
                System.out.print(sala[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}