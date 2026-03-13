import java.time.Duration;
import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
    int duracao;
    Scanner sc = new Scanner (System.in);
    System.out.println("Digite o tempo de duração do evento");
    duracao = sc.nextInt();
    Duration tempo = Duration.ofSeconds(duracao);
    long horas = tempo.toHours();
    long minutos = tempo.toMinutes() % 60;
    long segundos = tempo.toSeconds() % 60;
    System.out.printf("%02d : %02d : %02d\n" , horas, minutos, segundos);

    sc.close();




    

    

    }
}
