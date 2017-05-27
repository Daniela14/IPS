package ips;

import java.util.Date;

public class Autorizacion {

    private Especialidad especialidad;

    private Paciente paciente;

    private Date fechaAutorizacion;

    private String estado;

    public Autorizacion(Especialidad especialidad, Paciente paciente, Date fechaAutorizacionecha, String estado) {
    }

    public String getEstado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setEstado(String estado) {
    }

    public Especialidad getEspecialidad() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setEspecialidad(Especialidad especialidad) {
    }

    public Paciente getPaciente() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setPaciente(Paciente paciente) {
    }

    public Date getFecha() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void setFecha(Date fechaAutorizacion, Date actual) {
    }
}
