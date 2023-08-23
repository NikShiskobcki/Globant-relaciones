package Services;
import Models.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CineService {

    public static Cine createCinema(ArrayList<Pelicula> listaPelicula){
        Scanner rd = new Scanner(System.in);

        Cine cinema = new Cine();
        cinema.setPelicula(listaPelicula.get(0));

        System.out.println("Ingrese precio de la entrada");
        cinema.setPrecioEntrada(rd.nextInt());
        rd.nextLine();

        cinema.setSala(generarSala());
        return cinema;
    }

    public static String[][] generarSala(){
        String[][] sala = new String[8][6];
        int aux=0;
        char[] columnas = new char[] {'A', 'B', 'C','D','E','F'};
        int x=0;
        for (int i=0;i<8;i++){
            for (int j=0;j<6;j++){
                if (x==6){
                    x=0;
                }
                sala[i][j]= Integer.toString(8-i)+columnas[x];
                System.out.print(sala[i][j]);
                System.out.print(" ");
                aux++;
                x++;
            }
            System.out.println("");
        }
        return sala;
    }

    public static void llenarSala(Cine cine, ArrayList<Espectador> listaEspectadores){
        Random random = new Random();
        for (Espectador individuo: listaEspectadores) {
            if (individuo.getEdad()<cine.getPelicula().getEdadMinima()){
                continue;
            }
            if (individuo.getDinero()< cine.getPrecioEntrada()){
                continue;
            }
            int i;
            int j;
            String[][] salaAux = cine.getSala();

            while (true){
                i = random.nextInt(8);
                j = random.nextInt(6);
                if (salaAux[i][j].contains("X")){
                    continue;
                }else{
                    salaAux[i][j] = salaAux[i][j].concat("X");
                    individuo.setDinero(individuo.getDinero()-cine.getPrecioEntrada());
                    break;
                }
            }
            cine.setSala(salaAux);
        }
    }
}
