package tema3;

import java.util.Scanner;

public class EjemploFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iteraciones;

        System.out.println("Ingrese el numero de iteraciones: ");
        iteraciones = sc.nextInt();

        for (int i = 1; i<=iteraciones; i++){//INICIO DEL FOR
            System.out.println(i);
        }//FIN DEL FOR

    }
}
