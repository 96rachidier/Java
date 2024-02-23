public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("El tipo byte corresponde en bytes a " + Byte.BYTES);
        System.out.println("El tipo byte corresponde en bits a " + Byte.SIZE);
        System.out.println("El valor máximo de un byte es: " + Byte.MAX_VALUE); // (2^7) - 1
        System.out.println("El valor mínimo de un byte es: " + Byte.MIN_VALUE); // -2^7

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("El tipo short corresponde en bytes a " + Short.BYTES);
        System.out.println("El tipo short corresponde en bits a " + Short.SIZE);
        System.out.println("El valor máximo de un short es: " + Short.MAX_VALUE); // (2^15) - 1
        System.out.println("El valor mínimo de un short es: " + Short.MIN_VALUE); // -2^15

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("El tipo int corresponde en bytes a " + Integer.BYTES);
        System.out.println("El tipo int corresponde en bits a " + Integer.SIZE);
        System.out.println("El valor máximo de un int es: " + Integer.MAX_VALUE); // (2^31) - 1
        System.out.println("El valor mínimo de un int es: " + Integer.MIN_VALUE); // -2^31

        long numeroLong = 21474836488L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("El tipo long corresponde en bytes a " + Long.BYTES);
        System.out.println("El tipo long corresponde en bits a " + Long.SIZE);
        System.out.println("El valor máximo de un long es: " + Long.MAX_VALUE); // (2^63) - 1 L
        System.out.println("El valor mínimo de un long es: " + Long.MIN_VALUE); // -2^63 L
    }
}
