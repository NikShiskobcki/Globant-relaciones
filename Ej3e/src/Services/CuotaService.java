package Services;
import Models.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CuotaService {
    public static Cuota generarCuotas(){
        Scanner rd = new Scanner(System.in);

        Cuota cuota = new Cuota();

        cuota.setNumeroCuota(1);

        System.out.println("Ingrese precio de la cuota");
        cuota.setTotalCuota(rd.nextInt());
        rd.nextLine();

        cuota.setCuotaPagada(false);

        System.out.println("Ingrese fecha de vencimiento de la primera cuota. Formato YYYY-mm-dd");
        cuota.setFechaVencimiento(LocalDate.parse(rd.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE));

        System.out.println("Ingrese forma de pago");
        cuota.setFormaPago(rd.nextLine());

        return cuota;
    }

    public static void acutalizarPago(Poliza poliza){
        poliza.getDatosCuotas().setCuotaPagada(true);

        System.out.println(poliza.getDatosCuotas().toString());

        poliza.getDatosCuotas().setCuotaPagada(false);

        poliza.getDatosCuotas().setFechaVencimiento(poliza.getDatosCuotas().getFechaVencimiento().plusMonths(1));
        poliza.getDatosCuotas().setNumeroCuota(poliza.getDatosCuotas().getNumeroCuota()+1);

        System.out.println("Informacion de la proxima cuota:");

        System.out.println(poliza.getDatosCuotas().toString());

    }
}
