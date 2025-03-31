package al.infnet.edu;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        double salarioComBonus = getSalarioBase() * 1.20;
        return salarioComBonus;
    }
}
