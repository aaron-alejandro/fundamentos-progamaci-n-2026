package tema5;

import java.util.Scanner;

public class MetodosRetorno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;
        do {
        System.out.println("Selecciona una opcion \n1)Cuadrado \n2)Triangulo"+
                "\n3)Circulo\n4)Retangulo\n5)Salir");
        op = input.nextInt();
        switch(op){
            case 1:
                System.out.println("Area = "+String.format("%.2f",cuadrado()));
                break;
                case 2:
                    System.out.println("Area = "+String.format("%.2f",triangulo()));
                    break;
                    case 3:
                        System.out.println("Area = "+String.format("%.2f",circulo()));
                        break;
                        case 4:
                            System.out.println("Area = "+String.format("%.2f",retangulo()));
                            break;
                            case 5:
                                break;
        }
            }while (op!=5);
        System.out.println("Cerrando programa");
    }
    public static double cuadrado(){
        Scanner input = new Scanner(System.in);
        double l = 0;
        System.out.println("Ingresa el valor de un lado ");
        l = input.nextDouble();
        return (l*l);
    }
    public static double triangulo(){
        Scanner input = new Scanner(System.in);
        double b = 0, a = 0;
        System.out.println("Ingresa el valor de la base");
        b = input.nextDouble();
        System.out.println("Ingresa el valor de la altura");
        a = input.nextDouble();
        return   (b*a)/2;
    }
    public static double circulo(){
        Scanner input = new Scanner(System.in);
        double r = 0;
        System.out.println("Ingresa el valor del radio");
        r = input.nextDouble();
        return (Math.PI*Math.pow(r,2));
    }
    public static double retangulo(){
        Scanner input = new Scanner(System.in);
        double b = 0, a = 0;
        System.out.println("Ingresa el valor de la base");
        b = input.nextDouble();
        System.out.println("Ingresa el valor de la altura");
        a = input.nextDouble();
        return (b*a);
    }
}
