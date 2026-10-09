package tema2;

import java.util.Scanner;
/*
 *INSTITUTO TECNOLOGICO DE PACHUCA
 * FUNDAMENTOS DE PROGRAMACIÓN
 * EJEERCICIO: tema2.Jubilacion
 * AARON ALEJANDRO ANTONIO LORENZO 26201026
 * 25-09-2026 */
public class Jubilacion {
    public static void main(String [] args) {
        String nombre;
        int edad = 0;
        Scanner sc = new Scanner(System.in);
        final int EDAD_JUBILACION = 65;
        final int MAYORIA_DE_EDAD = 18;

        System.out.println("Escribetu nombre");
        nombre = sc.nextLine();
        System.out.println("Escribe tu edad");
        edad = sc.nextInt();

        if (edad >= EDAD_JUBILACION) {
            System.out.println(nombre + " Tiene " + edad + " años y esta listo para jubilarse");
        } else if (edad >= MAYORIA_DE_EDAD && edad < EDAD_JUBILACION) {//inicio else-if
            System.out.println(nombre + " Es mayor de edad");
        }//fin else.if
        else{//sino
            System.out.println(nombre + " Tiene " + edad + " años y le faltan " + (EDAD_JUBILACION - edad) + " años para jubilarse");
        }
    }
}
