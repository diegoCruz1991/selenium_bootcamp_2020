package ejercicios;

public class Assertion {

    public static void main(String[] args) {

        //int age = 27;
        //assert age<= 18: "La edad no es correcta";

        //assert sumar(a,b) == expect: "La función suma no es correcta, esperaba 10";

        //Assert de cadenas
        assert "Luis".equals("Luis");


        //Assert Cadena a Entero
        Integer number = 10;
        assert number.toString().equals("10") : "Integer debe ser 5";

        //Assert de rango
        assert range(12, 10, 20) : "El número no está en el rango correcto";

        //Assert de resta
        int expect = 1;
        int a =5; int b=4;
        assert substract(a,b) == expect: "La resta no es correcta, esperaba un 1";


    }

    /*public static int sumar(int a, int b) {
        return a + b;
    }*/

    public static int substract(int a, int b) {
        return a - b;
    }

    public static boolean range(int a, int rangoA, int rangoB){
        if(a>=rangoA && a<=rangoB)
            return true;
        else
            return false;
    }
}