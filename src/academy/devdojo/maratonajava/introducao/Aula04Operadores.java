package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int number1 = 10;
        int number2 = 20;
        double result = number1 + number2;
        System.out.println(number2 + number1 + " Valor " + number2 + number1);
        System.out.println(result);

        result = number1 / number2;
        System.out.println(result);

        result = number1 / (double) number2;
        System.out.println(result);
    }
}
