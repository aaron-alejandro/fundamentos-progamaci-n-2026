package tema3;

import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int AUTOMOVIL = 20; final int CAMIONETA = 30; final int MOTOCICLETA = 10;
        int n, v, totalv = 0;
        int auto = 0, camioneta = 0, moto = 0;
        double h, pago, total = 0;

        do {
            System.out.println("======Menu======");
            System.out.println("1) Registrar un vehiculo \n2) Consultar un resumen del dia \n3) Salir");
            n = sc.nextInt();

            if (n == 1) {
                System.out.println("======Tipo de vehiculo======");
                System.out.println("1) Automovil:$20 \n2) Camioneta:$30 \n3) Motocicleta:$10");
                v = sc.nextInt();
                System.out.println("Total de horas que permanecio en el estacionamiento:");
                h = sc.nextDouble();

                switch (v) {
                    case 1:
                        pago = h * AUTOMOVIL;
                        System.out.println("Total a pagar = " + pago);
                        total = total + pago;
                        totalv++;
                        auto++;
                        break;
                    case 2:
                        pago = h * CAMIONETA;
                        System.out.println("Total a pagar = " + pago);
                        total = total + pago;
                        totalv++;
                        camioneta++;
                        break;
                    case 3:
                        pago = h * MOTOCICLETA;
                        System.out.println("Total a pagar = " + pago);
                        total = total + pago;
                        totalv++;
                        moto++;
                        break;
                    default:
                        System.out.println("Tipo de vehiculo no valido");
                        break;
                }
            } else if (n == 2) {
                System.out.println("======RESUMEN DEL DIA======");
                System.out.println("Vehiculos atendidos: " + totalv);
                System.out.println("Automoviles: " + auto);
                System.out.println("Camionetas: " + camioneta);
                System.out.println("Motocicletas: " + moto);
                System.out.println("Total recaudado: " + total);
            } else if (n != 3) {
                System.out.println("Opcion no valida");
            }
        } while (n != 3);
        System.out.println("Saliendo del programa");
    }
}