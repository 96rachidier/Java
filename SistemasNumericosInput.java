import javax.swing.*;
public class SistemasNumericosInput {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero"); //JOptionPane me proporciona métodos para mostrar ventanas
        int numeroDecimal = Integer.parseInt(numeroStr); //el método parseInt convierte el input de la variable numeroStr en un Int

        String mensaje = ("Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        mensaje += "\nNumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal); //concatenación dinámica
        mensaje += "\nNumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        JOptionPane.showMessageDialog(null, mensaje);
    }
}