package Services;
import Models.Perro;

import java.util.Scanner;

public class PerroService {

    static Scanner rd = new Scanner(System.in);

    public static Perro createDog(){
        Perro dog = new Perro();

        System.out.println("Ingrese nombre del perro");
        String name = rd.nextLine();
        dog.setName(name);

        System.out.println("Ingrese raza del perro");
        String breed = rd.nextLine();
        dog.setBreed(breed);

        System.out.println("Ingrese edad del perro en años");
        int age = rd.nextInt();
        rd.nextLine();
        dog.setAge(age);

        System.out.println("Ingrese tamaño del pero (pequeño/mediano/grande)");
        String size = rd.nextLine();
        dog.setSize(size);

        return dog;

    }
}
