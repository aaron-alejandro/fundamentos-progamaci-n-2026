package tema3;

import java.util.Scanner;

public class Gasolineria {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        final double DESC = 0.05;

        double litros, precio, importeBase, descuento, totalCarga;
        double totalLitros = 0, importeSinDescuento = 0, totalCobrado = 0;
        int cargas = 0, cargasConDescuento = 0, opcion;

        do {
            System.out.println("\n====== Menu Gasolinera ======");
            System.out.println("1) Registrar carga \n2) Resumen de ventas \n3) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese los litros cargados: ");
                    litros = input.nextDouble();

                    System.out.print("Ingrese el precio por litro: ");
                    precio = input.nextDouble();

                    if (litros > 0 && precio > 0) {
                        importeBase = litros * precio;
                        descuento = 0;

                        if (litros >= 40) {
                            descuento = importeBase * DESC;
                            cargasConDescuento++;
                        }

                        totalCarga = importeBase - descuento;

                        cargas++;
                        totalLitros += litros;
                        importeSinDescuento += importeBase;
                        totalCobrado += totalCarga;

                        System.out.println("\n--- Carga Registrada ---");
                        System.out.println("Importe antes de descuento: $" + importeBase);
                        System.out.println("Descuento aplicado: $" + descuento);
                        System.out.println("Total a pagar: $" + totalCarga);
                    } else {
                        System.out.println("Error: Los litros y el precio deben ser mayores a cero.");
                    }
                    break;

                case 2:
                    System.out.println("\n====== RESUMEN DE VENTAS ======");
                    System.out.println("Cargas registradas: " + cargas);
                    System.out.println("Cargas con descuento: " + cargasConDescuento);
                    System.out.println("Total de litros vendidos: " + totalLitros);
                    System.out.println("Importe acumulado (sin descuento): $" + importeSinDescuento);
                    System.out.println("Total recaudado (con descuento): $" + totalCobrado);

                    if (cargas > 0) {
                        double promedio = totalCobrado / cargas;
                        System.out.println("Importe promedio por carga: $" + promedio);
                    } else {
                        System.out.println("Importe promedio por carga: $0.0");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 3);
    }
}