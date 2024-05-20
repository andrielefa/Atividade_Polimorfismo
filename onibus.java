public class Onibus extends veiculo{
    public Onibus ( double precobase) {
        super (precobase);
    }
    
    @Override
    protected double getPorcentagem(){
        return 0.4;
    }
}
