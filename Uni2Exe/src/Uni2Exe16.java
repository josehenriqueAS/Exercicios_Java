import java.util.Scanner;

public class Uni2Exe16 {
    public static void main(String[] args) {
        int lata , garrafaPequena , garrafaGrande;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Quantidade de latas de 350 ml: "); 
        lata = sc.nextInt();
        System.out.println(" Quantidade de garrafas de 600 ml: "); 
        garrafaPequena = sc.nextInt();
        System.out.println(" Quantidade de garrfas de 2L: "); 
        garrafaGrande = sc.nextInt();
        double totaldeLitros = (lata * 350 + garrafaPequena * 600 + garrafaGrande * 2000) / 1000.0;
        System.out.println(" O total de litros de refrigerante comprado é: " + totaldeLitros);

        sc.close();
    }
}
