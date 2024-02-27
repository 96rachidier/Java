public class Caracteres {
    public static void main(String[] args) {
        char caracter = '$'; //el char se declara con comillas simples y solo puede contener un valor
        char caracter2 = '\u0040'; //en characters maps de wiwndos puedo buscar la representación y debo ponerle un "\" + (representación)
        System.out.println("El caracter 1 es: " + caracter);
        System.out.println("El caracter 2 es: " + caracter2);
    }
}
