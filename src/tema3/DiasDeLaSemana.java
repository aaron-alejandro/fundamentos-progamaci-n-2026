package tema3;

import java.util.Scanner;

public class DiasDeLaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;

        System.out.println("Elijej un numero del 1 al 7");
        opcion = input.nextInt();

        switch (opcion){
            case 1: //inicio de caso 1
                System.out.println("Lunes");
                break;//fin delcasi 1
            case 2://inicio de caso 2
                System.out.println("Martes");
                break;//fin del caso 2
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

            default://inicio del default
                System.out.println("Elegiste una opcion no valida");
                break;//fin del default
        }
    }
}
