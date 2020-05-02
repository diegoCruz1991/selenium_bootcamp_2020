package ejercicios;

public class Assertion {
    public static void main(String[] args){
        int age=15;
        assert age<=18: "La edad no es correcta";
    // Compara el contenido de dos cadenas
        String cadena1="Hola";
        String cadena2="Hola";
        assert cadena1.equals(cadena2): "Las cadenas no son iguales";
        // Compara el valor de un entero y un string
        Integer entero=5;
        String comEntero="5";
        assert  entero.toString().equals(comEntero):"No son iguales";
        //Revisa que el valor esté dentro de un rango
        int a=2, inicio=2, fin=6;
        assert  rango(a,inicio, fin):"Fuera de rango";
        // Revisa que la resta sea correcta
        int x=10, y=5;
        assert 5==subtract(10,5): "No está bien la resta";
      

    }

    public static boolean rango(int a, int inicio, int fin){
       return (a>=inicio && a<=fin);
    }

    public static int  subtract (int a,int b){
        return a-b;
    }
        
}
