package tema5.tienda;

public class Operaciones {
    public static double subtotal(double precio,int cantidad){
        return precio*cantidad;
    }
    public static double descuento (double precio,int cantidad){
        return (precio*cantidad)*0.15;
    }
    public static double iva(double subtotal){
        return subtotal*0.16;
    }
}
