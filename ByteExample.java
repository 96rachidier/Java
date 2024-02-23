public class ByteExample { //ejercicio de operadores lógicos
    public static void main(String[] args) {
        int a = 381;
        int b = 0;
        byte c = (byte)(a - b); //casteo
        System.out.println(c); //0000 0001
    }
}
