import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe09 {
    public static void main(String[] args) {
        float dolar, real; 
        float cotacao = 5.27f; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em Dólares");
        dolar = sc.nextFloat();
        real = dolar * cotacao;
        DecimalFormat df = new DecimalFormat("R$0.00");
        System.out.println( "O valor convertido em reais é:" + df.format (real));
        
        sc.close();

        



        
        
    }
} 

