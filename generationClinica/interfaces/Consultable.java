package generationClinica.interfaces;

import java.util.List;

public interface Consultable {

    List listarTurnosDelDia(LocalDate fecha);
    List buscarPorMedico(Medico medico);
    List buscarPorPaciente(Paciente paciente);


}
