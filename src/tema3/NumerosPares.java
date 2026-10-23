package tema3;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int VALOR_MINIMO = 1;
        int respuesta;

        do {
            // Variables dentro para que se reinicien en cada cálculo
            int pares = 0;
            int impares = 0;
            int sumaPares = 0;
            int sumaImpares = 0;
            int N;

            System.out.println("Ingresa un numero entero positivo mayor a 0:");
            N = sc.nextInt();

            while (N < VALOR_MINIMO) {
                System.out.println("Numero no valido, debe ser mayor que 0. Ingresa otro numero:");
                N = sc.nextInt();
            }

            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) {
                    sumaPares += i;
                    pares++;
                } else {
                    sumaImpares += i;
                    impares++;
                }
            }

            System.out.println("\n--- Resultados de 1 a " + N + " ---");
            System.out.println("Total de numeros pares: " + pares);
            System.out.println("Suma de numeros pares = " + sumaPares);
            System.out.println("Total de numeros impares: " + impares);
            System.out.println("Suma de numeros impares = " + sumaImpares);

            System.out.println("\n¿Desea realizar otro calculo?\n1) Si\n2) No");
            respuesta = sc.nextInt();

        } while (respuesta == 1);

        System.out.println("Programa finalizado.");
        sc.close();
    }
}