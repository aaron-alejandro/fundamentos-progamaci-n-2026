package tema4;
/*
* Un arreglos es una estructura de datos que permite almacenar varios
* elementos del mismo tipo dentro de una sola variable
* */

public class Arreglos {
    public  static void main(String args[]) {
        int[] calificaciones = new int[5];
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println(numeros[2]);
        System.out.println(numeros[4]);

        numeros[2] = 100;
        numeros[4] = 200;
        System.out.println(numeros[1]);
        System.out.println(numeros[4]);

        System.out.println("Recorrido de arreglo con for");
        for (int i = 1; i < numeros.length; i++) {

            System.out.println(numeros[i]);

        }
        System.out.println("Recorrido de arreglo con foreach");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("Suma en un arregro");
        int suma=0;
        for (int i =0; i<numeros.length;i++) {
            suma+=numeros[i];

        }
        System.out.println(suma);
    }
}
