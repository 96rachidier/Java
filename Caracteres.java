public class Caracteres {
    public static void main(String[] args) {
        char caracter = '$'; //el char se declara con comillas simples y solo puede contener un valor
        char caracter2 = '\u0040'; //en characters maps de wiwndos puedo buscar la representación unicode y debo ponerle un "\" + (unicode)
        System.out.println("El caracter 1 es: " + caracter);
        System.out.println("El caracter 2 es: " + caracter2);
        /*también puedo usar los char para editar cadenas*/
        char tabulador = '\t';
        char nuevaLinea = '\n';
        System.out.println("El caracter 1 es: " + tabulador + caracter);
        System.out.println("El caracter 2 es " + nuevaLinea + caracter2);
        System.out.println("El caracter 2 es" + System.lineSeparator()+ caracter2); //ejemplo con un metodo de java para separar lineas

    }
}
