package Services;
import Models.Carta;

import java.util.ArrayList;
import java.util.Collections;

public class CartaService {

    public static ArrayList generarCartas(){

        ArrayList<Carta> baraja = new ArrayList<>();
        //oro
        for (int i=1;i<13;i++){
            if (i==8 || i==9){
                continue;
            }else{
                Carta carta = new Carta(i, "Oro");
                baraja.add(carta);
            }
        }

        //espada
        for (int i=1;i<13;i++){
            if (i==8 || i==9){
                continue;
            }else{
                Carta carta = new Carta(i, "Espadas");
                baraja.add(carta);
            }
        }

        //copas
        for (int i=1;i<13;i++){
            if (i==8 || i==9){
                continue;
            }else{
                Carta carta = new Carta(i, "Copas");
                baraja.add(carta);
            }
        }

        //bastos
        for (int i=1;i<13;i++){
            if (i==8 || i==9){
                continue;
            }else{
                Carta carta = new Carta(i, "Bastos");
                baraja.add(carta);
            }
        }

        return baraja;

    }

    public static ArrayList barajar(ArrayList baraja){
        Collections.shuffle(baraja);
        return baraja;
    }

    public static void siguienteCarta(int indexAt, ArrayList baraja){
        if (indexAt == baraja.size()){
            System.out.println("No hay mas cartas en la baraja");
        }else{
            System.out.println(baraja.get(indexAt).toString());
        }
    }

    public static void cartasDisponibles(int indexAt, ArrayList baraja){
        System.out.println(baraja.size()-indexAt);
    }


    public static int darCartas(int indexAt, ArrayList baraja, int numCartas){
        if (numCartas>baraja.size()-indexAt){
            System.out.println("Quedan menos de "+numCartas+" cartas en la baraja");
            return indexAt;
        }else{
            for (int i=indexAt; i<indexAt+numCartas;i++){
                System.out.println(baraja.get(i).toString());
            }
            return indexAt + numCartas;
        }

    }

    public static void cartasMonton(int indexAt, ArrayList baraja){
        if (indexAt == 0){
            System.out.println("No ha salido ninguna carta");
        }else{
            for (int i=0; i<indexAt;i++){
                System.out.println(baraja.get(i).toString());
            }
        }
    }

    public static void mostrarBaraja(int indexAt, ArrayList baraja){
        for (int i=indexAt; i< baraja.size();i++){
            System.out.println(baraja.get(i).toString());
        }
    }
}
