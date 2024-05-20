public class Carro extends veiculo{
    public Carro ( double precobase) {
        super (precobase);
    }
    
    @Override
    protected double getPorcentagem(){
        return 0.25;
    }
}
