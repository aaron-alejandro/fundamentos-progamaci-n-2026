package tema3;

import java.util.Scanner;

public class AreasDeFiguras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        double a,b;

        System.out.println("1)Cuadrado \n2)Rectangulo \n3)Triangulo \n4)Circulo");
        op = sc.nextInt();

        switch(op){
            case 1:
                System.out.println("Ingresa la medida de sus lados");
                a = sc.nextDouble();
                System.out.println("Area = " +(Math.pow(a,2)));
                break;
            case 2:
                System.out.println("Ingresar la medida de su base");
                b = sc.nextDouble();
                System.out.println("Ingresar la medida de su altura");
                a = sc.nextDouble();
                System.out.println("Area = " + (b*a));
                break;
            case 3:
                System.out.println("Ingresar la medida de su base");
                b = sc.nextDouble();
                System.out.println("Ingresar la medida de su altura");
                a = sc.nextDouble();
                System.out.println("Area = " + ((b*a)/2));
                break;
            case 4:
                System.out.println("Ingresa la medida del radio");
                a = sc.nextDouble();
                System.out.println("Area = " + (Math.PI*Math.pow(a,2)));
                break;

            default:
                System.out.println("Opcion no valida");
        }
    }
}
