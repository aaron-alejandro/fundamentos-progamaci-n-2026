package tema4;

public class TablasDeMultiplicar {
    public static void main(String[] args) {

        for (int i = 1; i <=10; i++) {
            System.out.println("Tabla de multiplicar del "+i);
            for (int j=1; j<=10; j++) {
                for (int k = 1; k <=10 ; k++) {
                    System.out.println(i+"*"+j+"*"+k+"="+(i*j*k));

                }
            }//fin for j

        }//fin for i
    }
}
