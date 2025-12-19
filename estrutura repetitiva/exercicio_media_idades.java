import java.util.Scanner;
import java.util.Locale;

public class exercicio_media_idades {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade, soma, cont;
        double media;

        System.out.println("Digite as idades:");
        idade = sc.nextInt();

        if (idade <= 0) {
            System.out.println();
            System.out.println("IMPOSSIVEL CALCULAR");
        }
        else {
            soma = 0;
            cont = 0;
            while (idade >= 0) {
                soma += idade;
                cont++;
                idade = sc.nextInt();
            }

            media = (double) soma / cont;
            System.out.println();
            System.out.println("MEDIA = " + String.format("%.2f", media));
        }

        sc.close();
    }
}