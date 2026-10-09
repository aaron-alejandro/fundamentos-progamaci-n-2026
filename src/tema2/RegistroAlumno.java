package tema2;

import java.util.Scanner;

public class RegistroAlumno {
    public static void main(String[] args){
        final String ESCUELA="Tecnologiçó Nacional de Mexico";
        String nombre,apellido,carrera;
        int edad,semestre,promedio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingresa tu apellido: ");
        apellido = sc.nextLine();
        System.out.println("Ingresa tu carrera: ");
        carrera = sc.nextLine();
        System.out.println("Ingresa tu edad: ");
        edad = sc.nextInt();
        System.out.println("Ingresa tu semestre: ");
        semestre = sc.nextInt();
        System.out.println("Ingresa tu promedio: ");
        promedio = sc.nextInt();
        System.out.println("===========REGISTRO DE ESTUDIANTE===========");
        System.out.println(ESCUELA);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
        System.out.println("Promedio: " + promedio);

    }
}
