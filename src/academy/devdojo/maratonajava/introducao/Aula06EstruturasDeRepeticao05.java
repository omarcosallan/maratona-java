
package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        // Dado o valor de um carro, em quantas vezes ele pode ser parcelado
        // Condição: valor da parcela >= 1000
        double totalValue = 30000;
        for (double i = totalValue; i >= 1.0; i--) {
            double amount = totalValue / i;
            if (amount < 1000) {
                continue;
            }
            System.out.println("Parcela " + i + " R$ " + amount);
        }
    }
}
