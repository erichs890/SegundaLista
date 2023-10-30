import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0, num2 = 0;

        try {
            System.out.println("Digite o primeiro número:");
            num1 = scanner.nextDouble();

            System.out.println("Digite o segundo número:");
            num2 = scanner.nextDouble();

            double resultado = num1 / num2;
            System.out.println("Resultado da divisão: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira um número válido.");
        }
    }
}
