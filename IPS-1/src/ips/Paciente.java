package ips;

import java.util.List;

public class Paciente extends Persona {

    private String estado;

    private List<Autorizacion> listAutorizaciones;

    public Paciente(String estado, String Nombre, String Apellido, int Id, String sexo, String Direccion) {
    }

    public Paciente() {
    }

    public String getEstado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setEstado(String estado) {
    }

    public int SolicitarCita() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Autorizacion> getListAutorizaciones() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setListAutorizaciones(List<Autorizacion> listAutorizaciones) {
    }

    public void inscribir(Persona persona) {
    }

    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
