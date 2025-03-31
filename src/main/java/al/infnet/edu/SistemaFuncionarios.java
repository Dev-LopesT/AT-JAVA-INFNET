package al.infnet.edu;

public class SistemaFuncionarios {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Carlos Silva", 5000.00);
        Funcionario estagiario = new Estagiario("Maria Oliveira", 1500.00);

        System.out.println("=== Gerente ===");
        gerente.exibirDetalhes();
        System.out.println("Salário final: R$ " + gerente.calcularSalario());

        System.out.println("\n=== Estagiário ===");
        estagiario.exibirDetalhes();
        System.out.println("Salário final: R$ " + estagiario.calcularSalario());
    }
}

