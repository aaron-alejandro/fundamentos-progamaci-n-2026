import java.util.Scanner;

public class CompraProductos {
    static void main() {
        Scanner sc = new Scanner(System.in);
        final double DESCUENTO = 10.0;
        final double ENVIO = 80.0;

        double precio,pFinal,descuento,pDescuento;
        int cantidad;
        System.out.println("Ingresa el precio del producto: ");
        precio = sc.nextDouble();
        System.out.println("Ingresa la cantidad de unidades: ");
        cantidad = sc.nextInt();
        pFinal = precio*cantidad;
        if (pFinal >= 1000){
            descuento = pFinal * (DESCUENTO/100);
            pDescuento= pFinal-descuento;
            System.out.println("Precio del producto: $" + precio);
            System.out.println("Cantidad de unidades: " + cantidad);
            System.out.println("Subtotal: $" + pFinal);
            if (pDescuento >= 1500){
                System.out.println("Envio: $0");
            }else {
                System.out.println("Envio: $80");
            }
            System.out.println("Descuento: " + descuento);
            System.out.println("Precio final: $" + pDescuento);
        }else {
            System.out.println("Precio del producto: $" + precio);
            System.out.println("Cantidad de unidades: " + cantidad);
            System.out.println("Precio final: $" + (pFinal+ENVIO));
        }
    }
}
