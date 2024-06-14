import java.util.Date;

public class Reserva {
    private Salon salon;
    private Date fechaReserva;
    private Actividad actividad;
    private Date fechaActividad;
    private int duracion;
    private int participantes;
    private int pagoAdelantado;
    private int pagoPendiente;
    private int montoTotal;

    public Reserva(Salon salon, Date fechaReserva, Actividad actividad, Date fechaActividad, int duracion, int participantes, int pagoAdelantado, int pagoPendiente, int montoTotal) {
        this.salon = salon;
        this.fechaReserva = fechaReserva;
        this.actividad = actividad;
        this.fechaActividad = fechaActividad;
        this.duracion = duracion;
        this.participantes = participantes;
        this.pagoAdelantado = pagoAdelantado;
        this.pagoPendiente = pagoPendiente;
        this.montoTotal = montoTotal;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public Date getFechaActividad() {
        return fechaActividad;
    }

    public void setFechaActividad(Date fechaActividad) {
        this.fechaActividad = fechaActividad;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int participantes) {
        this.participantes = participantes;
    }

    public int getPagoAdelantado() {
        return pagoAdelantado;
    }

    public void setPagoAdelantado(int pagoAdelantado) {
        this.pagoAdelantado = pagoAdelantado;
    }

    public int getPagoPendiente() {
        return pagoPendiente;
    }

    public void setPagoPendiente(int pagoPendiente) {
        this.pagoPendiente = pagoPendiente;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }
}
