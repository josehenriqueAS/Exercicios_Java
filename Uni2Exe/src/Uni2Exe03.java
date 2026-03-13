import java.util.Scanner;

public class Uni2Exe03 {
    public static void main(String[] args) {
        double area, raio;
        double pi = 3.14159;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio");
        raio = sc.nextDouble();
        area = (raio * raio) * pi;
        System.out.println("O valor da circuferencia é: " + area);

        sc.close();
        

         

        

    }
}
