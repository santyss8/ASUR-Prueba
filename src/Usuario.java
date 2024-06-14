abstract class Usuario {
    protected String nombre;
    protected int documento;
    protected String domicilio;
    protected int celular;
    protected String mail;


    public Usuario(String nombre, int documento, String domicilio, int celular, String mail) {
        this.nombre = nombre;
        this.documento = documento;
        this.domicilio = domicilio;
        this.celular = celular;
        this.mail = mail;
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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
