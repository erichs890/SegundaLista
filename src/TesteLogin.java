import java.util.Scanner;

public class TesteLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Login login = new Login("usuarioTeste", "senhaTeste");

        System.out.println("Digite o nome do usuário:");
        String usuario = scanner.nextLine();

        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();

        boolean success = login.fazerLogin(usuario, senha);
        if (success) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Falha no login.");
        }
    }
}
