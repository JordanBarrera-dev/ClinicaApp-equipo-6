package generationClinica.interfaces;

import generationClinica.model.Medico;
import generationClinica.model.Paciente;
import generationClinica.model.Turno;

import java.time.LocalDate;
import java.util.List;

public interface Consultable {

    List<Turno> listarTurnosDelDia(LocalDate fecha);
    List<Turno> buscarPorMedico(Medico medico);
    List<Turno> buscarPorPaciente(Paciente paciente);

}
