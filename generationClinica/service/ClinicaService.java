package generationClinica.service;

import generationClinica.interfaces.Consultable;
import generationClinica.model.Medico;
import generationClinica.model.Paciente;
import generationClinica.model.Turno;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class ClinicaService implements Consultable  {
    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<Turno> turnos;

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

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

    public void registrarPaciente(Paciente p){
        if(!p.esValido()){
            JOptionPane.showMessageDialog(null, "Error");
            return;
        }
        if (pacientes.contains(p))  {
            JOptionPane.showMessageDialog(null, "El paciente ya fue registrado");
            return;
        }
        int id_nuevo = 1;
        for (Paciente paciente : pacientes)
        {
            if (paciente.getId() >= id_nuevo)
            {
                id_nuevo = paciente.getId() + 1;
            }
        }
        p.setId(id_nuevo);
        pacientes.add(p);
        JOptionPane.showMessageDialog(null, "Paciente registrado correctamente");
        JOptionPane.showMessageDialog(null, p.getDatosRegistro());
    }
    public Paciente buscarPorCedula(String cedula){
        for (Paciente paciente : pacientes){
            if (paciente.getCedula().equals(cedula)){
                return paciente;
            }
        }
        return null;


    }
    public void listarPacientes(){
        if(pacientes.isEmpty()){
            JOptionPane.showMessageDialog(null, "no hay pacientes en la lista");
            return;
        }
        List<Paciente> copiaOrdenada = new ArrayList<>(pacientes);
    copiaOrdenada.sort(Comparator.comparing(Paciente::getApellido).thenComparing(Paciente::getNombre));
    String mostrarPacientes = "";
        for(Paciente paciente : copiaOrdenada){
            mostrarPacientes += paciente + "\n";
        }
        JOptionPane.showMessageDialog(null, mostrarPacientes);
    }
    public void registrarMedico(Medico m){
        if(!p.esValido()){
            JOptionPane.showMessageDialog(null, "Error");
            return;
        }
        if (pacientes.contains(p))  {
            JOptionPane.showMessageDialog(null, "El paciente ya fue registrado");
            return;
        }
        int id_nuevo = 1;
        for (Paciente paciente : pacientes)
        {
            if (paciente.getId() >= id_nuevo)
            {
                id_nuevo = paciente.getId() + 1;
            }
        }
        p.setId(id_nuevo);
        pacientes.add(p);
        JOptionPane.showMessageDialog(null, "Paciente registrado correctamente");
        JOptionPane.showMessageDialog(null, p.getDatosRegistro());
    }

}

