package ips;

import java.util.Date;

public interface Modificaciones {

    public void Guardar(Date fecha, Autorizacion autorizacion, Especialidad especialidad, Paciente paciente, String estado);

    public void modificar(Date fecha, Date actual);
}
