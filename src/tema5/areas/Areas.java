package tema5.areas;

import java.util.Scanner;

public class Areas {
    static Scanner sc = new Scanner(System.in);
    public static void menu(int op){
        switch(op){
            case 1:
                System.out.println(cuadrado());
                break;
                case 2:
                    System.out.println(triangulo());
                    break;
            default:
        }
    }
    private static int cuadrado(){
        System.out.println("Ingrese el valor de un lado");
        int l= sc.nextInt();
        double resultado = Math.pow(l,2);
        return (int)resultado;
    }
    private static int triangulo(){
        System.out.println("Ingresa el valor de la base: ");
        int a=sc.nextInt();
        System.out.println("Ingresa el valor de la altura: ");
        int b=sc.nextInt();
        double resultado = (b*a)/2;
        return (int)resultado;
    }
}
