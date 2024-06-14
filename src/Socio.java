public class Socio extends Usuario {
    private String categoria;
    private String dificultadAuditiva;
    private String lenguajeSenas;
    private String participacionSubcomisiones;

    public Socio(String nombre, int documento, String domicilio, int celular, String mail, String categoria, String dificultadAuditiva, String lenguajeSenas, String participacionSubcomisiones) {
        super(nombre, documento, domicilio, celular, mail);
        this.categoria = categoria;
        this.dificultadAuditiva = dificultadAuditiva;
        this.lenguajeSenas = lenguajeSenas;
        this.participacionSubcomisiones = participacionSubcomisiones;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDificultadAuditiva() {
        return dificultadAuditiva;
    }

    public void setDificultadAuditiva(String dificultadAuditiva) {
        this.dificultadAuditiva = dificultadAuditiva;
    }

    public String getLenguajeSenas() {
        return lenguajeSenas;
    }

    public void setLenguajeSenas(String lenguajeSenas) {
        this.lenguajeSenas = lenguajeSenas;
    }

    public String getParticipacionSubcomisiones() {
        return participacionSubcomisiones;
    }

    public void setParticipacionSubcomisiones(String participacionSubcomisiones) {
        this.participacionSubcomisiones = participacionSubcomisiones;
    }


}
