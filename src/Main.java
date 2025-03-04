public class Main {
    public static void main(String[] args) {
        // Creación de una calculadora básica
        Calculator myCalculator = new Calculator();
        // Prueba de suma
        System.out.println(myCalculator.add(5, 7));

        // Prueba de resta
        System.out.println(myCalculator.subtract(45, 11));

        // Prueba de multiplicación
        System.out.println(myCalculator.multiply(3, 78));

        // Prueba de división
        System.out.println(myCalculator.divide(58, 21));

        // Prueba del módulo
        System.out.println(myCalculator.module(154, 3));
    }
}
