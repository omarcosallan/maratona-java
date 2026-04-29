
package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 a 1000000
        final int LIMIT = 50;
        for (int i = 0; i <= LIMIT; i++) {
            if (i > 25) {
                break;
            }
            System.out.println("i: " + i);
        }
    }
}
