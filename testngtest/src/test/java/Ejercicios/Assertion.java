package Ejercicios;

public class Assertion {

    public static void main(String[] args) {
        String string1 = "asda";
        String string2 = "asda";
        assert string1.equals(string2): "Las cadenas no son iguales";


        Integer num = 45;
        String strng3 = "67";
        Integer stringtoNum = Integer.parseInt(strng3);
        assert num == stringtoNum: "no son iguales";

        assert numeBetwen (20, 40, 50): "Noo esta igual";
    }
    public static boolean numeBetwen(int limtinf, int numtocheck, int limitsuper){

        if(numtocheck < limitsuper && numtocheck > limtinf) {
            return true;
        }
        else return false;

    }
}
