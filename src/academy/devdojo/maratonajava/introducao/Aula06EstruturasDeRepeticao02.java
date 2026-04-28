package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 a 1000000
        final int LIMIT = 1000000;
        for (int i = 0; i <= LIMIT; i++) {
            if (i % 2 == 0) {
                System.out.println("Número par: " + i);
            }
        }
    }
}
