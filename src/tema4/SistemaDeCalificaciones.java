package tema4;

import java.util.Scanner;

public class SistemaDeCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de estudiantes del grupo:");
        int estudiantes = sc.nextInt();

        while (estudiantes <= 0) {
            System.out.println("Debe ser al menos 1 estudiante. Ingresa nuevamente:");
            estudiantes = sc.nextInt();
        }

        int[] calificaciones = new int[estudiantes];
        int aprobados = 0;
        int reprobados = 0;
        int suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Ingresa la calificacion del alumno " + (i + 1));
            int calif = sc.nextInt();

            while (calif < 0 || calif > 100) {
                System.out.println("La calificacion tiene que estar en un rango de 0 a 100");
                System.out.println("Ingresa otra vez la calificacion del alumno " + (i + 1));
                calif = sc.nextInt();
            }

            calificaciones[i] = calif;
            suma += calif;

            if (calif >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        int calificacionMasAlta = calificaciones[0];
        int calificacionMasBaja = calificaciones[0];

        for (int i = 1; i < calificaciones.length; i++) {
            if (calificaciones[i] > calificacionMasAlta) {
                calificacionMasAlta = calificaciones[i];
            }
            if (calificaciones[i] < calificacionMasBaja) {
                calificacionMasBaja = calificaciones[i];
            }
        }

        System.out.println("/---Calificaciones Ingresadas---/");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + calificaciones[i]);
        }

        double promedio = (double) suma / estudiantes;
        double porcentajeAprobacion = ((double) aprobados / estudiantes) * 100;
        System.out.println("Calificacion mas alta = " + calificacionMasAlta);
        System.out.println("Calificacion mas baja = " + calificacionMasBaja);
        System.out.println("El promedio del grupo es = " + promedio);
        System.out.println("Porcentaje de aprobacion = %" + porcentajeAprobacion);
        System.out.println("Numero de reprobados = " + reprobados);
        System.out.println("Numero de aprobados = " + aprobados);


    }
}