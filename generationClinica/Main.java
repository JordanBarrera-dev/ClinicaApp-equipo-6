package generationClinica;

public class Main
{
    public static void main(String[] args)
    {
        mostrarMenu();
    }


    public static void mostrarMenu()
    {
        System.out.println("""
            ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
            ■                                      ■
            ■          CLINICAAPP — MENU           ■
            ■                                      ■
            ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
            ■  1. Registrar paciente               ■
            ■  2. Registrar medico                 ■
            ■  3. Asignar turno                    ■
            ■  4. Listar turnos del dia            ■
            ■  5. Cancelar turno                   ■
            ■  6. Ver turnos por medico            ■
            ■  7. Ver turnos por paciente          ■
            ■  8. Cambiar estado de turno          ■
            ■  9. Listar pacientes                 ■
            ■  10. Listar medicos                  ■
            ■                                      ■
            ■  0. Salir                            ■
            ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■
            """);
    }
}
