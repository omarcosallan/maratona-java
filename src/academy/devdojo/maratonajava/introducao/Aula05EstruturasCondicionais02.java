package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 e idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int age = 13;
        String category;
        if (age < 15) {
            category = "Children's Category";
        } else if (age >= 15 && age < 18) {
            category = "Youth Category";
        } else {
            category = "Adult Category";
        }

        System.out.println(category);
    }
}
