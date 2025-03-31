package al.infnet.edu;
import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        String senha;
        boolean senhaValida;

        do {
            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();

            senhaValida = validarSenha(senha);

        } while (!senhaValida);

        System.out.println("Senha cadastrada com sucesso!");
        scanner.close();
    }

    public static boolean validarSenha(String senha) {
        if (senha.length() < 8) {
            System.out.println("Erro: A senha deve ter no mínimo 8 caracteres.");
            return false;
        }
        if (!senha.matches(".*[A-Z].*")) {
            System.out.println("Erro: A senha deve conter pelo menos uma letra maiúscula.");
            return false;
        }
        if (!senha.matches(".*\\d.*")) {
            System.out.println("Erro: A senha deve conter pelo menos um número.");
            return false;
        }
        if (!senha.matches(".*[@#$%^&+=!].*")) {
            System.out.println("Erro: A senha deve conter pelo menos um caractere especial (@, #, $, etc.).");
            return false;
        }

        return true;
    }
}