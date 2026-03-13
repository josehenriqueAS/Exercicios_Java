import java.util.Scanner;

public class Uni2EXE18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor, comprimento, altura, area;
        int azulejos;

        System.out.println(" Digite a altura da parede em metros: ");
        altura = sc.nextDouble();
        System.out.println(" Digite a comprimento: ");
        comprimento = sc.nextDouble();

        area = comprimento * altura;
        azulejos = (int) (area * 9 );
        valor = azulejos * 12.50;

        System.out.println( " Quantidade azulejos: " + azulejos);
        System.out.println(" Valor total: R$ " + valor);

        sc.close();



    }
}
