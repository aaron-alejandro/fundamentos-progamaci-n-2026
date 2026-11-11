package tema4;

import java.util.Scanner;

public class ControlDeVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ventas = new int[3][5];

        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.println("Ingresa las ventas de la sucursal " + (i + 1) + " del dia " + (j + 1));
                ventas[i][j] = sc.nextInt();
            }
        }

        System.out.println("\t " + "Ventas");
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Sucursal :" + (i + 1) + "\t");
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.print("Dia : " + (j + 1) + "\t" + "(" + ventas[i][j] + ")" + "\t");
            }
            System.out.println();
        }

        int[] totalPorSucursal = new int[3];
        for (int i = 0; i < ventas.length; i++) {
            int total = 0;
            for (int j = 0; j < ventas[i].length; j++) {
                total += ventas[i][j];
            }
            totalPorSucursal[i] = total;
        }

        System.out.println("Total vendido por sucursal");
        for (int i = 0; i < totalPorSucursal.length; i++) {
            System.out.print("Sucursal :" + (i + 1) + "\t" + totalPorSucursal[i] + "\t");
            System.out.println();
        }

        int mayor = totalPorSucursal[0];
        int sucursalMayor = 0;
        for (int i = 1; i < totalPorSucursal.length; i++) {
            if (totalPorSucursal[i] > mayor) {
                mayor = totalPorSucursal[i];
                sucursalMayor = i;
            }
        }
        System.out.println("La sucursal con mayores ventas fue la sucursal : " + (sucursalMayor + 1) + " con : " + mayor + " ventas");

        System.out.println("Promedio de ventas por dia");
        for (int j = 0; j < ventas[0].length; j++) {
            int sumaDia = 0;
            for (int i = 0; i < ventas.length; i++) {
                sumaDia += ventas[i][j];
            }
            double promedioDia = (double) sumaDia / ventas.length;
            System.out.println("Dia " + (j + 1) + ": " + String.format("%.2f", promedioDia));
        }

        sc.close();
    }
}