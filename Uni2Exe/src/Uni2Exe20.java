import java.util.Scanner;

public class Uni2Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dobras;
        double quadrados;
        System.out.println("Digite o numero de dobras: ");
        dobras = sc.nextInt();

        quadrados = Math.pow(2, dobras);
        quadrados = quadrados * quadrados;
        System.out.println("A quantidade de quadrados é: " + quadrados);

        sc.close();


    }
}
