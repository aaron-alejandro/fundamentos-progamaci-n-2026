package tema3;
/*
* Instituto Tecnologico de Pachuca
* AARON ALEJANDRO ANTONIO LORENZO
* 2026-10-14
* Programa que evalua en una serie de numeros si es par o impar
* */

import java.util.Scanner;

public class ParImparWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, contador;
        int res;

        do { // Se cambió 'while' por 'do' para iniciar la estructura do-while
            contador = 1; // Se reinicia el contador en cada repetición

            System.out.println("Ingrese un numero: ");
            n = input.nextInt();

            while (contador <= n) {
                if (contador % 2 == 0) { // ¿contador dividido entre 2 tiene residuo cero?
                    System.out.println("El número " + contador + " es par");
                } else {
                    System.out.println("El número " + contador + " es impar");
                }
                contador++;
            }

            System.out.println("¿Desea ingresar otro numero? \n1) Si \n2) No");
            res = input.nextInt();

        } while (res == 1);

        System.out.println("Programa finalizado.");
    }
}