package tema5;

import java.util.Scanner;

public class MetodosParametros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0,a,b;

        System.out.println("Ingresa una opcion\n 1)Suma \n 2)Resta"+
                "\n 3)Multiplicacion \n 4)Division ");
        op = sc.nextInt();
        System.out.println("ingresa el valor para a");
        a=sc.nextInt();
        System.out.println("ingresa el valor para b");
        b=sc.nextInt();
        switch (op){
            case 1:
                suma(a,b);
                break;
                case 2:
                    resta(a,b);
                    break;
                    case 3:
                        multiplicacion(a,b);
                        break;
                        case 4:
                        division(a,b);
                        break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
        }
    }
    public static void suma(int a,int b){
        System.out.println("Suma = "+(a+b));
    }
    public static void resta(int a,int b){
        System.out.println("Resta = "+(a-b));
    }
    public static void multiplicacion(int a,int b){
        System.out.println("Multiplicacion = "+(a*b));
    }
    public static void division(int a,int b){
        if (b==0){
            System.out.println("No se puede dividir por zero");
        }
        else {
            System.out.println("Division = "+(a/b));
        }
    }
}
