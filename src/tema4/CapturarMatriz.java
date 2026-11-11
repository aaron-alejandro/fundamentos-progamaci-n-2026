package tema4;

import java.util.Scanner;

public class CapturarMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] numeros = new int[2][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {

                System.out.println("Ingresa el valor de la fila "+ i +" y columna "+j+" : ");
                numeros[i][j] = input.nextInt();

            }
            System.out.println("Mostrar contenido de la matriz");
        }
        System.out.println("Mostrar contenido de la matriz : ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j]+"\t");
            }
            System.out.println();

        }
    }
}
