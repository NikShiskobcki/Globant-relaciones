//Métodos:
//• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.

package Services;
import Models.*;

import static Services.RevolverService.mojar;

public class JugadorService {
    public static boolean disparo(Revolver revolver, Jugador jugador){
        boolean flag = mojar(revolver);
        if (flag == true){
            jugador.setWet(true);
            return true;
        }else{
            RevolverService.siguienteChorro(revolver);
            return false;
        }
    }
}
