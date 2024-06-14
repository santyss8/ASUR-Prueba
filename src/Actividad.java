import java.util.Date;

public class Actividad {
    private int codigoActividad;
    private String nombreActividad;
    private Date fecha;
    private String Lugar;
    private int duracion;
    private String descripcion;
    private int costo;

    public Actividad(int codigoActividad, String nombreActividad, Date fecha, String lugar, int duracion, String descripcion, int costo) {
        this.codigoActividad = codigoActividad;
        this.nombreActividad = nombreActividad;
        this.fecha = fecha;
        Lugar = lugar;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public int getCodigoActividad() {
        return codigoActividad;
    }

    public void setCodigoActividad(int codigoActividad) {
        this.codigoActividad = codigoActividad;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
