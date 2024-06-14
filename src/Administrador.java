public class Administrador extends Usuario{
    private String rol;

    public Administrador(String nombre, int documento, String domicilio, int celular, String mail, String rol) {
        super(nombre, documento, domicilio, celular, mail);
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
