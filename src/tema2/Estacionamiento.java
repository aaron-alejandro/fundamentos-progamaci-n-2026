package tema2;

import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int TARIFA_MOTO = 10;
        final int TARIFA_AUTO = 20;
        final int TARIFA_CAM = 30;
        final double DESC5 = 0.1;
        final double DESC10 = 0.2;

        int vehiculo;
        double horas, costo, desc;

        System.out.println("Ingrese el vehiculo: 1. moto, 2. automovil, 3. camioneta ");
        vehiculo = input.nextInt();
        System.out.println("Ingrese las horas que permanecio en el estacionamiento:");
        horas = input.nextDouble();


        if (horas <= 0) {
            System.out.println("La cantidad de horas no es válida.");
            input.close();
            return;
        }

        if (vehiculo == 1) {
            if (horas > 5 && horas <= 10) {
                costo = TARIFA_MOTO * horas;
                desc = costo - (costo * DESC5);
                System.out.println("Tipo de vehiculo: MOTO");
                System.out.println("Horas: " + horas);
                System.out.println("Tarifa: " + TARIFA_MOTO);
                System.out.println("Subtotal: " + costo);
                System.out.println("Descuento: 10%");
                System.out.println("Total a pagar: $" + desc);
            } else if (horas > 10) {
                costo = TARIFA_MOTO * horas;
                desc = costo - (costo * DESC10);
                System.out.println("Tipo de vehiculo: MOTO");
                System.out.println("Horas: " + horas);
                System.out.println("Tarifa: " + TARIFA_MOTO);
                System.out.println("Subtotal: " + costo);
                System.out.println("Descuento: 20%");
                System.out.println("Total a pagar: $" + desc);
            } else {
                costo = TARIFA_MOTO * horas;
                System.out.println("Tipo de vehiculo: MOTO");
                System.out.println("Horas: " + horas);
                System.out.println("Tarifa: " + TARIFA_MOTO);
                System.out.println("Subtotal: " + costo);
                System.out.println("Descuento: 0%");
                System.out.println("Total a pagar: $" + costo);
            }
        } else if (vehiculo == 2) {
            if (horas > 5 && horas <= 10) {
                costo = TARIFA_AUTO * horas;
                desc = costo - (costo * DESC5);
                System.out.println("Tipo de vehiculo: AUTOMOVIL");
                System.out.println("Horas: " + horas);
                System.out.println("Tarifa: " + TARIFA_AUTO);
                System.out.println("Subtotal: " + costo);
                System.out.println("Descuento: 10%");
                System.out.println("Total a pagar: $" + desc);
            } else if (horas > 10) {
                costo = TARIFA_AUTO * horas;
                desc = costo - (costo * DESC10);
                System.out.println("Tipo de vehiculo: AUTOMOVIL");
                System.out.println("Horas: " + horas);
                System.out.println("Tarifa: " + TARIFA_AUTO);
                System.out.println("Subtotal: " + costo);
                System.out.println("Descuento: 20%");
                System.out.println("Total a pagar: $" + desc);
            } else {
                costo = TARIFA_AUTO * horas;
                System.out.println("Tipo de vehiculo: AUTOMOVIL");
                System.out.println("Horas: " + horas);
                System.out.println("Tarifa: " + TARIFA_AUTO);
                System.out.println("Subtotal: " + costo);
                System.out.println("Descuento: 0%");
                System.out.println("Total a pagar: $" + costo);
            }
        } else if (vehiculo == 3) {
            if (horas > 5 && horas <= 10) {
                costo = TARIFA_CAM * horas;
                desc = costo - (costo * DESC5);
                System.out.println("Tipo de vehiculo: CAMIONETA");
                System.out.println("Horas: " + horas);
                System.out.println("Tarifa: " + TARIFA_CAM);
                System.out.println("Subtotal: " + costo);
                System.out.println("Descuento: 10%");
                System.out.println("Total a pagar: $" + desc);
            } else if (horas > 10) {
                costo = TARIFA_CAM * horas;
                desc = costo - (costo * DESC10);
                System.out.println("Tipo de vehiculo: CAMIONETA");
                System.out.println("Horas: " + horas);
                System.out.println("Tarifa: " + TARIFA_CAM);
                System.out.println("Subtotal: " + costo);
                System.out.println("Descuento: 20%");
                System.out.println("Total a pagar: $" + desc);
            } else {
                costo = TARIFA_CAM * horas;
                System.out.println("Tipo de vehiculo: CAMIONETA");
                System.out.println("Horas: " + horas);
                System.out.println("Tarifa: " + TARIFA_CAM);
                System.out.println("Subtotal: " + costo);
                System.out.println("Descuento: 0%");
                System.out.println("Total a pagar: $" + costo);
            }
        } else {
            System.out.println("Opcion no valida");
        }


    }
}
