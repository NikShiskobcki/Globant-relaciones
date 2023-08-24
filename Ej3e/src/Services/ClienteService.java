package Services;
import Models.Cliente;

import java.util.Scanner;

public class ClienteService {

    public static Cliente generarCliente(){
        Scanner rd = new Scanner(System.in);

        Cliente cliente = new Cliente();

        System.out.println("Ingrese nombre completo del cliente");
        cliente.setNombre(rd.nextLine());

        System.out.println("Ingrese documento del cliente");
        cliente.setDocumento(rd.nextInt());
        rd.nextLine();

        System.out.println("Ingrese mail del cliente");
        cliente.setMail(rd.nextLine());

        System.out.println("Ingrese domicilio del cliente");
        cliente.setDomicilio(rd.nextLine());

        System.out.println("Ingrese telefono del cliente");
        cliente.setTelefono(rd.nextInt());
        rd.nextLine();
        return cliente;
    }
}
