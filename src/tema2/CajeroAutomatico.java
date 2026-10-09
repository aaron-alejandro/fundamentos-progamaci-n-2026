package tema2;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int LIMITE_RETIRO = 5000;
        double saldo = 0,retiro,rsaldo;
        System.out.println("Ingresar el saldo disponible: ");
        saldo = sc.nextDouble();

        System.out.println("Ingresar la cantidad a retirar: ");
        retiro = sc.nextDouble();
        rsaldo = saldo - retiro;
        if (retiro > 0 && retiro <= LIMITE_RETIRO && retiro <= saldo) {
            System.out.println("Cantidad retirada: $" + retiro + " saldo restante: $" + rsaldo);
            if (rsaldo < 500) {
                System.out.println("Tu saldo restante es menor a $500");
            }
        }else if (retiro > LIMITE_RETIRO){
            System.out.println("La cantidad a retirar exede el limite");
        }else if (retiro > saldo){
            System.out.println("La cantidad a retirar es mayor a tu saldo");
        }else {
            System.out.println("Cantidad invalida");
        }
    }
}
