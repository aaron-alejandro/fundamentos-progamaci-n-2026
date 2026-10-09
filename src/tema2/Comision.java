package tema2;

import java.util.Scanner;

public class Comision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int COMISION = 10;
        final int LIMITE_RETIRO = 5000;
        double saldo,retiro,p;
        System.out.println("Ingresa tu saldo;");
        saldo = input.nextDouble();
        System.out.println("Ingresa la cantidad a retirar:");
        retiro = input.nextDouble();
        p=retiro+COMISION;
        if ( retiro > 0 && retiro <= LIMITE_RETIRO && p <= saldo){
            double saldoFinal = saldo-p;

            System.out.println("Retiro autorizado:");
            System.out.println("Monto retirado: $" + retiro);
            System.out.println("tema2.Comision: $" +  COMISION);
            System.out.println("Saldo: $" + saldoFinal);
        }else {
            System.out.println("Error");
            System.out.println("Saldo insuficiente");
        }
    }
}
