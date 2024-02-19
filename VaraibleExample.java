public class VaraibleExample {
    public static void main(String[] args) {
        int number = 9; //Si pongo el número entre comillas lo detecta como un string y falla
        int number2 = 5;
        boolean value = true;
        if (value) {
            System.out.println("Number = " + number);
            number2 = 7; //va a retornar 5 si cambio el booleano a false
        }
        System.out.println("Number = " + number2);
        var number3 = "15"; // Cuando la variable se decalara como VAR no es necesario aclarar el tipo de dato
        String name;
        name = "Roberto";

        if (number < 10){
            name = "Pepito";
        }
        System.out.println("nombre = " + name);
    }
}
