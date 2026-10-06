import java.util.Scanner;

public class Calificacionesv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MINIMO_APROBATORIO = 70;
        final int MINIMO_UNIDAD = 60;
        double c=0,c1,c2,c3,promedio;
        System.out.println("Ingresa el promedio de la primera unidad:");
        c1 = sc.nextDouble();
        if (c1<MINIMO_UNIDAD){
            System.out.println("Unidad reprobada");
        }
        c = c +c1;
        System.out.println("Ingresa el promedio de la segunda unidad:");
        c2 = sc.nextDouble();
        if (c2<MINIMO_UNIDAD){
            System.out.println("Unidad reprobada");
        }
        c = c +c2;
        System.out.println("Ingresa el promedio de la tercera unidad:");
        c3 = sc.nextDouble();
        if (c3<MINIMO_UNIDAD){
            System.out.println("Unidad reprobada");
        }
        c = c +c3;
        promedio= c/3;
        if (promedio>=MINIMO_APROBATORIO){
            System.out.println("Alumno aprobado");
            System.out.println("Promedio final: " +promedio);
            System.out.println("Unidad 1: " + c1 + " , Unidad 2: " + c2 + " , Unidad 3: " + c3);
        }else {
            System.out.println("Alumno reprobado");
            System.out.println("Promedio final: " +promedio);
            System.out.println("Unidad 1: " + c1 + " , Unidad 2: " + c2 + " , Unidad 3: " + c3);
        }
    }
}
