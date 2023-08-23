package Services;
import Models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class EspectadorService {

    public static ArrayList<Espectador> generarEspectadores(){
        Scanner rd = new Scanner(System.in);

        ArrayList<Espectador> listaEspectadores = new ArrayList<>();

        System.out.println("Ingrese cantidad de espectadores a ingresar");
        int cant = rd.nextInt();
        rd.nextLine();

        for (int i = 0; i<cant;i++){
            Espectador espectador = new Espectador();

            System.out.println("Ingrese nombre del espectador");
            espectador.setNombre(rd.nextLine());

            System.out.println("Ingrese edad del espectador");
            espectador.setEdad(rd.nextInt());
            rd.nextLine();

            System.out.println("Ingrese dinero del espectador");
            espectador.setDinero(rd.nextInt());
            rd.nextLine();

            listaEspectadores.add(espectador);
        }

        return listaEspectadores;
    }
}
