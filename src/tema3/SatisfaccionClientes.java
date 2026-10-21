package tema3;

import java.util.Scanner;

public class SatisfaccionClientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clientes, respuesta;

        do {

            int satisfecho = 0;
            int insatisfecho = 0;
            int acumuladorCalificacion = 0;
            int calificacionMaxima = 0;

            System.out.println("Ingresa el numero de clientes a los que se les realizara la encuesta: ");
            clientes = sc.nextInt();

            if (clientes > 0) {
                for (int i = 0; i < clientes; i++) {
                    int calificacion;
                    do {
                        System.out.println("Ingresa una calificacion del 1 al 10 : ");
                        calificacion = sc.nextInt();
                        if (calificacion < 1 || calificacion > 10) {
                            System.out.println("Calificacion fuera de rango intenta de nuevo.");
                        }
                    } while (calificacion < 1 || calificacion > 10);

                    acumuladorCalificacion += calificacion;

                    if (calificacion > calificacionMaxima) {
                        calificacionMaxima = calificacion;
                    }

                    if (calificacion >= 7) {
                        satisfecho++;
                    } else {
                        insatisfecho++;
                    }
                }


                double promedio = (double) acumuladorCalificacion / clientes;

                if (promedio >= 8) {
                    System.out.println("Excelente servicio");
                } else if (promedio >= 6 && promedio < 8) {
                    System.out.println("Servicio aceptable");
                } else {
                    System.out.println("Requiere mejorar el servicio");
                }

                System.out.println("----------------------------------------");
                System.out.println("Cantidad de clientes encuestados : " + clientes);
                System.out.println("Suma de las calificaciones       : " + acumuladorCalificacion);
                System.out.println("Promedio general                 : " + promedio);
                System.out.println("Clientes satisfechos             : " + satisfecho);
                System.out.println("Clientes insatisfechos           : " + insatisfecho);
                System.out.println("Calificacion mas alta            : " + calificacionMaxima);
                System.out.println("----------------------------------------");

            } else {
                System.out.println("Datos erroneos. El numero de clientes debe ser mayor a 0.");
            }

            System.out.println("¿Deseas realizar otra encuesta?");
            System.out.println("1) Si \n2) No ");
            respuesta = sc.nextInt();

        } while (respuesta == 1);

        System.out.println("Programa finalizado.");
        sc.close();
    }
}