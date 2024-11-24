package questao5;
public class Main {
    public static void main(String[] args) {
        Telefone telefone1 = new Telefone(83, 9999);
        
        
        telefone1.exibirDetalhes();
        
        Contato contato1 = new Contato("José", new Telefone(83, 9999));
        
        contato1.exibirDetalhes();           
    }
    
}
