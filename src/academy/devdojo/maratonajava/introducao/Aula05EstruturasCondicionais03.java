package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salary = 6000.0;
        String messageDonate = "And I'm going to donate 500 to DevDojo";
        String messageNotDonate = "I can't afford it yet, but I will";
        String message = salary > 5000.0 ?  messageDonate : messageNotDonate;
        System.out.println(message);
    }
}
