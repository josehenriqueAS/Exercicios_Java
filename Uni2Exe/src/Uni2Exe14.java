import java.util.Scanner;

public class Uni2Exe14 {
    public static void main(String[] args) {
        int valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        valor = sc.nextInt();
        System.out.println(valor / 100 + " Quantidade(s) de notas(s) de R$100 reais");
        valor = valor % 100;
        System.out.println(valor / 50 + " Quantidade(s) de nota(s) de R$50 reais");
        valor = valor % 50;
        System.out.println(valor / 20 + " Quantidade(s) de nota(s) de R$20 reais ");
        valor = valor % 20;
        System.out.println(valor / 10 + "Quantidade(s) de nota(s) de R$10 reais");
        valor = valor % 10;
        System.out.println(valor / 5 + "Quantidade(s) de nota(s) de R$5 reais");
        valor = valor % 5;
        System.out.println(valor / 2 + "Quantidade(s) de nota(s) de R$2 reais");
        valor = valor % 2;
        System.out.println(valor / 1 + "Quantidade(s) de nota(s) de R$1 reais");
        sc.close();
    }
}
