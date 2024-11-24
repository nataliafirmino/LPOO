package questao5;
public class Telefone {
    public int ddd;
    public int telefone;

    public Telefone(int ddd, int telefone) {
        this.ddd = ddd;
        this.telefone = telefone;
    }
    
    
    public void exibirDetalhes(){
        System.out.println("Telefone com ddd: " + this.ddd + this.telefone);
    }
    
}
