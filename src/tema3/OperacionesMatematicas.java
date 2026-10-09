package tema3;

import java.util.Scanner;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion,a,b;

        System.out.println("1)Suma \n2)Resta \n3)Multiplicacion \n4)Division");
         opcion = sc.nextInt();

        System.out.println("Ingresa el valor para a");
        a = sc.nextInt();

        System.out.println("Ingresa el valor para b");
        b = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado = " + (a+b));
                break;
            case 2:
                System.out.println("Resultado = " + (a-b));
                break;
            case 3:
                System.out.println("Resultado = " + (a*b));
                break;
            case 4:
                if (b != 0){
                    System.out.println("Resultado = " + (a/b));
                }else {
                    System.out.println("Nopuedes dividir entre 0");
                }

        }
    }
}
