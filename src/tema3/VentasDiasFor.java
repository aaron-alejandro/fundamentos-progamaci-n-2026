package tema3;

import java.util.Scanner;

public class VentasDiasFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDias,ventaDia,acumuladorVentas=0,contadorDiasBuenos=0,respuesta;
        do {
            System.out.println("Ingresa el numero de dias : ");
            numeroDias = sc.nextInt();

            for (int i = 1; i <= numeroDias ; i++) {

                System.out.println("Ingresa la venta del dia : " + i);
                ventaDia = sc.nextInt();
                acumuladorVentas += ventaDia;//acumuladorVnetas + ventaDias

                if(ventaDia>=1000){
                    contadorDiasBuenos++;
                }
                if(ventaDia>=5000){
                    break;
                }

            }
            System.out.println("Dias buenos = " + contadorDiasBuenos);
            System.out.println("Acumulador de ventas = "+ acumuladorVentas);
            System.out.println("¿Desea repetir la operacion? \n1) Si \n2) No");
            respuesta = sc.nextInt();
        }while (respuesta == 1);
    }
}
