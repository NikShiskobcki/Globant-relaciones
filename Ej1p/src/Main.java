//Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
//clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
//atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//la clase Persona, la información del Perro y de la Persona.

import Models.Perro;
import Models.Persona;

import Services.PerroService;
import Services.PersonaService;

public class Main {
    public static void main(String[] args) {

        Persona persona1= PersonaService.createPersona();
        Persona persona2= PersonaService.createPersona();

        System.out.println("Datos del perro de la persona 1");
        Perro perro1 = PerroService.createDog();
        persona1.setPet(perro1);


        System.out.println("Datos del perro de la persona 2");
        Perro perro2 = PerroService.createDog();
        persona2.setPet(perro2);


        System.out.println(persona1.toString());
        System.out.println(persona2.toString());


    }
}