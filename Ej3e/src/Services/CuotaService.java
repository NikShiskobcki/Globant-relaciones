package Services;
import Models.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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

        System.out.println("Ingrese fecha de vencimiento de la primera cuota");
        cuota.setFechaVencimiento(rd.nextLine());

        System.out.println("Ingrese forma de pago");
        cuota.setFormaPago(rd.nextLine());

        return cuota;
    }

    public static void acutalizarPago(Poliza poliza){
        poliza.getDatosCuotas().setCuotaPagada(true);

        System.out.println(poliza.getDatosCuotas().toString());

        poliza.getDatosCuotas().setCuotaPagada(false);

        String fechaString = poliza.getDatosCuotas().getFechaVencimiento();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fecha = LocalDate.parse(fechaString,format);
        LocalDate fechaNew = fecha.plusMonths(1);

        poliza.getDatosCuotas().setFechaVencimiento(fechaNew.toString());

        System.out.println(poliza.getDatosCuotas().toString());

    }
}
