package nivel2.media1;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try (Scanner leitor = new Scanner(System.in)) {
        
            double A = leitor.nextDouble();
            double B = leitor.nextDouble();
            double Ac = A * 3.5;
            double Bc = B * 7.5;
            // Cálculo da média ponderada
            double MEDIA = (Ac + Bc) / 11.0;
            // Exibição do resultado com 5 casas decimais
            // Displaying the result with 5 decimal places
            
            System.out.printf("MEDIA = %.5f\n", MEDIA);
        
        }
    }

}
