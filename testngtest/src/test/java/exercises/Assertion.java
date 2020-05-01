package exercises;

public class Assertion {

    public static void main(String[] args) {
        Integer age = 27;
        int newNumber = 30;
        int thirdNumber = 28;
        String firstString = "45";
        String secString = "45";
        Integer.getInteger(firstString);

//assertage<=18:"LaEdadnoescorrecta";
        assert firstString.equals(secString) : "Noesiguallosdosstrings";
//assertage.toString().equals(firstString):"Numerosnosoniguales";
        assert between(age, newNumber, thirdNumber) : "Novalido";
    }

    private static boolean between(Integer age, int newNumber, int thirdNumber) {
        if (age >= newNumber && age <= thirdNumber)
            return true;
        else
            return false;
    }
}