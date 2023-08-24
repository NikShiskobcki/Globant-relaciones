package Models;

import java.time.LocalDate;

public class Poliza {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private String numPoliza;
    private LocalDate fechaInicioPoliza;
    private LocalDate fechaFinPoliza;
    private int cantidadCuotas;
    private String formaPago;
    private int montoTotalAsegurado;
    private boolean incluyeGranizo;
    private int montoMaximoGranizo;
    private String tipoCobertura;
    private Cuota datosCuotas;

    public Poliza(){

    }

    public Poliza(Vehiculo vehiculo, Cliente cliente, String numPoliza, LocalDate fechaInicioPoliza, LocalDate fechaFinPoliza,
                  int cantidadCuotas, String formaPago, int montoTotalAsegurado, boolean incluyeGranizo,
                  int montoMaximoGranizo, String tipoCobertura, Cuota datosCuotas) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.numPoliza = numPoliza;
        this.fechaInicioPoliza = fechaInicioPoliza;
        this.fechaFinPoliza = fechaFinPoliza;
        this.cantidadCuotas = cantidadCuotas;
        this.formaPago = formaPago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoCobertura = tipoCobertura;
        this.datosCuotas = datosCuotas;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(String numPoliza) {
        this.numPoliza = numPoliza;
    }

    public LocalDate getFechaInicioPoliza() {
        return fechaInicioPoliza;
    }

    public void setFechaInicioPoliza(LocalDate fechaInicioPoliza) {
        this.fechaInicioPoliza = fechaInicioPoliza;
    }

    public LocalDate getFechaFinPoliza() {
        return fechaFinPoliza;
    }

    public void setFechaFinPoliza(LocalDate fechaFinPoliza) {
        this.fechaFinPoliza = fechaFinPoliza;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(int montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public int getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(int montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public String getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(String tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Cuota getDatosCuotas() {
        return datosCuotas;
    }

    public void setDatosCuotas(Cuota datosCuotas) {
        this.datosCuotas = datosCuotas;
    }

    @Override
    public String toString() {
        return "Poliza{" +
                "vehiculo=" + vehiculo.toString() +
                ", cliente=" + cliente.toString() +
                ", numPoliza='" + numPoliza + '\'' +
                ", fechaInicioPoliza='" + fechaInicioPoliza + '\'' +
                ", fechaFinPoliza='" + fechaFinPoliza + '\'' +
                ", cantidadCuotas=" + cantidadCuotas +
                ", formaPago='" + formaPago + '\'' +
                ", montoTotalAsegurado=" + montoTotalAsegurado +
                ", incluyeGranizo=" + incluyeGranizo +
                ", montoMaximoGranizo=" + montoMaximoGranizo +
                ", tipoCobertura='" + tipoCobertura + '\'' +
                ", datosCuotas=" + datosCuotas.toString() +
                '}';
    }
}
