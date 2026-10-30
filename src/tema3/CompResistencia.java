package tema3;

import java.util.Scanner;

public class CompResistencia {
    public static void main(String args[]) {
        final int SI = 1;
        final int NO = 2;
        Scanner sc = new Scanner(System.in);
        int participntes = 0, respuesta;
        double mayorDistancia = -1, acumuladorParticipantes = 0, distancia = -1;
        int gandor = 0, rBajas = 0, rMedio = 0, rAlto = 0, distAcumulada = 0;

        do {
            System.out.println("Ingresa la cantidad de participantes ");
            participntes = sc.nextInt();
            while (participntes <= 0) {
                System.out.println("Cantidad no valida ingrese un numero mayor a 0");
                participntes = sc.nextInt();
            }

            mayorDistancia = -1;
            rBajas = 0;
            rMedio = 0;
            rAlto = 0;
            distAcumulada = 0;
            gandor = 0;

            for (int i = 1; i <= participntes; i++) {
                System.out.println("\n--- Participante " + i + " ---");
                acumuladorParticipantes = 0;

                for (int j = 1; j <= 5; j++) {
                    distancia = -1;
                    while (distancia < 0) {
                        System.out.println("Ingresa la distancia para la ronda " + j + ": ");
                        distancia = sc.nextDouble();

                        if (distancia < 0) {
                            System.out.println("Error la distancia no puede ser menor a 0");
                        }
                    }

                    acumuladorParticipantes += distancia;

                    if (distancia < 2) {
                        System.out.println("Rendimiento BAJO");
                        rBajas++;
                    } else if (distancia <= 4) {
                        System.out.println("Rendimiento MEDIO");
                        rMedio++;
                    } else {
                        System.out.println("Rendimiento ALTO");
                        rAlto++;
                    }
                }

                double promedio = acumuladorParticipantes / 5.0;
                distAcumulada += (int) acumuladorParticipantes;

                System.out.printf("Resultados -> Total: %.2f KM | Promedio: %.2f KM\n", acumuladorParticipantes, promedio);

                if (acumuladorParticipantes > mayorDistancia) {
                    mayorDistancia = acumuladorParticipantes;
                    gandor = i;
                }
            }

            int opcion;
            do {
                System.out.println("\n=== MENÚ DE ESTADÍSTICAS ===");
                System.out.println("1. Mostrar ganador");
                System.out.println("2. Mostrar conteo de rondas por categoría");
                System.out.println("3. Mostrar distancia acumulada total");
                System.out.println("4. Salir del menú de estadísticas");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("El ganador es el Participante " + gandor + " con " + mayorDistancia + " KM acumulados.");
                        break;
                    case 2:
                        System.out.println("Conteo de rondas:");
                        System.out.println("- Bajos (< 2 km): " + rBajas);
                        System.out.println("- Medios (2 a 4 km): " + rMedio);
                        System.out.println("- Altos (> 4 km): " + rAlto);
                        break;
                    case 3:
                        System.out.println("Distancia acumulada global: " + distAcumulada + " KM");
                        break;
                    case 4:
                        System.out.println("Saliendo del menú...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } while (opcion != 4);

            System.out.println("\nFinalizar programa \n1)SI  \n2)NO");
            respuesta = sc.nextInt();
        } while (respuesta != SI);

        System.out.println("¡Programa finalizado con éxito!");
        sc.close();
    }
}