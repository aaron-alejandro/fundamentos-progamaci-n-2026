package tema5;

import java.util.Scanner;

public class CajeroMetodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int saldo=0,retiro=0;

        System.out.println("Ingrese su nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingrese su actual saldo:");
        saldo = sc.nextInt();
        System.out.println("Ingrese la cantidad a retirar:");
        retiro = sc.nextInt();
        if (verificacion(saldo, retiro)){
            saldo = saldo - retiro;
            comprobante(saldo,retiro,nombre);
        }
    }
    public static boolean verificacion(int saldo, int retiro){
        if (retiro > 0 && retiro <= saldo && retiro%50 == 0){
            return true;
        }else {
            System.out.println("Retiro Rechazado");
            return false;
        }
    }
    public static void comprobante(int saldo, int retiro,String nombre){
        System.out.println("Nombre : "+nombre);
        System.out.println("Cantidad retirada : $"+retiro);
        System.out.println("Saldo restante : $"+saldo);
    }
}
