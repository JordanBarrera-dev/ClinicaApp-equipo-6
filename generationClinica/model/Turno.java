package generationClinica.model;
import java.time.LocalDateTime;

public class Turno {

    private int id;
    private  Paciente paciente;
    private  Medico medico;
    private LocalDateTime fechaHora;
    private EstadoTurno estado;
    //id
    public Turno(int id, Paciente paciente, Medico medico, LocalDateTime fechaHora) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.fechaHora = fechaHora;
        this.estado = EstadoTurno.PENDIENTE;
    }
    //sin id


    public Turno(Paciente paciente, Medico medico, LocalDateTime fechaHora, EstadoTurno estado) {
        this.paciente = paciente;
        this.medico = medico;
        this.fechaHora = fechaHora;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        if (paciente == null) {
            throw new IllegalArgumentException("Paciente no puede estar vacio");
        }
        this.paciente = paciente;

    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        if (medico == null) {
            throw new IllegalArgumentException("Medico no puede estar vacio");
        }
        this.medico = medico;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        if (medico == null) {
            throw new IllegalArgumentException("Hora no puede estar vacia");
        }
        this.fechaHora = fechaHora;
    }

    public EstadoTurno getEstado() {
        return estado;
    }

    public void setEstado(EstadoTurno estado) {
        this.estado = estado;
    }

    public String toString(){
        return estado + " " + paciente.getNombre() + " " + paciente.getApellido() + "-" + "Dr." + medico.getNombre() + " " + medico.getApellido() + " " + "(" + medico.getEspecialidad() + ")" + fechaHora;
    }
}

