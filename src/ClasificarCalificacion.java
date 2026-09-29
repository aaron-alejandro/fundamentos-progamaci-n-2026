import java.util.Scanner;

public class ClasificarCalificacion {
    public static void main(String[] args) {
        double calificacion = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una calificacion en un rango de 0 a 100");
        calificacion = sc.nextDouble();

        if (calificacion >= 90 && calificacion <= 100) {
            System.out.println("Exelente");
        } else if (calificacion >= 80 && calificacion<= 89) {
            System.out.println("Muy Bien");
        } else if (calificacion >= 70 && calificacion <= 79) {
            System.out.println("Bien");
        }else if (calificacion >= 60 && calificacion <= 69) {
            System.out.println("Suficiente");
        }else {
            System.out.println("Reprobado");
        }
    }
}
