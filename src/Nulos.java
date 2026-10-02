public class Nulos {
    static void main() {

        String nombre = "Aaron ";
        String vacio = "";
        System.out.println(nombre.length());
        System.out.println(vacio.length());
        try {
            String n=null;
            System.out.println(n.length());
        }catch (NullPointerException np){
            System.out.println("No se puede realizar la operacion");
        }

    }
}
