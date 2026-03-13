import java.util.Scanner;

public class Uni2Exe04 {
    public static void main(String[] args) {
        float numero1, numero2, nota;
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite a nota 1");
        numero1 = sc.nextFloat();
        System.out.println("Digite a nota 2");
        numero2 = sc.nextFloat();
        nota = (numero1 * 3.5f + numero2 * 7.5f) / 11;
        System.out.println("A nota é : " + nota);

        sc.close();

    }
    
}
