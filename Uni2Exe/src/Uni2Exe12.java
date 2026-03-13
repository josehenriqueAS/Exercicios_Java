import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe12 {
    public static void main(String[] args) {
        double x1, x2, y1, y2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de x1: ");
        x1 = sc.nextDouble();
        System.out.println("Digite o valor de x2: ");
        x2 = sc.nextDouble();
        System.out.println("Digite o valor de y1: ");
        y1 = sc.nextDouble();
        System.out.println("Digite o valor de y2: ");
        y2 = sc.nextDouble();

       double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
       DecimalFormat df = new DecimalFormat("0.0000");
       System.out.println(" A distância entre os pontos é: " + df.format(distancia));
       
       sc.close();

        

    }
}
