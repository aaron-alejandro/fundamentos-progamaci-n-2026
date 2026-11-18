package tema5.operaciones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.println("Ingrese el valor para a:");
        a=sc.nextInt();
        System.out.println("Ingrese el valor para b:");
        b=sc.nextInt();

        System.out.println("Suma -> "+Operaciones.sumar(a,b));
        System.out.println("Resta -> "+Operaciones.restar(a,b));
        System.out.println("Multiplicacion -> "+Operaciones.multiplicar(a,b));
        System.out.println("Divicion -> "+Operaciones.dividir(a,b));
    }
}
