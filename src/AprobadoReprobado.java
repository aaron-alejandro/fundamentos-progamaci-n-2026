import java.util.Scanner;
/*
 *INSTITUTO TECNOLOGICO DE PACHUCA
 * FUNDAMENTOS DE PROGRAMACIÓN
 * EJEERCICIO: Jubilacion
 * AARON ALEJANDRO ANTONIO LORENZO 26201026
 * 25-09-2026 */
public class AprobadoReprobado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        double calificacion = 0;

        System.out.println("Escribe tu nombre");
        nombre = input.nextLine();

        System.out.println("Ingresa tu calificacion");
        calificacion = input.nextDouble();

        if (calificacion >= 70){

            System.out.println(nombre + " has aprobado la materia");

        }else {

            System.out.println(nombre + " no has aprobado la materia");

        }
    }
}
