package questao8;
public class Cliente {
    public String nome;
    public String email;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    
    public void exibirNome(){
        System.out.println("Nome: " + this.nome);
    }
    
    public void exibirEmail(){
        System.out.println("E-mail: " + this.email);
    }
    
}
