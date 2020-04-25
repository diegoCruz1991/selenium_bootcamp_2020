package ejercicios;

import static java.time.Period.between;

public class Assertion {

    public static void main (String[] args){

        Integer a=8;
        assert "hola".equals("hola"):"adios";
        assert a.toString().equals("10"):"Integer adios";
        if (!between(1, 4, 9)) throw new AssertionError("En rango adios");

    }

    private static boolean between(int i, int i1, int i2) {
        if (i>=i2 && i>=i1)
            return true;
        else
            return false;

    }

}
