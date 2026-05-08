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
        if(!m.esValido()){
            JOptionPane.showMessageDialog(null, "Error");
            return;
        }
        if (medicos.contains(m))  {
            JOptionPane.showMessageDialog(null, "El medico ya fue registrado");
            return;
        }
        int id_nuevo = 1;
        for (Medico medico : medicos)
        {
            if (medico.getId() >= id_nuevo)
            {
                id_nuevo = medico.getId() + 1;
            }
        }
        m.setId(id_nuevo);
        medicos.add(m);
        JOptionPane.showMessageDialog(null, "Medico registrado correctamente");
        JOptionPane.showMessageDialog(null, m.getDatosRegistro());
    }
    public Medico buscarPorNombreApellido(String nombre, String apellido){
        for (Medico medico : medicos){
            if (medico.getNombre().equalsIgnoreCase(nombre) && medico.getApellido().equalsIgnoreCase(apellido) ){
                return medico;
            }
            ;
        }
        return null;
    }
    public void listarMedicos(){
        if(medicos.isEmpty()){
            JOptionPane.showMessageDialog(null, "no hay medicos en la lista");
            return;
        }
        List<Medico> copiaOrdenada = new ArrayList<>(medicos);
        copiaOrdenada.sort(Comparator.comparing(Medico::getEspecialidad).thenComparing(Medico::getApellido));
        String mostrarMedicos = "";
        for(Medico medico : copiaOrdenada){
            mostrarMedicos += medico + "\n";
        }
        JOptionPane.showMessageDialog(null, mostrarMedicos);
    }

}

