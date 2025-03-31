package al.infnet.edu;
import java.io.*;
import java.util.Scanner;

public class RegistroCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu de opções
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Registrar compras");
            System.out.println("2. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Escolha o formato do arquivo (txt/csv): ");
                String formato = scanner.nextLine().toLowerCase();

                String nomeArquivo = "compras." + formato;

                System.out.print("Quantas compras deseja registrar? ");
                int quantidadeCompras = scanner.nextInt();
                scanner.nextLine();

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
                    for (int i = 1; i <= quantidadeCompras; i++) {
                        System.out.println("\nCadastro da Compra " + i);

                        String produto = obterNomeProduto(scanner);
                        int quantidade = obterQuantidade(scanner);
                        double precoUnitario = obterPrecoUnitario(scanner);

                        if (formato.equals("csv")) {
                            writer.write(produto + "," + quantidade + "," + precoUnitario);
                        } else {
                            writer.write("Produto: " + produto + ", Quantidade: " + quantidade + ", Preço unitário: R$ " + precoUnitario);
                        }
                        writer.newLine();
                    }

                    System.out.println("\nCompras registradas com sucesso no arquivo!");

                } catch (IOException e) {
                    System.out.println("Ocorreu um erro ao tentar salvar o arquivo: " + e.getMessage());
                }

                try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
                    System.out.println("\nCompras registradas:");
                    String linha;
                    while ((linha = reader.readLine()) != null) {
                        System.out.println(linha);
                    }
                } catch (IOException e) {
                    System.out.println("Ocorreu um erro ao tentar ler o arquivo: " + e.getMessage());
                }

            } else if (opcao == 2) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }

    private static String obterNomeProduto(Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        return scanner.nextLine();
    }

    private static int obterQuantidade(Scanner scanner) {
        int quantidade;
        while (true) {
            System.out.print("Digite a quantidade (número positivo): ");
            quantidade = scanner.nextInt();
            if (quantidade > 0) {
                break;
            } else {
                System.out.println("Quantidade inválida! Deve ser um número positivo.");
            }
        }
        scanner.nextLine();
        return quantidade;
    }


    private static double obterPrecoUnitario(Scanner scanner) {
        double precoUnitario;
        while (true) {
            System.out.print("Digite o preço unitário (maior que zero): ");
            precoUnitario = scanner.nextDouble();
            if (precoUnitario > 0) {
                break;
            } else {
                System.out.println("Preço inválido! Deve ser maior que zero.");
            }
        }
        scanner.nextLine();
        return precoUnitario;
    }
}
