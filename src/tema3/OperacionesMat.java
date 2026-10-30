package tema3;

import java.util.Scanner;

public class OperacionesMat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op=-1,resp,n,r;

        do {
            op = -1;

            while (op<1||op>5){
                System.out.println("1) calcular el cuadrado de un número \n2) calcular el cubo de un número \n3) determinar si un número es par o impar \n4) calcular la suma de los números desde 1 hasta un numero ingresado  \n5) salir del programa.");
                op = sc.nextInt();

                if (op<1||op>5){
                    System.out.println("Valor no valido");
                }
            }

            if (op != 5) {
                System.out.println("Ingresa un numero");
                n = sc.nextInt();

                switch (op){
                    case 1:
                        System.out.println("El cuadrado del numero "+n+" es = "+(Math.pow(n,2)));
                        break;

                    case 2:
                        System.out.println("El cubo del numero "+n+" es = "+(Math.pow(n,3)));
                        break;

                    case 3:
                        if (n % 2 == 0){
                            System.out.println("El numero "+n+" es par");
                        }else {
                            System.out.println("El numero "+n+" es impar");
                        }
                        break;

                    case 4:
                        if (n > 0) {
                            int suma = 0;
                            for (int i = 1; i <= n; i++) {
                                suma += i;
                            }
                            System.out.println("La suma desde 1 hasta " + n + " es = " + suma);
                        } else {
                            System.out.println("Error: El número debe ser positivo.");
                        }
                        break;
                }
            } else {
                System.out.println("¡Gracias por usar el programa!");
                break;
            }

            System.out.println("Salir del programa \n5)SI \n1)NO");
            resp=sc.nextInt();

        } while (resp != 5);


    }
}
