package tema3;

public class StringEjemplo {
    public static void main(String[] args) {
            String texto = "Hola Mundo Java";
            String nombre = "          Juan";

        System.out.println("length() -> "+texto.length());//regresa la longitud de un texto

        System.out.println("toUpperCase() -> "+texto.toUpperCase());

        System.out.println("toLowerCase() -> "+texto.toLowerCase());

        System.out.println("contains() -> "+texto.contains("Mundo"));

        System.out.println("equals() -> "+texto.equals("Hola Mundo Java"));

        System.out.println("equals() -> " + texto.equalsIgnoreCase("HOLA MUNDO JAVA"));

        System.out.println("subString() -> "+texto.substring(0,4));

        System.out.println("charAt() -> "+texto.charAt(0));

        System.out.println("replace() -> "+texto.replace("Java","Python"));

        System.out.println(nombre);
        System.out.println("trim() -> "+nombre.trim());

        String palabra = "";
        System.out.println("isEmpy() -> " + palabra.isEmpty());
    }
}
