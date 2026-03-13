import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe06 {
    public static void main(String[] args) {
        float horasTrabalhadas, valorHora, salario;
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite as horas trabalhadas");
        horasTrabalhadas = sc.nextFloat();
        System.out.println("Digite o valor/hora");
        valorHora = sc.nextFloat();
        salario = horasTrabalhadas * valorHora;
        DecimalFormat df = new DecimalFormat("R$0.00");
        System.out.println("O sálario do funcionário é :" + df.format(salario));

        sc.close();
        
    


    }
    
}
