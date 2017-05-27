package ips;

public class PacienteContributivo extends Paciente {

    private String categoria;

    public PacienteContributivo(String categoria, String estado, String Nombre, String Apellido, int Id, String sexo, String Direccion) {
    }

    public String getCategoria() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setCategoria(String categoria) {
    }

    public int seleccionarDescuento(String categoria) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
