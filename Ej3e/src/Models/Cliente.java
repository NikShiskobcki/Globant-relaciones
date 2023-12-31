package Models;

public class Cliente {
    private String nombre;
    private int documento;
    private String mail;
    private String domicilio;
    private int telefono;


    public Cliente(){

    }
    public Cliente(String nombre, int documento, String mail, String domicilio, int telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", documento=" + documento +
                ", mail='" + mail + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
