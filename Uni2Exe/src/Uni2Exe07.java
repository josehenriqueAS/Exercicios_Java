import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe07 {
    public static void main(String[] args) {
    String nome;
    float salarioFixo, vendas, salarioTotal;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu nome:");
    nome = sc.next();
    System.out.println("Digite seu salário fixo");
    salarioFixo = sc.nextFloat();
    System.out.println("Digite o total de vendas");
    vendas = sc.nextFloat();
    salarioTotal = (salarioFixo + (vendas * 0.15f));
    DecimalFormat df = new DecimalFormat("R$ 0.00");
    System.out.println("O Salário do funcionáro(a) " + nome + " é: " + df.format(salarioTotal));

    sc.close();

    

    }
}
