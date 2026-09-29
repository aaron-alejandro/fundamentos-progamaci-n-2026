import java.util.Scanner;
/*
 *INSTITUTO TECNOLOGICO DE PACHUCA
 * FUNDAMENTOS DE PROGRAMACIÓN
 * EJEERCICIO: HOLA MUNDO
 * AARON ALEJANDRO ANTONIO LORENZO 26201026
 * 23-09-2026 */
public class HolaMundo {
    public static void main(String[] args) {
        String nombre;
        final String SALUDO = "Hola, ";
        Scanner sc = new Scanner(System.in);

        System.out.println("========== Escribe tu nombre:========== ");
        nombre = sc.nextLine();
        System.out.println(SALUDO+ nombre);

    }
}