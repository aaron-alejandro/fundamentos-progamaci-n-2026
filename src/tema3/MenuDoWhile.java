package tema3;

import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op = 0;
        int a , b;

        do {
            System.out.println("*** Selecciona una opcion ***");
            System.out.println("1)Suma \n2)Resta \n3)Multiplicacion \n4)Division");
            op = input.nextInt();
            if (op !=5){
                System.out.println("Dame el valor para a");
                a = input.nextInt();
                System.out.println("Dame el valor para b");
                b = input.nextInt();
                switch (op){
                    case 1:

                        System.out.println("Suma = " + (a+b));
                        break;
                    case 2:

                        b = input.nextInt();

                        System.out.println("Resta = " + (a-b));
                        break;
                    case 3:
                        System.out.println("Dame el valor para a");
                        a = input.nextInt();
                        System.out.println("Dame el valor para b");
                        b = input.nextInt();
                        System.out.println("Resta = " + (a*b));
                        break;
                    case 4:
                        System.out.println("Dame el valor para a");
                        a = input.nextInt();
                        System.out.println("Dame el valor para b");
                        b = input.nextInt();
                        break;
                }
            }
        } while (op!=3);
        System.out.println("Saliendo del programa");
    }
}