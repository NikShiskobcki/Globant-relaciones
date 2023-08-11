//Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
//del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
//tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.

//• toString(): muestra información del revolver (posición actual y donde está el agua)

package Models;

public class Revolver {
    private int posActual;
    private int posBala;

    public Revolver() {
    }
    public Revolver(int posActual, int posBala) {
        this.posActual = posActual;
        this.posBala = posBala;
    }

    public int getPosActual() {
        return posActual;
    }
    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosBala() {
        return posBala;
    }
    public void setPosBala(int posBala) {
        this.posBala = posBala;
    }

    @Override
    public String toString() {
        return "Revolver{" +
                "posActual=" + posActual +
                ", posBala=" + posBala +
                '}';
    }
}
