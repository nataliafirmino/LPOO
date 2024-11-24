package questao9;


import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        
        for (int i = 0; i<= numero; i++){
            if (i % 2 == 1){
            System.out.printf("Número:"+i+"\n");
        }
        }
    }
    
}
