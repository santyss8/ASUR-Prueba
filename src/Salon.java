public class Salon {
    private String nombre;
    private String tipo;
    private double precioSocio;
    private double precioNoSocio;

    public Salon(String nombre, String tipo, double precioSocio, double precioNoSocio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioSocio = precioSocio;
        this.precioNoSocio = precioNoSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioSocio() {
        return precioSocio;
    }

    public void setPrecioSocio(double precioSocio) {
        this.precioSocio = precioSocio;
    }

    public double getPrecioNoSocio() {
        return precioNoSocio;
    }

    public void setPrecioNoSocio(double precioNoSocio) {
        this.precioNoSocio = precioNoSocio;
    }
}
