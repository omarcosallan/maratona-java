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

        // && (AND) || (OR) !
        int age = 29;
        float salary = 3500.0F;
        boolean isWithinTheLawGreaterThanThirty = age >= 30 && salary >= 4612.00;
        boolean isWithinTheLawLessThanThirty = age < 30 && salary >= 3381.00;
        System.out.println("isWithinTheLawGreaterThanThirty " + isWithinTheLawGreaterThanThirty);
        System.out.println("isWithinTheLawLessThanThirty " + isWithinTheLawLessThanThirty);

        double totalCurrentAccountAmount = 200.00;
        double totalValueSavingsAccount = 10000.00;
        double valuePlaystation = 5000.00;
        boolean isCanIBuyPlaystation = totalCurrentAccountAmount > valuePlaystation
                || totalValueSavingsAccount > valuePlaystation;
        System.out.println("isCanIBuyPlaystation " + isCanIBuyPlaystation);
    }
}
