import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe08 {
    public static void main(String[] args) {
        float codigo1, numerodePeca1, valorUnitariopeca1, codigo2, numeroPeca2, valorUnitariopeca2, valoraSerPago;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código do produto um: ");
        codigo1 = sc.nextFloat();
        System.out.println("Quantidade de peças: ");
        numerodePeca1 = sc.nextFloat();
        System.out.println("Digite o valor unitário da Peça Um: ");
        valorUnitariopeca1 = sc.nextFloat();
        System.out.println("Digite o código do produto dois: ");
        codigo2 = sc.nextFloat();
        System.out.println("Quantidade de peças: ");
        numeroPeca2 = sc.nextFloat();
        System.out.println("Digite o valor unitário da peça dois :");
        valorUnitariopeca2 = sc.nextFloat();
        valoraSerPago = ((numerodePeca1 * valorUnitariopeca1) + (numeroPeca2 * valorUnitariopeca2));
        DecimalFormat df = new DecimalFormat("R$ 0.00");
        System.out.println("O valor total a ser pago dos produtos com código " + codigo1 + " e " + codigo2 + " é " + df.format(valoraSerPago));

        sc.close();

        




    }
    
}
