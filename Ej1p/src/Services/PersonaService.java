package Services;
import Models.Persona;
import Models.Perro;

import java.util.Scanner;

public class PersonaService {
    static Scanner rd = new Scanner(System.in);

    public static Persona createPersona(){
        Persona person = new Persona();

        System.out.println("Ingrese nombre de la persona");
        String name = rd.nextLine();
        person.setName(name);

        System.out.println("Ingrese apellido de la persona");
        String surname = rd.nextLine();
        person.setSurname(surname);

        System.out.println("Ingrese edad de la persona");
        int age = rd.nextInt();
        rd.nextLine();
        person.setAge(age);

        System.out.println("Ingrese documento de la persona");
        int id = rd.nextInt();
        rd.nextLine();
        person.setId(id);

        return person;
    }

    public static void showPersona(Persona person){
        person.toString();
    }
}
