package Services;
import Models.*;

import java.util.Scanner;

public class PolizaService {
    public static Poliza generarPoliza(Vehiculo vehiculo, Cliente cliente){
        Scanner rd = new Scanner(System.in);

        Poliza poliza = new Poliza();

        poliza.setVehiculo(vehiculo);
        poliza.setCliente(cliente);

        System.out.println("Ingrese numero de poliza");
        poliza.setNumPoliza(rd.nextLine());

        System.out.println("Ingrese fecha inicio de poliza");
        poliza.setFechaInicioPoliza(rd.nextLine());

        System.out.println("Ingrese fecha fin de poliza");
        poliza.setFechaFinPoliza(rd.nextLine());

        System.out.println("Ingrese cantidad de cuotas");
        poliza.setCantidadCuotas(rd.nextInt());
        rd.nextLine();

        Cuota cuota = CuotaService.generarCuotas();
        poliza.setFormaPago(cuota.getFormaPago());

        System.out.println("Ingrese monto total asegurado");
        poliza.setMontoTotalAsegurado(rd.nextInt());
        rd.nextLine();

        System.out.println("Ingrese si incluye granizo (true/false)");
        poliza.setIncluyeGranizo(rd.nextBoolean());
        rd.nextLine();

        if (poliza.isIncluyeGranizo()){
            System.out.println("Ingrese monto maximo por granizo");
            poliza.setMontoMaximoGranizo(rd.nextInt());
            rd.nextLine();
        }else{
            poliza.setMontoMaximoGranizo(0);
        }

        System.out.println("Ingrese tipo de cobertura (total, contra terceros, etc)");
        poliza.setTipoCobertura(rd.nextLine());

        poliza.setDatosCuotas(cuota);

        return poliza;
    }
}
