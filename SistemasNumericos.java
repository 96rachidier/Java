public class SistemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        /* conversor de números enteros a binarios*/
        System.out.println("El numero binario de " + numeroDecimal + " es " + Integer.toBinaryString(numeroDecimal)); //método para convertir números a binarios

        /* números binarios a enteros*/
        int numeroBinario = 0b111110100; //le agrego '0b' al número para que java lo tome como binario
        System.out.println("numeroBinario = " + numeroBinario);

        /* números enteros a formato octal*/
        System.out.println("numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        /* numeros octales a enteros*/
        int numeroOctal = 0764; //le agrego un 0 para que java lo tome como un octal
        System.out.println("numeroOctal = " + numeroOctal);

        /* numeros decimales a hexadecimal*/
        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        
        /*numero hexadecimal a entero*/
        int numeroHex = 0x1f4; //le agrego 0x para indicarle que es un hexadecimal
        System.out.println("numeroHex = " + numeroHex);
    }
}
