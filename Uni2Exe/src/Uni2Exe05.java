import java.util.Scanner;

public class Uni2Exe05 {
    public static void main(String[] args) {
        int A, B, C, D;
        int DiferencaDoProduto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        A = sc.nextInt();
        System.out.println("Digite o Valor B");
        B = sc.nextInt();
        System.out.println("Digite o valor C");
        C = sc.nextInt();
        System.out.println("Digite o valor D");
        D = sc.nextInt();
        DiferencaDoProduto = ((A * B) - (C * D));
        System.out.println("O resultado é :" + DiferencaDoProduto);

        sc.close();
        
         
        
    }
    
}
