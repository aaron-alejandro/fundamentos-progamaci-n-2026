import java.util.Scanner;

public class Salario {
    static void main() {
        Scanner input = new Scanner(System.in);
        final int HORAS = 40;
        String nombre;
         Double horas,salario,pago;

        System.out.println("Ingresar el nombre del empleado");
        nombre = input.nextLine();

        System.out.println("Ingresar las horas trabajadas");
        horas = input.nextDouble();

        System.out.println("Ingresar el pago por hora");
        salario = input.nextDouble();

        if (horas <= HORAS){
            pago = salario*horas;
            System.out.println("Nombre: " + nombre);
            System.out.println("Horas trabajadas: " + horas);
            System.out.println("Pago por hora: " + salario);
            System.out.println("Salario total: " + pago);
        } else {
            double hExtra,pExtra;
            hExtra = horas-HORAS;
            pExtra = hExtra*(salario*2);
            pago = (salario*HORAS)+pExtra;
            System.out.println("Nombre: " + nombre);
            System.out.println("Horas trabajadas: " + horas);
            System.out.println("Horas normales; " + HORAS);
            System.out.println("Pago por hora: " + salario);
            System.out.println("Horas extra: " + hExtra);
            System.out.println("Salario total: " + pago);
        }
    }
}
