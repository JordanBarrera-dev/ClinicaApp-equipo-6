package generationClinica.model;

import generationClinica.interfaces.Registrable;

public class Medico implements Registrable {

    private int id;
    private String nombre;
    private String apellido;
    private Especialidad especialidad;

    public Medico(int id, String nombre, String apellido, Especialidad especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
    }

    public Medico(String nombre, String apellido, Especialidad especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("el nombre no puede estar vacio");
        }
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty()) {
            throw new IllegalArgumentException("el apellido no puede estar vacio");
        }
        this.apellido = apellido;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        if (especialidad == null) {
            throw new IllegalArgumentException("la especialidad no ser nula");
        }
        this.especialidad = especialidad;
    }

    @Override
    public boolean esValido() {
        if (nombre == null || nombre.trim().isEmpty() && apellido == null || apellido.trim().isEmpty() && especialidad == null){
            return true;}
        return false;
    }

    @Override
    public String getDatosRegistro() {
        return toString();
    }
    public String toString(){
        return "DR." + nombre + " " + apellido + "-" + especialidad;
    }
}
