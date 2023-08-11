//Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
//un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
//se dispara y se moja.

import Models.*;
import Services.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<>();

        System.out.println("Bienvenido!");

        System.out.println("Ingrese la cantidad de jugadores (hasta 6)");
        int participantes = rd.nextInt();
        while (participantes < 1 || participantes>6){
            System.out.println("Ingrese entre 1 y 6 jugadores");
            participantes=rd.nextInt();
        }
        rd.nextLine();
        Jugador j;
        for (int i=0; i<participantes;i++){
            j = new Jugador();
            System.out.println("Ingrese nombre del jugador "+ (i+1));
            String name = rd.nextLine();
            j.setId(i+1);
            j.setName(name);
            jugadores.add(j);
        }

        for (Jugador x: jugadores) {
            System.out.println(x.toString());
        }

        Revolver revolver = new Revolver();
        revolver = RevolverService.llenarRevolver(revolver);
        System.out.println(revolver.toString());

        Juego juego = JuegoService.llenarJuego(jugadores,revolver);
        JuegoService.ronda(juego);

    }
}