package generationClinica.model;


import generationClinica.interfaces.Registrable;

public class Paciente implements Registrable {

    private int id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;

    public Paciente(int id, String cedula, String nombre, String apellido, String telefono) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Paciente(String nombre, String cedula, String apellido, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        if (cedula == null || cedula.trim().isEmpty()) {
            throw new IllegalArgumentException("La cedula no puede estar vacía.");
        }
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre.trim();
    }

    public String getApellido(){
        return apellido;}

    public void setApellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty()) {
            throw new IllegalArgumentException("El apellido no puede estar vacío.");
        }
        this.apellido = apellido.trim();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.trim().matches("^[0-9]{7,10}$\n")){
            throw new IllegalArgumentException("El telefono es invalido");
        }
        this.telefono = telefono;
    }

    @Override
    public String getDatosRegistro() {
        return "";
    }

    @Override
    public boolean esValido() {
        if (cedula == null || cedula.trim().isEmpty() && nombre == null || nombre.trim().isEmpty() && apellido == null || apellido.trim().isEmpty() && telefono.trim().matches("^[0-9]{7,10}$\n")){
            return true;
        }
        return false;
    }
    public String toString(){
        return nombre + "" + apellido + "" + "-" + cedula + "" + "-" + telefono;
    }
}
