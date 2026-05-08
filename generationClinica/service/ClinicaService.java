package generationClinica.service;

import generationClinica.interfaces.Consultable;
import generationClinica.model.Medico;
import generationClinica.model.Paciente;
import generationClinica.model.Turno;

import java.time.LocalDate;
import java.util.List;

public class ClinicaService implements Consultable {

    @Override
    public List<Turno> listarTurnosDelDia(LocalDate fecha) {
        return List.of();
    }

    @Override
    public List<Turno> buscarPorMedico(Medico medico) {
        return List.of();
    }

    @Override
    public List<Turno> buscarPorPaciente(Paciente paciente) {
        return List.of();
    }
}
