import java.util.Scanner;
import java.util.Locale;

public class exercicio_dados_pessoas {

    public static void temporizador(String[] args) {
        try {
            Thread.sleep(3000);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, qte_homens, qte_mulheres;
        double soma_alturas_mulheres, menor_altura, maior_altura, media_alturas_mulheres;

        System.out.print("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            alturas[i] = sc.nextDouble();

            do {
                System.out.print("Genero da " + (i+1) + "a pessoa: ");
                generos[i] = sc.next().charAt(0);
                generos[i] = Character.toUpperCase(generos[i]);
                System.out.println();

                if (generos[i] != 'F' && generos[i] != 'M') {
                    System.out.println("genero invalido, favor tente novamente");
                    temporizador(args);
                }
            } while(generos[i] != 'F' && generos[i] != 'M');
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

        soma_alturas_mulheres = 0;
        qte_mulheres = 0;
        for (int i = 0; i < n; i++) {
            if (generos[i] == 'F') {
                soma_alturas_mulheres += alturas[i];
                qte_mulheres++;
            }
        }

        media_alturas_mulheres = soma_alturas_mulheres / qte_mulheres;
        qte_homens = n - qte_mulheres;

        System.out.println("Menor altura = " + String.format("%.2f", menor_altura));
        System.out.println("Maior altura = " + String.format("%.2f", maior_altura));
        System.out.println("Media das alturas das mulheres = " + String.format("%.2f", media_alturas_mulheres));
        System.out.println("Numero de homens = " + qte_homens);

        sc.close();
    }
}