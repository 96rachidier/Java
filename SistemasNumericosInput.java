import javax.swing.*;
import java.util.Scanner;
public class SistemasNumericosInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar numero entero:");
        String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            System.out.println("Error tenés que ingresar un número enteroooo!!!");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = ("Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        mensaje += "\nNumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal); //concatenación dinámica
        mensaje += "\nNumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensaje);
    }
}