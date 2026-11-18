package tema5.tienda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del porducto: ");
        String nombre = sc.nextLine();

        System.out.println("Ingresa el precio por unidad: ");
        double precio = sc.nextDouble();

        System.out.println("Ingresa la cantidad que deseas comprar: ");
        int cantidad = sc.nextInt();

        System.out.println("---DESGLOSE DE LA COMPRA");
        System.out.println("Producto-> "+nombre);
        System.out.println("Precio-> "+precio);
        double subtotal = Operaciones.subtotal(precio,cantidad);
        double descuento = Operaciones.descuento(precio,cantidad);
        double subtotalConDescuento = subtotal - descuento;
        double iva = Operaciones.iva(subtotalConDescuento);
        System.out.println("Subtotal -> "+subtotal);
        System.out.println("Descuento ->"+descuento);
        System.out.println("Subtotal con descuento -> "+subtotalConDescuento);
        System.out.println("IVA ->"+iva);
        System.out.println("Total a pagar -> "+(subtotalConDescuento+iva));

    }
}
