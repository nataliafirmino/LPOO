
package questao6;

public class Main {

    public static void main(String[] args) {
        Leao leao = new Leao();
        System.out.println("Leão");
        leao.comer();
        leao.dormir();
        Passaro passaro = new Passaro();
        System.out.println("Pássaro");
        passaro.comer();
        passaro.dormir();
    }
    
}
