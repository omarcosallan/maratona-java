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

        // %
        int rest = 20 % 2;
        System.out.println(rest);

        // > < >= <= == !=
        boolean isTenIsGreaterThanTwenty = 10 > 20;
        boolean isTenIsLessThanTwenty = 10 < 20;
        boolean isTenIsEqualThanTwenty = 10 == 20;
        boolean isTenIsEqualThanTen = 10 == 10;
        boolean isTenIsDifferentThanTen = 10 != 10;

        System.out.println("isTenIsGreaterThanTwenty " + isTenIsGreaterThanTwenty);
        System.out.println("isTenIsLessThanTwenty " + isTenIsLessThanTwenty);
        System.out.println("isTenIsEqualThanTwenty " + isTenIsEqualThanTwenty);
        System.out.println("isTenIsEqualThanTen " + isTenIsEqualThanTen);
        System.out.println("isTenIsDifferentThanTen " + isTenIsDifferentThanTen);
    }
}
