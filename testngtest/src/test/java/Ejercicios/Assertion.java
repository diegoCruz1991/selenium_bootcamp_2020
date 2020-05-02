package Ejercicios;

public class Assertion {
    public static void main(String[] args) {
        String str = "Cesar";
        String str2 = "Cesar";
        int num1 = 23;
        String num2 = "23";
        int numBt = 10;

        assert str.equals(str2) : "Los strings no son iguales";
        assert num1 == Integer.parseInt(num2) : "Los numeros no son iguales";
        assert  rangeCheck(14,5,15) == true: "el numero no esta dentro de los limites";
    }

        public static boolean rangeCheck(int numBt, int limitL,int limitU){
        if(numBt >= limitL && numBt <= limitU){
            return true;
        }
        else {
        return false;
        }



}
}
