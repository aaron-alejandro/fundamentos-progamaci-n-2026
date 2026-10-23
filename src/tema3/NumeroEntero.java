package tema3;

import java.util.Scanner;

public class NumeroEntero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N,respuesta;


        do {
            System.out.println("Ingresa un numero entero positivo: ");
            N = input.nextInt();

            if (N > 0) {

                int sumaPares = 0,divisibles3 = 0;
                int sumaPrimos = 0, contadorPrimos = 0;

                for (int i = 2; i <= N; i++) {

                    if (i % 2 == 0) {
                        sumaPares += i;

                    }

                    if (i % 3 == 0) {
                        System.out.println("El numero " + i + " es divisible entre 3");
                        divisibles3++;
                    }
                    boolean esPrimo = true;
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                    if (esPrimo) {
                        System.out.println("El numero " + i + " es primo");
                        sumaPrimos += i;
                        contadorPrimos++;
                    }
                }
                double promedio = 0;
                System.out.println("La suma de los numeros primos de 1 a " + N + " es = " + sumaPares);
                System.out.println("El promedio de los numeros primos es = " + (promedio = (double) sumaPrimos / contadorPrimos));
                System.out.println("Total de numeros divisibles entre 3 = " + divisibles3);
            }else {
                System.out.println("Numero no valido");
            }
            System.out.println("¿Desea cerrar el programa? \n1)SI \n2)NO");
            respuesta = input.nextInt();
        }while (respuesta !=1);
    }
}
