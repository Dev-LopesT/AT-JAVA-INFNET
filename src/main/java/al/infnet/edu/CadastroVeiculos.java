package al.infnet.edu;

public class CadastroVeiculos {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("ABC-1234", "Toyota Corolla", 2020, 35000.5);
        Veiculo carro2 = new Veiculo("XYZ-9876", "Honda Civic", 2018, 58700.0);

        System.out.println("=== Detalhes Iniciais ===");
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();

        System.out.println("=== Registrando Viagens ===");
        carro1.registrarViagem(150.2);
        carro2.registrarViagem(230.0);

        System.out.println("=== Detalhes Atualizados ===");
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }
}
