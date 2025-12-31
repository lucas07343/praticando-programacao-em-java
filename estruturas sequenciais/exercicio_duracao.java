import java.util.Scanner;

public class exercicio_duracao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int segundos, minutos, horas;

        System.out.print("Digite a duracao em segundos: ");
        segundos = sc.nextInt();

        minutos = segundos / 60;
        segundos = segundos % 60;

        horas = minutos / 60;
        minutos = minutos % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
    }   
}