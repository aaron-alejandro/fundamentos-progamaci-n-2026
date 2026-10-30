package tema3;

import java.util.Scanner;

public class NumerosAmigos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SI = 1;
        final int NO = 2;
        int n1, n2, respuesta,respuesta2;

        do {

            System.out.println("Ingresa el primer numero: ");
            n1 = input.nextInt();
            while (n1 <0){
                System.out.println("Error el numero tiene que ser positivo");
            }
            System.out.println("Ingresa el segundo numero: ");
            n2 = input.nextInt();
            while (n2 <0){
                System.out.println("Error el numero tiene que ser positivo");
            }

            int sum1 = 0;
            int cantDiv1 = 0;
            for (int i = 1; i <= n1 / 2; i++) {
                if (n1 % i == 0) {
                    sum1 += i;
                    cantDiv1++;
                }
            }

            int sum2 = 0;
            int cantDiv2 = 0;
            for (int i = 1; i <= n2 / 2; i++) {
                if (n2 % i == 0) {
                    sum2 += i;
                    cantDiv2++;
                }
            }
            System.out.println("Deseas mostrar la suma de los divisores \n1)SI \n2)NO");
            respuesta2=input.nextInt();
            switch (respuesta2){
                case SI:
                    System.out.println("La suma de los divisores propios de " + n1 + " es: " + sum1+" total de divisores "+cantDiv1);
                    System.out.println("La suma de los divisores propios de " + n2 + " es: " + sum2+" total de divisores "+cantDiv2);
                    break;
                case NO:

                    break;
            }
            if (sum1 == n2 && sum2 == n1) {
                System.out.println("Los numeros " + n1 + " y " + n2 + " son amigos");
            } else {
                System.out.println("Los numeros " + n1 + " y " + n2 + " no son amigos");
            }

            System.out.println("Deseas analizar otras parejas \n1)SI \n2)NO");
            respuesta = input.nextInt();

        } while (respuesta == SI);
        System.out.println("Finalizando el programa");
    }
}
