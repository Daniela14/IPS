package ips;

public abstract class Persona {

    public String Nombre;

    public String Apellido;

    public int Id;

    public String sexo;

    public String Direccion;

    public Persona(String Nombre, String Apellido, int Id, String sexo, String Direccion) {
    }

    public Persona() {
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setNombre(String Nombre) {
    }

    public String getApellido() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setApellido(String Apellido) {
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setId(int Id) {
    }

    public String getSexo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setSexo(String sexo) {
    }

    public String getDireccion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setDireccion(String Direccion) {
    }

    public abstract void inscribir(Persona persona);
}
