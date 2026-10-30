package tema3;

import java.util.Scanner;

public class AhorroMensual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dinero = 0, ahorro = 0;
        double metaAhorro = 0;
        int respuesta = 0, meses = 0;

        do {
            meses = 0;
            metaAhorro = 0;

            System.out.println("Ingresa una cantidad de dinero");
            dinero = input.nextDouble();
            while (dinero < 0) {
                System.out.println("Ingresa una cantidad mayor que 0");
                dinero = input.nextDouble();
                if (dinero < 0) {
                    System.out.println("Error ingresa un valor positivo o mayor que 0");
                }
            }

            while (metaAhorro <= dinero) {
                System.out.println("Ingresa una meta de ahorro");
                metaAhorro = input.nextDouble();
                if (metaAhorro <= dinero) {
                    System.out.println("La meta de ahorro debe ser mayor al dinero inicial");
                }
            }

            while (ahorro <= 0) {
                System.out.println("Ingresa un ahorro mensual fijo");
                ahorro = input.nextDouble();
                if (ahorro <= 0) {
                    System.out.println("Error ingresa un valor positivo o mayor que 0");
                }
            }

            int plazo = 0;

            while (meses <= 0) {
                System.out.println("Selecciona el plaso \n1) 6 meses \n2) 12 meses  \n3) 24 meses");
                meses = input.nextInt();

                switch (meses) {
                    case 1:
                        plazo = 6;
                        break;
                    case 2:
                        plazo = 12;
                        break;
                    case 3:
                        plazo = 24;
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        meses = 0;
                }
            }

            double dineroActual = dinero;
            double interesTotal = 0;
            boolean metaAlcanzada = false;
            int mesesAlcanzada = -1;

            for (int i = 1; i <= plazo; i++) {
                dineroActual += ahorro;

                double interesMes = dineroActual * 0.01;
                interesTotal += interesMes;
                dineroActual += interesMes;

                if (!metaAlcanzada && dineroActual >= metaAhorro) {
                    metaAlcanzada = true;
                    mesesAlcanzada = i;
                }
            }

            System.out.println("============== RESULTADOS FINALES ============== ");
            System.out.printf("Dinero final acumulado: %.2f%n", dineroActual);
            System.out.printf("Interes total: %.2f%n", interesTotal);

            if (metaAlcanzada) {
                System.out.println("Alcanzaste la meta en el mes " + mesesAlcanzada + " felicidades :)");
            } else {
                System.out.println("No alcanzaste la meta :(");
            }
            System.out.println("================================================ ");

            System.out.println("Cerrar programa \n1)SI  \n2)NO");
            respuesta = input.nextInt();

        } while (respuesta != 1);

        System.out.println("Cerrando el programa");
        input.close();
    }
}