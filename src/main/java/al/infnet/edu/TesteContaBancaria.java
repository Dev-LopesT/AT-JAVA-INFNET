package al.infnet.edu;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João Silva", 1000.00);

        conta.exibirSaldo();

        conta.depositar(500.00);

        conta.sacar(200.00);

        conta.sacar(2000.00);

        conta.exibirSaldo();
    }
}
