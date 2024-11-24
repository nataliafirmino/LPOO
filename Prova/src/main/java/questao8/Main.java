package questao8;
public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Maria");
        cliente1.exibirNome();
        
        Cliente cliente2 = new Cliente("João", "joao@gmail.com");
        cliente2.exibirNome();
        cliente2.exibirEmail();
        
    }
    
}
