package Ejercicios;

public class Asserts {

    public static void main(String[] args) {
        int age = 27;

        assert age >= 18: "Assert correcto";
        assert 5 > 1: "Assert incorrecto";

        assert suma(5,5) >= 10: "La suma es correcta";

        //Assert CompareStrings
        assert compareStrings("hola","hola");
        //Assert String = Int
        assert compareIntToString(10,"10");
        //Asert Range
        assert compareRange(11,1,10): "Incorrecto no está en el rango";
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static boolean compareStrings(String s1, String s2) {
        boolean response;
        if (s1.equals(s2)) {
            response = true;
        } else {
            response = false;
        }
        return response;
    }

    public static boolean compareIntToString(int a, String s) {
        boolean response;
        if ( a == Integer.parseInt(s) ) {
            response = true;
        } else {
            response = false;
        }
        return response;
    }

    public static boolean compareRange(int a, int range1, int range2) {
        boolean response;
        if (a >= range1 && a <= range2) {
            response = true;
        } else {
            response = false;
        }
        return response;
    }
}
