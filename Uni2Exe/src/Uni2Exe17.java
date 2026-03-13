import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe17 {
    public static void main(String[] args) {
        String nome;
        int dependentes;
        double salarioHora = 10.0;
        double numeroDeHorasTrabalhadas;
        Scanner sc = new Scanner (System.in);

        System.out.println(" Digite o nome do funcionário: ");
        nome = sc.nextLine();
        System.out.println(" Digite o número de horas trabalhadas no mês: ");
        numeroDeHorasTrabalhadas = sc.nextDouble();
        System.out.println(" Numero de dependentes do funcionário: ");
        dependentes = sc.nextInt();

        double valorTrabalho = numeroDeHorasTrabalhadas * salarioHora;
        int valorDependentes = dependentes * 60;
        double salariobruto = valorTrabalho + valorDependentes; 
        double descontos = valorTrabalho * 0.135; // 0.135=soma de 8.5% e 5%
        double salarioLiquido = salariobruto - descontos;

        DecimalFormat df = new DecimalFormat("R$ 0.00");
        System.out.println(" Salário bruto: " + df.format(salariobruto));
        System.out.println(" O Salário total líquido do(a) funcionário(a)" + nome + " é " + df.format(salarioLiquido));



        sc.close();
         
        
    }
}
