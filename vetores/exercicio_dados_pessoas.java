import java.util.Scanner;
import java.util.Locale;

public class exercicio_dados_pessoas {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qte_homens;
        double soma_alturas, menor_altura, maior_altura, media_alturas_mulheres;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa:");
            alturas[i] = sc.nextDouble();
            System.out.print("Genero da " + (i+1) + "a pessoa:");
            generos[i] = sc.next().charAt(0);
            System.out.println();
        }

        menor_altura = alturas[0];
        maior_altura = alturas[0];
        for (int i = 0; i < n; i++) {
            if (alturas[i] < menor_altura) {
                menor_altura = alturas[i];
            }
            else if (alturas[i] > maior_altura) {
                maior_altura = alturas[i];
            }
        }

        soma_alturas = 0;
        for (int i = 0; i < n; i++) {
            soma_alturas += alturas[i];
            
        }

        System.out.println("Menor altura = " + String.format("%.2f", menor_altura));
        System.out.println("Maior altura = " + String.format("%.2f", maior_altura));

        sc.close();
    }
}