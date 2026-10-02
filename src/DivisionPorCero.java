import java.util.Scanner;

public class DivisionPorCero {
    static void main() {
        Scanner input = new Scanner(System.in);
        int a, b, c; //c=a/b
        String n = null;

        System.out.println("Introduce el valor de a: ");
        a = input.nextInt();

        System.out.println("Introduce el valor de b: ");
        b = input.nextInt();

        try {
            //dividir
            c = a / b;
            System.out.println("c = " + c);
            System.out.println(n.length());
        }catch (ArithmeticException ae){
            System.out.println("No se puede dividir por cero");
        }catch (NullPointerException np){
            System.out.println("Estes manejando mal un null");
        }finally {
            System.out.println("No ejecutar siempre");
        }
        System.out.println("Hola Mundo");

    }
}
