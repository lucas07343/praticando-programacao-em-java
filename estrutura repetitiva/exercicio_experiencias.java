import java.util.Locale;
import java.util.Scanner;

public class exercicio_experiencias {

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

        int n, qte_cobaias, total_coelhos, total_ratos, total_sapos, total_cobaias;
        double percentual_coelhos, percentual_ratos, percentual_sapos;
        char tipo_cobaia;

        System.out.print("Quantos casos de teste serao digitados? ");
        n = sc.nextInt();
        System.out.println();

        total_coelhos = 0;
        total_ratos = 0;
        total_sapos = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Quantidade de cobaias: ");
            qte_cobaias = sc.nextInt();
            System.out.print("Tipo de cobaia: ");
            tipo_cobaia = sc.next().charAt(0);
            tipo_cobaia = Character.toUpperCase(tipo_cobaia);

            switch (tipo_cobaia) {
                case 'C':
                    total_coelhos += qte_cobaias;
                    break;
                
                case 'R':
                    total_ratos += qte_cobaias;
                    break;

                case 'S':
                    total_sapos += qte_cobaias;
                    break;

                default:
                    System.out.println("codigo invalido, favor tente novamente");
                    temporizador(args);

                    i--;
                    break;
            }
        }

        total_cobaias = total_coelhos + total_ratos + total_sapos;

        percentual_coelhos = (double) total_coelhos / total_cobaias * 100;
        percentual_ratos = (double) total_ratos / total_cobaias * 100;
        percentual_sapos = (double) total_sapos / total_cobaias * 100;

        System.out.println();
        System.out.println("RELATORIO FINAL:");
        System.out.println();
        System.out.println("Total: " + total_cobaias + " cobaias");
        System.out.println();
        System.out.println("Total de coelhos: " + total_coelhos);
        System.out.println("Total de ratos: " + total_ratos);
        System.out.println("Total de sapos: " + total_sapos);
        System.out.println();
        System.out.println("Percentual de coelhos: " + String.format("%.2f", percentual_coelhos));
        System.out.println("Percentual de coelhos: " + String.format("%.2f", percentual_ratos));
        System.out.println("Percentual de coelhos: " + String.format("%.2f", percentual_sapos));

        sc.close();
    }
}