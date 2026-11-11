package tema3;

import java.util.Scanner;

public class ExamenTema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int AGUA=15; final int JUGO=22;
        final int GALLETAS=18; final int SANDWICH=45;
        int op,resp,cant=-1,producto,pago; int totalPagar=0,productosTotales=0;

        do {
            int importe=0;
            System.out.println("======MAQUINA EXPENDEDORA===== \n1)Comprar un producto \n2)Consultar el total de la compra \n3)Finalizar el programa");
            op=sc.nextInt();
            while (op<1 || op>3){
                System.out.println("Error: opcion no valida");
                System.out.println("======MAQUINA EXPENDEDORA===== \n1)Comprar un producto \n2)Consultar el total de la compra \n3)Finalizar el programa");
                op=sc.nextInt();
            }

            if (op!=3){
                switch(op){
                    case 1:
                        System.out.println("===== Selecciona el producto ===== \n1. Agua \n2. Jugo \n3. Galletas \n4. Sandwich");
                        producto=sc.nextInt();
                        while (producto<1 || producto>4){
                            System.out.println("Error: opcion no valida");
                            System.out.println("===== Selecciona el producto ===== \n1. Agua \n2. Jugo \n3. Galletas \n4. Sandwich");
                            producto=sc.nextInt();
                        }
                        cant=0;
                        while (cant<=0){
                            System.out.println("Selecciona la cantidad");
                            cant=sc.nextInt();
                            if (cant<=0){
                                System.out.println("selecciona una cantidad mayor que 0");
                            }
                        }
                        switch(producto){
                            case 1:
                                productosTotales+=cant;
                                pago=AGUA*cant;
                                importe=pago;
                                totalPagar+=pago;
                                break;
                            case 2:
                                productosTotales+=cant;
                                pago=JUGO*cant;
                                importe=pago;
                                totalPagar+=pago;
                                break;
                            case 3:
                                productosTotales+=cant;
                                pago=GALLETAS*cant;
                                importe=pago;
                                totalPagar+=pago;
                                break;
                            case 4:
                                productosTotales+=cant;
                                pago=SANDWICH*cant;
                                importe=pago;
                                totalPagar+=pago;
                                break;
                            default:
                                System.out.println("Opcion no permitida");
                        }
                        break;
                    case 2:
                        System.out.println("Total de la compra = $" +totalPagar);
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Opcion no permitida");

                }
                if (importe>0){
                    if (importe<50){
                        System.out.println("Compra pequeña ");
                    } else if (importe<=100) {
                        System.out.println("Compra mediana");
                    }else{
                        System.out.println("Compra grande");
                    }
                }
            }else {
                System.out.println("Gracias por su compra");
                break;
            }
            System.out.println("Deseas elejir algo mas \n1)Si \n3)No");
            resp=sc.nextInt();
            while (resp!=1 && resp!=3){
                System.out.println("Error: opcion no valida");
                System.out.println("Deseas elejir algo mas \n1)Si \n3)No");
                resp=sc.nextInt();
            }
        }while (resp!=3);
        System.out.println("Productos totales = "+productosTotales);
        System.out.println("Total de la compra = "+totalPagar);

    }
}
