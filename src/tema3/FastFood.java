package tema3;

import java.util.Scanner;

public class FastFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op;

        System.out.println("Selecciona algo del menu \nA)Hamburguesa"+
                "\nB)Hot-dog  \nC)Pizza");
        op = sc.nextLine();

        switch (op){
            case "A":
                System.out.println("Elegiste una Hamburguesa");
                break;
            case "B":
                System.out.println("Elegiste un Hot-dog");
                break;
            case "C":
                System.out.println("Elegiste un Pizza");
                break;

            default:
                System.out.println("Selecciono una opcion  no valida");
                break;
        }
    }
}
