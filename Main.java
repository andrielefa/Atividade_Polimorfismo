package Oficina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor das peças:");
        double valorPecas = scanner.nextDouble();

        Veiculo carro = new Carro();
        Veiculo onibus = new Onibus();
        Veiculo moto = new Moto();

        double precoCarro = carro.calcularPrecoPiso(valorPecas, 25);
        double precoOnibus = onibus.calcularPrecoPiso(valorPecas, 40);
        double precoMoto = moto.calcularPrecoPiso(valorPecas, 15);

        System.out.println("Preço das peças para o Carro: " + precoCarro);
        System.out.println("Preço das peças para o Ônibus: " + precoOnibus);
        System.out.println("Preço das peças para a Moto: " + precoMoto);

        scanner.close();
    }
}
