package ejercicios;

public class assertion {
    public static void main(String[] args){

        //ASSERT ONE
        int age = 27;
        assert age > 18: "La edad no es correcta"; //Esperas que age sea mayor a 18, sino, imprime el mensaje de error

        //ASSERT TWO
        int expected = 10;
        int a = 4, b = 6;
        assert sumar(a, b) == expected: "La suma es incorrecta, esperaba 10";

        String myString = "HOLA", yourString = "HOLA";
        assert myString.equals(yourString) == true: "Las cadenas son diferentes";

        String numString = "25";
        int numDig = 25;
        assert Integer.getInteger(numString) == numDig: "La cadena no coincide con el numero";

        int myNum = 7, rangeA = 5, rangeB = 10;
        assert IsInRange(myNum, rangeA, rangeB): "Numero fuera de rango";

        int expectedSub = 8;
        int sub1 = 10, sub2 = 2;
        assert subtract(sub1, sub2) == expected: "La resta es incorrecta,  esperaba 8";
    }

    public static int sumar(int a, int b){
        return a+b;
    }

    public static boolean IsInRange(int mynum, int rangeA, int rangeB){
        if(rangeA <= mynum && mynum <=rangeB)
            return true;
        else
            return false;
    }

    public static  int subtract(int A, int B){
        return A - B;
    }
}