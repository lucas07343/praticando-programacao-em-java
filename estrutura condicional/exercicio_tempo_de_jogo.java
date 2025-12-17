import java.util.Scanner;

public class exercicio_tempo_de_jogo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int hora_inicial, hora_final, duracao;

        System.out.print("Hora inicial: ");
        hora_inicial = sc.nextInt();
        System.out.print("Hora final: ");
        hora_final = sc.nextInt();

        if (hora_final > hora_inicial) {
            duracao = hora_final - hora_inicial;
        }
        else {
            duracao = 24 - hora_inicial + hora_final;
        }

        System.out.println();
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}