import java.util.InputMismatchException;
import java.util.Scanner;

public class CalificacionesV2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double c1,c2,c3,p;

        try {
            System.out.println("Ingrese la primer calificacion: ");
            c1 = sc.nextDouble();

            System.out.println("Ingrese la segunda calificacion: ");
            c2 = sc.nextDouble();

            System.out.println("Ingrese la tercera calificacion: ");
            c3 = sc.nextDouble();

            p=(c1+c2+c3)/3;

            System.out.println("Su promedio es igual a: " + p);
        }catch (InputMismatchException im){
            System.out.println("Ingresa una calificacion numerica");
        }
    }


}
