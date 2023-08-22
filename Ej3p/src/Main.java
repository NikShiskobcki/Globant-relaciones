import Models.Carta;
import Services.CartaService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int indexAt = 0;

        System.out.println("Generando cartas");
        ArrayList baraja = CartaService.generarCartas();

        System.out.println("Barajando");
        CartaService.barajar(baraja);
        System.out.println("");

        System.out.println("Siguiente carta en el mazo");
        CartaService.siguienteCarta(indexAt,baraja);
        indexAt++;
        System.out.println("");

        System.out.println("Numero de cartas disponibles:");
        CartaService.cartasDisponibles(indexAt, baraja);

        System.out.println("");
        System.out.println("Ingrese numero de cartas a dar");
        int numCartas = rd.nextInt();

        indexAt = CartaService.darCartas(indexAt, baraja, numCartas);
        System.out.println("");

        System.out.println("Cartas que ya han salido");
        CartaService.cartasMonton(indexAt, baraja);

        System.out.println("");
        System.out.println("Todas las cartas disponibles:");
        CartaService.mostrarBaraja(indexAt,baraja);

    }
}