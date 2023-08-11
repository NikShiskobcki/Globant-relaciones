//Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
//jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
//si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
//debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.

package Models;

public class Jugador {
    private int id;
    private String name;
    private boolean wet = false;

    public Jugador() {
    }
    public Jugador(int id, String name, boolean wet) {
        this.id = id;
        this.name = name;
        this.wet = wet;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name +" "+ this.id;
    }

    public boolean isWet() {
        return wet;
    }
    public void setWet(boolean wet) {
        this.wet = wet;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", wet=" + wet +
                '}';
    }
}
