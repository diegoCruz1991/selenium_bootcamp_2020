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

        assert "Hola".contains("d"): "Hola no contiene la letra d";

        assert sumar( 15, 10) == 25: "15 + 10 no es igual a 8"; //verificar que el metodo sumar(15,10) es igual a 8
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void reference(Assertion a) {
        a.x = 15;
    }
}
