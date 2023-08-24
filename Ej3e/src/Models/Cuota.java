package Models;

public class Cuota {
    private int numeroCuota;
    private int totalCuota;
    private boolean cuotaPagada;
    private String fechaVencimiento;
    private String formaPago;

    public Cuota() {
    }

    public Cuota(int numeroCuota, int totalCuota, boolean cuotaPagada, String fechaVencimiento, String formaPago) {
        this.numeroCuota = numeroCuota;
        this.totalCuota = totalCuota;
        this.cuotaPagada = cuotaPagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public int getTotalCuota() {
        return totalCuota;
    }

    public void setTotalCuota(int totalCuota) {
        this.totalCuota = totalCuota;
    }

    public boolean isCuotaPagada() {
        return cuotaPagada;
    }

    public void setCuotaPagada(boolean cuotaPagada) {
        this.cuotaPagada = cuotaPagada;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuota{" +
                "numeroCuota=" + numeroCuota +
                ", totalCuota=" + totalCuota +
                ", cuotaPagada=" + cuotaPagada +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                ", formaPago='" + formaPago + '\'' +
                '}';
    }
}
