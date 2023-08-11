//Métodos:
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//deben ser aleatorios.
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
//• siguienteChorro(): cambia a la siguiente posición del tambor

package Services;
import Models.Revolver;

import java.util.Random;
import java.util.Scanner;

public class RevolverService {
    public static Scanner rd = new Scanner(System.in);

    public static Revolver llenarRevolver(Revolver revolver){
        Random rand = new Random();
        revolver.setPosActual(rand.nextInt(6));
        revolver.setPosBala(rand.nextInt(6));

        return revolver;
    }

    public static boolean mojar(Revolver revolver){
        if (revolver.getPosBala()==revolver.getPosActual()){
            return true;
        }else{
            return false;
        }
    }

    public static void siguienteChorro(Revolver revolver){
        if (revolver.getPosActual()==6){
            revolver.setPosActual(1);
        }else{
            revolver.setPosActual(revolver.getPosActual()+1);
        }
    }

}
