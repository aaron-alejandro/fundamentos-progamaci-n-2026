package tema3;

import java.util.Scanner;

public class NumeroEntero2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int OPCION_PARES = 1;
        final int OPCION_IMPARES = 2;
        final int OPCION_MULTIPLOS_5 = 3;

        int respuestaDoWhile;

        do {
            int N = 0;

            System.out.println("Ingresa un numero entero positivo (N): ");
            N = input.nextInt();
            while (N <= 0) {
                System.out.println("Numero no valido. Ingresa un entero positivo: ");
                N = input.nextInt();
            }

            int sumaDiv4 = 0;
            int contMultiplos3 = 0;
            int contAmbos = 0;

            int sumaPares = 0, countPares = 0;
            int sumaImpares = 0, countImpares = 0;
            int countMultiplos5 = 0;

            for (int i = 1; i <= N; i++) {

                if (i % 4 == 0) {
                    sumaDiv4 += i;
                }

                if (i % 3 == 0) {
                    contMultiplos3++;
                }

                if (i % 3 == 0 && i % 4 == 0) {
                    contAmbos++;
                }

                if (i % 2 == 0) {
                    sumaPares += i;
                    countPares++;
                } else {
                    sumaImpares += i;
                    countImpares++;
                }

                if (i % 5 == 0) {
                    countMultiplos5++;
                }
            }

            System.out.println("\n--- RESULTADOS DEL ANÁLISIS (1 a " + N + ") ---");
            System.out.println("Suma de los números divisibles entre 4 = " + sumaDiv4);
            System.out.println("Cantidad de números múltiplos de 3 = " + contMultiplos3);
            System.out.println("Cantidad de números divisibles entre ambos (3 y 4) = " + contAmbos);

            int opcionSwitch;
            System.out.println("\n¿Qué estadísticas deseas visualizar?");
            System.out.println("1) Estadísticas de números PARES");
            System.out.println("2) Estadísticas de números IMPARES");
            System.out.println("3) Estadísticas de MÚLTIPLOS DE 5");
            System.out.print("Elige una opción: ");
            opcionSwitch = input.nextInt();

            switch (opcionSwitch) {
                case OPCION_PARES:
                    System.out.println("\n--- Estadísticas de Pares ---");
                    System.out.println("Cantidad de pares: " + countPares);
                    System.out.println("Suma de pares: " + sumaPares);
                    break;
                case OPCION_IMPARES:
                    System.out.println("\n--- Estadísticas de Impares ---");
                    System.out.println("Cantidad de impares: " + countImpares);
                    System.out.println("Suma de impares: " + sumaImpares);
                    break;
                case OPCION_MULTIPLOS_5:
                    System.out.println("\n--- Estadísticas de Múltiplos de 5 ---");
                    System.out.println("Cantidad de múltiplos de 5: " + countMultiplos5);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            System.out.println("\n¿Desea cerrar el programa? \n1) SI  \n2) NO");
            respuestaDoWhile = input.nextInt();

        } while (respuestaDoWhile != 1);

        input.close();
        System.out.println("Programa finalizado.");
    }
}