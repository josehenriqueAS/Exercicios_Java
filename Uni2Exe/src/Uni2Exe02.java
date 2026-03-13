import java.util.Scanner;

public class Uni2Exe02 {
    public static void main(String[] args) {
        int numero1, numero2, multiplicacao;
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o numero 1 :");
        numero1 = sc.nextInt();
        System.out.println("Digite o numero 2: ");
        numero2 = sc.nextInt();
        multiplicacao = numero1 * numero2;
        System.out.println("O resultado da multiplicação é : " + multiplicacao);
        
        sc.close();
    }
}
