package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Marcos";
        String address = "Venha-Ver";
        double salary = 3500;
        String salaryReceiptDate = "01/04/2026";
        String message = "Eu " + name
                + ", morando no endereço " + address
                + ", confirmo que recebi o salário de " + salary
                + ", na data " + salaryReceiptDate;
        System.out.println(message);
    }
}
