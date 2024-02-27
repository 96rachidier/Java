public class SistemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        /* conversor de números enteros a binarios*/
        System.out.println("El numero binario de " + numeroDecimal + " es " + Integer.toBinaryString(numeroDecimal)); //método para convertir números a binarios

        /* números binarios a enteros*/
        int numeroBinario = 0b111110100; //le agrego '0b' al número para que java lo tome como binario
        System.out.println("numeroBinario = " + numeroBinario);

        
    }
}
