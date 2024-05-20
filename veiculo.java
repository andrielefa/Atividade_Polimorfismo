package Oficina;

public class Veiculo {
    public double calcularPrecoPiso(double valorPecas, double percentual) {
        return valorPecas * (1 + percentual / 100);
    }
}
