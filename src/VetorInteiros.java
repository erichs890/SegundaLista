import java.util.InputMismatchException;
import java.util.Scanner;

public class VetorInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int cont = 0;

        while (true) {
            try {
                System.out.println("Digite um número inteiro (ou 0 para parar):");
                int num = scanner.nextInt();

                if (num == 0) {
                    vetor[cont] = num;
                    break;
                }

                vetor[cont] = num;
                cont++;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: Você inseriu mais que 10 valores.");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, insira um valor inteiro válido.");
                scanner.next();  // Limpar a entrada inválida
            }
        }

        // Exibindo os valores inseridos
        System.out.println("Valores inseridos:");
        for (int i = 0; i < cont; i++) {
            System.out.println(vetor[i]);
        }
    }
}
