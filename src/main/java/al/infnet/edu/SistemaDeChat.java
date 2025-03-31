package al.infnet.edu;
import java.util.Scanner;

public class SistemaDeChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = scanner.nextLine();
        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = scanner.nextLine();

        String[] mensagens = new String[10];

        int contador = 0;

        System.out.println("\nBem-vindo ao chat!");
        System.out.println("Para sair do chat a qualquer momento, digite 'sair'.");

        while (contador < 10) {
            String mensagem;
            if (contador % 2 == 0) {
                System.out.print(usuario1 + ", digite sua mensagem: ");
                mensagem = scanner.nextLine();
                if (mensagem.equalsIgnoreCase("sair")) {
                    System.out.println(usuario1 + " saiu do chat.");
                    break;
                }
                mensagens[contador] = usuario1 + ": " + mensagem;
            } else {  // usuário 2 envia nas posições ímpares
                System.out.print(usuario2 + ", digite sua mensagem: ");
                mensagem = scanner.nextLine();
                if (mensagem.equalsIgnoreCase("sair")) {
                    System.out.println(usuario2 + " saiu do chat.");
                    break;
                }
                mensagens[contador] = usuario2 + ": " + mensagem;
            }
            contador++;
        }

        System.out.println("\n===== Histórico de Mensagens =====");
        if (contador == 10) {
            for (String mensagen : mensagens) {
                System.out.println(mensagen);
            }
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(mensagens[i]);
            }
        }

        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês!");

        scanner.close();
    }
}
