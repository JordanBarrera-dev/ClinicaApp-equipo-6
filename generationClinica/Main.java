package generationClinica;


import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        String numeroOpcion;

        do
        {
            numeroOpcion = mostrarMenu();

            if (numeroOpcion == null || numeroOpcion.isEmpty()) numeroOpcion = "0";

            switch (numeroOpcion)
            {
                case "1": registroPaciente(); break;
                case "2": break;
                case "3": break;
                case "4": break;
                case "5": break;
                case "6": break;
                case "7": break;
                case "8": break;
                case "9": break;
                case "10": break;
                case "0":
                    JOptionPane.showMessageDialog(null,
                            "Gracias por usar el programa");
                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                            "OPCIÓN INVALIDA");
                    break;
            }

        } while (!numeroOpcion.equals("0"));
    }

    public static String mostrarMenu()
    {
        return JOptionPane.showInputDialog(
                """                
                        =============================
                             CLINICAAPP MENU
                        =============================
                        
                         1. Registrar paciente
                         2. Registrar medico
                         3. Asignar turno
                         4. Listar turnos del dia
                         5. Cancelar turno
                         6. Ver turnos por medico
                         7. Ver turnos por paciente
                         8. Cambiar estado turno
                         9. Listar pacientes
                        10. Listar medicos
                        
                         0. Salir
                        ===============================
                        
                         Digite el numero de la opción:
                        """);
    }

    public static void registroPaciente()
    {

    }

}

