package ejercicios;

public class Assertion {

    public static void main(String[] args){
        Integer uno = 5;
        assert "Cadena".equals("Cadena"):"Cadena ño";
        assert  uno.toString().equals("5"):"Integer ño";

        assert restar(10, 4) == 2: "No hizo la resta";
        assert  between(4,2,6):"En rango ño";

    }

    public static boolean between(int a, int rT, int rB){
        if(a>=rB && a<=rT)
            return true;
        else
            return false;
    }
    public static int restar( int a, int b) {

        return a - b;
    }
}



