//Métodos:
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.
//ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.

package Services;
import Models.*;

import java.util.ArrayList;

public class JuegoService {

    public static Juego llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver){
        Juego juego = new Juego(jugadores,revolver);
        return juego;
    }

    public static void ronda(Juego juego){
        boolean flag = false;
        int i = -1;
        int ron = 1;
        while (flag == false){
            System.out.println("Ronda "+ ron);
            ron++;
            if (i!= 1 && i==juego.getJugadores().size()-1){
                i = -1;
            }
            i++;
            flag = JugadorService.disparo(juego.getRevolver(),juego.getJugadores().get(i));
            if (flag == true){
                finDelJuego(juego.getJugadores().get(i));
                break;
            }
        }


    }

    public static void finDelJuego(Jugador jugador){
        System.out.println("Fin de la partida");
        System.out.println("El jugador "+ jugador.getName()+ " ha perdido");
        System.out.println(jugador.toString());
    }
}
