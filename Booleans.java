public class Booleans {
    public static void main(String[] args) {
        boolean datoLogico = true; //true o false
        boolean datoLogico2 = Boolean.TRUE; //declaro una constante
        final boolean datoLogico3 = false; //declaro una constante de otra forma
        System.out.println("datoLogico2 = " + datoLogico2);
        System.out.println("datoLogico3 = " + datoLogico3);
        /* ejemplo con comparador*/
        double d = 2d;
        float f = 10000f;

        datoLogico = (d < f);
        System.out.println("datoLogico = " + datoLogico);
    }
}
