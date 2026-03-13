import java.util.Scanner;

public class Uni2Exe13 {
    public static void main(String[] args) {
        int distancia, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a distância em km: ");
        distancia = sc.nextInt();
        resultado = distancia * 2;

        System.out.println("O carro levará " + resultado + " minutos ");

        sc.close();

    }
}
