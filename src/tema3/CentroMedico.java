package tema3;

import java.util.Scanner;

public class CentroMedico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double DESC = 0.15;

        String nombre;
        int edad, resp;
        double cost, totalDescuento, totalCobrado = 0, totalDescuentosAplicados = 0;
        int niño = 0, ado = 0, adulto = 0, mayor = 0, totalPacientes = 0;

        do {
            System.out.println("\n====== Menu Principal ======");
            System.out.println("1) Registrar paciente \n2) Resumen del dia \n3) Salir");
            System.out.print("Seleccione una opcion: ");
            resp = input.nextInt();

            switch (resp) {
                case 1:
                    System.out.print("Ingresar nombre del paciente: ");
                    nombre = input.next();
                    System.out.print("Ingresar la edad del paciente: ");
                    edad = input.nextInt();
                    System.out.print("Costo de la consulta: ");
                    cost = input.nextDouble();

                    totalDescuento = 0;

                    if (edad > 0 && edad < 12) {
                        niño++;
                    } else if (edad >= 12 && edad <= 17) {
                        ado++;
                    } else if (edad >= 18 && edad <= 59) {
                        adulto++;
                    } else if (edad >= 60) {
                        mayor++;
                        totalDescuento = cost * DESC;
                    } else {
                        System.out.println("Edad no valida. No se registro el paciente.");
                        break;
                    }

                    double pagoFinal = cost - totalDescuento;
                    totalCobrado += pagoFinal;
                    totalDescuentosAplicados += totalDescuento;
                    totalPacientes++;

                    System.out.println("\n--- Paciente registrado ---");
                    System.out.println("Paciente: " + nombre);
                    System.out.println("Costo base: $" + cost);
                    System.out.println("Descuento aplicado: $" + totalDescuento);
                    System.out.println("Total a pagar: $" + pagoFinal);
                    break;

                case 2:
                    System.out.println("\n====== RESUMEN DEL DIA ======");
                    System.out.println("Pacientes por categoria:");
                    System.out.println(" - Ninos (menores de 12): " + niño);
                    System.out.println(" - Adolescentes (12 a 17): " + ado);
                    System.out.println(" - Adultos (18 a 59): " + adulto);
                    System.out.println(" - Adultos mayores (60+): " + mayor);
                    System.out.println("----------------------------------");
                    System.out.println("Total de pacientes atendidos: " + totalPacientes);
                    System.out.println("Total recaudado: $" + totalCobrado);
                    System.out.println("Total de descuentos aplicados: $" + totalDescuentosAplicados);

                    if (totalPacientes > 0) {
                        double promedio = totalCobrado / totalPacientes;
                        System.out.println("Promedio pagado por paciente: $" + promedio);
                    } else {
                        System.out.println("Promedio pagado por paciente: $0.0");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }

        } while (resp != 3);
    }
}