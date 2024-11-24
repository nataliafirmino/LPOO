
package questao1;

public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    
    public void exibirDetalhes(){
        System.out.println("Titulo do livro: " + this.titulo);
        System.out.println("Autor do livro: " + this.autor);
        System.out.println("Ano de publicação: " + this.anoPublicacao);
    }
    
    
}
