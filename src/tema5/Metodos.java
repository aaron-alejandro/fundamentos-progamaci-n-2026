package tema5;

public class Metodos {
    static int CONSTANTE = 10;
    static int acumulador = 0;
    public static void main(String[] args) {
        System.out.println("HOLA MUNDO");

        float a = 5.0f;
        float b = 10.5f;
        suma();
        float c = a+b+CONSTANTE;
        acumulador+=c;

        System.out.println("c = " + c);
        resta();
        System.out.println(acumulador);
    }
    public static void  suma(){
        float a = 6.0f;
        float b = 15.0f;
        System.out.println("Resultado = "+(a+b+CONSTANTE));
        acumulador+=(a+b+CONSTANTE);
    }
    public static void resta(){
        float a = 6.0f;
        float b = 15.0f;
        System.out.println("Resultado = "+(a-b+CONSTANTE));
        acumulador+=(a-b+CONSTANTE);
    }
}
