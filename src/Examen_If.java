import java.util.Scanner;

public class Examen_If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int PESO_MAXIMO = 30;
        final int CARGO_LIGERO = 150;
        final int CARGO_MEDIO = 300;
        final int CARGO_PESADO = 500;
        double maleta;
        String nombre;

        System.out.println("Ingresar tu nombre: ");
        nombre = sc.nextLine();

        System.out.println("Ingresa el peso de la maleta: ");
        maleta = sc.nextDouble();

        if (maleta >=1 && maleta <= 15){
            System.out.println("Nombre: " + nombre);
            System.out.println("Peso: " + maleta);
            System.out.println("Sin cargo adicional");
        } else if (maleta > 15 && maleta <=20) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Peso: " + maleta);
            System.out.println("Cargo de : $" + CARGO_LIGERO);
        } else if (maleta > 20 && maleta <= 30) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Peso: " + maleta);
            System.out.println("Cargo de : $" + CARGO_MEDIO);
        }else if (maleta > 30 ) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Peso: " + maleta);
            System.out.println("Su equipaje exede el peso permitido");
            System.out.println("Cargo de : $" + CARGO_PESADO);
        }else{
            System.out.println("Datos no validos");
        }
    }
}
