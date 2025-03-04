public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        // prueba suma
        System.out.println(myCalculator.add( 5,  7));
        // prueba resta
        System.out.println(myCalculator.subtract(45,11));
        // prueba multiplicacion
        System.out.println(myCalculator.multiply(3,78));
        //prueba division
        System.out.println(myCalculator.divided(58,21));
        //prueba modulo
        System.out.println(myCalculator.module(154,3));
    }
}