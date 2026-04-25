package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorizedToBuyAlcoholicBeverages = age >= 18;
        if (isAuthorizedToBuyAlcoholicBeverages) { // Valor boolean sempre true para ser executado
            System.out.println("Authorized to buy alcoholic beverages");
        } else {
            System.out.println("Not authorized to buy alcoholic beverages");
        }
        // !
        if (!isAuthorizedToBuyAlcoholicBeverages) {
            System.out.println("Not authorized to buy alcoholic beverages");
        }
        System.out.println("Out the if scope");
    }
}
