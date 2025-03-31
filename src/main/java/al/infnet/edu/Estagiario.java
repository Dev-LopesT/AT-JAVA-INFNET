package al.infnet.edu;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        double salarioComDesconto = getSalarioBase() * 0.90;
        return salarioComDesconto;
    }
}
