package tema3;

public class TernarioEjemplo {
    public static void main(String[] args) {
        int edad = 18;

        String resultado1 = edad>=18? "Mayor de edad":"Menor de edad";
        System.out.println(resultado1);

        int resultado=edad>=18? edad+10 : edad-10;
        System.out.println(resultado);

    }
}
