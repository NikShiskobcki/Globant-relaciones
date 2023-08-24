package Services;
import Models.Vehiculo;

import java.util.Scanner;

public class VehiculoService {
    public static Vehiculo generarVehiculo(){
        Scanner rd = new Scanner(System.in);

        Vehiculo vehiculo = new Vehiculo();

        System.out.println("Ingrese marca del vehiculo");
        vehiculo.setMarca(rd.nextLine());

        System.out.println("Ingrese modelo del vehiculo");
        vehiculo.setModelo(rd.nextLine());

        System.out.println("ingrese año del vehiculo");
        vehiculo.setYear(rd.nextInt());
        rd.nextLine();

        System.out.println("Ingrese numero del motor el vehiculo");
        vehiculo.setNumMotor(rd.nextLine());

        System.out.println("Ingrese numero del chasis del vehiculo");
        vehiculo.setNumChasis(rd.nextLine());

        System.out.println("Ingrese color del vehiculo");
        vehiculo.setColor(rd.nextLine());

        System.out.println("Ingrese tipo de vehiculo (sedan, camioneta, etc)");
        vehiculo.setTipo(rd.nextLine());

        return vehiculo;
    }
}
