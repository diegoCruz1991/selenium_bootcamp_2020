package ejercicios;

public class Assertion {

    public static void main(String[] args){
        Integer uno = 4;
        int a = 5;
        int b = 3;
        int expected = 1;

        assert "pruebas".equals("pruebas"): "String pruebas no encontrado";

        assert  uno.toString().equals("4"):"Integer ño";

        assert checkRange(8, 5, 15): "numero fuera de rango";

        assert subtract(a , b) == expected:"Unexpected subtract result ";

    }

    public static boolean checkRange(int numeroAChecar, int limitA, int limitB){
        return numeroAChecar >= limitA && numeroAChecar <= limitB;
    }

    public static int subtract(int a, int b){
        return a-b;
    }
}
