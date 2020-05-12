package ejercicios;

public class Assertion {

    int x = 5;

    public static void main(String[] args) {
        int expected = 10;
        String s = "hola";
        Assertion assertion = new Assertion();

        System.out.println(assertion.x);

        reference(assertion);

        System.out.println(assertion.x);

        //assert sumar(a, b) == expected: "La funcion suma no es correcta, esperaba 10";

        assert sumar( 15, 10) == 8: "aseert 2";
    }

    public static int sumar(int a, int b) {
        a = 20;
        return a + b;
    }

    public static void reference(Assertion a) {
        a.x = 15;
    }
}
