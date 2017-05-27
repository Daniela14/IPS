package ips;

import java.util.Date;

public class Cita {

    private Date fecha;

    private Autorizacion autorizacion;

    private Especialidad especialidad;

    private Paciente paciente;

    private String estado;

    public Cita(Especialidad especialidad, Date fecha, String estado) {
    }

    public Cita(Date fecha, Autorizacion autorizacion, Especialidad especialidad, Paciente paciente, String estado) {
    }

    public Date getFecha() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setFecha(Date fecha1, Date actual) {
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

    public String getEstado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setEstado(String estado) {
    }

    public String toString() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
