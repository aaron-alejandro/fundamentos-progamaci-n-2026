package tema2;

import java.util.Scanner;

public class DivisionPorCeroV2 {
    static void main() {
        Scanner input = new Scanner(System.in);
        int a, b, c; //c=a/b

        System.out.println("Introduce el valor de a: ");
        a = input.nextInt();

        System.out.println("Introduce el valor de b: ");
        b = input.nextInt();
        if (b != 0){
            c =a /b;
            System.out.println("c = " + c);

        }else {
            System.out.println("No puedes dividir por 0");
        }
    }
}
