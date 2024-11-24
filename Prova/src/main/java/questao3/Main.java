package questao3;
public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.movimentar();
        
        Carro carro = new Carro();
        carro.movimentar();
        
        Veiculo.iniciarMovimento(bicicleta);
        Veiculo.iniciarMovimento(carro);
        
    }
    
}
