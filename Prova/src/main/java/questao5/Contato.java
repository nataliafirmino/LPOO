package questao5;
public class Contato {
    public String nome;
    public Telefone telefone;

    public Contato(String nome, Telefone telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    
    public void exibirDetalhes(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Telefone: "+"("+ this.telefone.ddd+")"+" " + this.telefone.telefone);
    }
}
