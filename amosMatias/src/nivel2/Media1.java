package nivel2;
import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Media1 {
    static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Importando a classe Scanner para ler entradas do usuári
        float A, B;
        double media;
        A = scanner.nextFloat();
        B = scanner.nextFloat();
        media = ((A * 3.5) + (B * 7.5)) / 20.0;
        System.out.printf("Media = %.2f\n", media);

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 
    }
 
}