package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salary = 70000;
        double tax = 0.0;
        if (salary <= 34712) {
            tax = salary * (9.70 / 100);
        } else if (salary >= 34713 && salary <= 68507) {
            tax = salary * (37.35 / 100);
        } else {
            tax = salary * (49.50 / 100);
        }

        System.out.println("Tax is: " + tax);
    }
}
