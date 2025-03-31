package al.infnet.edu;
import java.util.Scanner;

public class GerenciadorAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        while (true) {
            System.out.print("Nome do aluno: ");
            nome = scanner.nextLine().trim();
            if (!nome.isEmpty()) {
                break;
            } else {
                System.out.println("Nome inválido. Por favor, insira um nome válido.");
            }
        }

        String matricula;
        while (true) {
            System.out.print("Matrícula: ");
            matricula = scanner.nextLine().trim();
            if (!matricula.isEmpty()) {
                break;
            } else {
                System.out.println("Matrícula inválida. Por favor, insira uma matrícula válida.");
            }
        }

        double nota1 = obterNota(scanner, "Nota 1");
        double nota2 = obterNota(scanner, "Nota 2");
        double nota3 = obterNota(scanner, "Nota 3");

        Aluno aluno = new Aluno(nome, matricula, nota1, nota2, nota3);

        System.out.println("\n=== Resultado Final ===");
        aluno.verificarAprovacao();

        scanner.close();
    }

    private static double obterNota(Scanner scanner, String nomeNota) {
        double nota;
        while (true) {
            System.out.print(nomeNota + ": ");
            if (scanner.hasNextDouble()) {
                nota = scanner.nextDouble();
                if (nota >= 0.0 && nota <= 10.0) {
                    break;
                } else {
                    System.out.println("Nota inválida. Por favor, insira um valor entre 0.0 e 10.0.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número válido para a " + nomeNota + ".");
                scanner.next();
            }
        }
        return nota;
    }
}

