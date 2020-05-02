package ejercicios;

public class Assertion {

    public static void main(String[] args) {
       Integer punto = 8;
       String cadena = "8";
       assert "punto2".equals("punto1"): "Las cadenas no son iguales";
       assert punto.toString().equals(cadena):"La cadena 2 no es igual al numero";
       assert between(13,10,20):"Numero está fuera del rango";
    }

    public static boolean between(int a, int lA, int lB){
        if(a>=lA && a<=lB)
            return true;
        else
            return false;    }
}

