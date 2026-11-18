package tema5.areas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        System.out.println("Selecciona una opcion \n1)Cuadrado \n2)Triangulo");
        op = sc.nextInt();
        Areas.menu(op);
    }
}
