package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000000L;
        long bigNumber = (long) 155.23;
        double salaryD = 2000.0;
        float salaryF = (float) 2500.0D;
        byte ageB = 127;
        short ageS = 10;
        boolean isTrue = true;
        boolean isFalse = false;
        char character = 65;

        System.out.println("A idade é: " + age);
        System.out.println(isTrue);
        System.out.println(character);
        System.out.println(bigNumber);
    }
}
