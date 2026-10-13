package tema3;

import java.util.Scanner;

public class SumaDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acumulador = 0, x = 0,contador = 0 ;
        int respuesta = 0;

        do {
            System.out.println("Ingrese un numero para  sumar: ");
            x = sc.nextInt();
            acumulador = acumulador + x;
            //contador = contador + 1;
            contador ++;
            System.out.println("Desea ingresar otro numero?  \n1) Si \n2) No ");
            respuesta = sc.nextInt();
        }while (respuesta == 1);
        System.out.println("Respuesta: " + acumulador);
        System.out.println("Se sumaron = " + contador + " numeros");
    }
}
