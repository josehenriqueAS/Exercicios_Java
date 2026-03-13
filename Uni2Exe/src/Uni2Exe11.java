import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe11 {
    public static void main(String[] args) {
        double a, b, c, areaDoTriangulo, areaDoCirculo, areaDoTrapezio, areaDoQuadrado, areaDoRetangulo;
        final double pi = 3.14159f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        a = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        b = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        c = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("0.00");

        //area do triangulo retangulo
        areaDoTriangulo = (a * b) / 2;
        System.out.println("Area do triangulo retangulo é: " + df.format(areaDoTriangulo));
        
        //area do circulo
        areaDoCirculo = Math.pow(c, c) * pi;
        System.out.println("A área do círculo é : " +  df.format(areaDoCirculo));
        //area do trapezio
        areaDoTrapezio = ((a + b) * c) / 2; 
        System.out.println("A área do trapézio é : " +  df.format (areaDoTrapezio));   
        //quadrardo
        areaDoQuadrado = Math.pow(b, b);
        System.out.println("A área do quadrado é : " +  df.format (areaDoQuadrado));
        //retangulo
        areaDoRetangulo = a * b;
        System.out.println("A área do retangulo é : " +  df.format (areaDoRetangulo));

        sc.close();
        
     



        
    }
}
