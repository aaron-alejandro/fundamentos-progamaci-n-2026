import java.util.Scanner;

public class TiendaDescuento {
    public static void main(String[] args) {
        final double DESC = 0.05;
        final double DESC_F = 0.1;
        final double DESC_VIP = 0.2;
        Scanner sc = new Scanner(System.in);
        String nombre;
        int cliente;
        double monto,descuento;
        System.out.println("Ingresa tu nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingresa el monto a pagar");
        monto = sc.nextDouble();
        System.out.println("Elige el tipo de cliente:");
        System.out.println("1. Cliente normal, 2. Cliente frecuente , 3. Cliente VIP");
        cliente = sc.nextInt();
        if (cliente == 1) {
            if (monto > 2000){
                descuento = monto-(monto*DESC);
                System.out.println("Cliente: " + nombre);
                System.out.println("Monto original: " + monto);
                System.out.println("Descuentos aplicados: 5%");
                System.out.println("Monto a pagar: $" + descuento);
        }else {
                System.out.println("Cliente: " + nombre);
                System.out.println("Monto original: " + monto);
                System.out.println("Descuentos aplicados: 0%");
                System.out.println("Monto a pagar: $" + monto);
            }
        } else if (cliente == 2) {
            if (monto > 2000){
                descuento = monto-(monto*0.145);

                System.out.println("Cliente: " + nombre);
                System.out.println("Monto original: " + monto);
                System.out.println("Descuentos aplicados: 5% y 10%");
                System.out.println("Monto a pagar: $" + descuento);
            }else {
                descuento = monto-(monto*DESC_F);
                System.out.println("Cliente: " + nombre);
                System.out.println("Monto original: " + monto);
                System.out.println("Descuentos aplicados: 10%");
                System.out.println("Monto a pagar: $" + descuento);
            }
        } else if (cliente == 3) {
            if (monto > 2000){
                descuento = monto-(monto*0.24);

                System.out.println("Cliente: " + nombre);
                System.out.println("Monto original: " + monto);
                System.out.println("Descuentos aplicados: 5% y 20%");
                System.out.println("Monto a pagar: $" + descuento);
            }else {
                descuento = monto-(monto*DESC_VIP);
                System.out.println("Cliente: " + nombre);
                System.out.println("Monto original: " + monto);
                System.out.println("Descuentos aplicados: 20%");
                System.out.println("Monto a pagar: $" + descuento);
            }
        }else {
            System.out.println("Opcion no valida");
        }
    }
}
