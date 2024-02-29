import javax.swing.*;

public class SistemasNumericosInput {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero"); //JOptionPane me proporciona métodos para mostrar ventanas
        int numeroDecimal = Integer.parseInt(numeroStr); //el método parseInt convierte el input de la variable numeroStr en un Int
        System.out.println("Numero entero = " + numeroDecimal);
        System.out.println("El numero binario de " + numeroDecimal + " es " + Integer.toBinaryString(numeroDecimal)); //método para convertir números a binarios
        System.out.println("numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
    }
}