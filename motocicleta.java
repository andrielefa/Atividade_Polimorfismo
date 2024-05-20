public class Motocicleta extends veiculo{
    public Motocicleta ( double precobase) {
        super (precobase);
    }
    
    @Override
    protected double getPorcentagem(){
        return 0.15;
    }
}
