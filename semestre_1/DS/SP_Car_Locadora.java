import java.util.Scanner;

public class SP_Car_Locadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados
        System.out.print("Digite o modelo do carro alugado: ");
        String modeloCarro = scanner.nextLine();

        System.out.print("Digite o valor da diária para locação: ");
        double valorDiaria = scanner.nextDouble();

        System.out.print("Digite a quantidade de dias de locação: ");
        int diasLocacao = scanner.nextInt();

        System.out.print("Digite a quantidade de Km percorridos: ");
        double kmPercorridos = scanner.nextDouble();

        // Cálculo do preço total a pagar
        double precoTotal = (valorDiaria * diasLocacao) + (kmPercorridos * 0.20);

        // Exibição do modelo do carro e valor total a pagar
        System.out.println("Modelo do carro: " + modeloCarro);

        System.out.println("Valor total a pagar: R$" + precoTotal);

        scanner.close();
    }
}
