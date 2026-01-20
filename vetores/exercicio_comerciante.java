import java.util.Scanner;
import java.util.Locale;

public class exercicio_comerciante {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, lucro_baixo, lucro_medio, lucro_cima;
        double total_lucro, total_compras, total_vendas;

        System.out.print("Serao digitados dados de quantos produtos? ");
        n = sc.nextInt();
        System.out.println();

        String[] nomes = new String[n];
        double[] preco_compras = new double[n];
        double[] preco_vendas = new double[n];
        double[] lucros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Produto " + (i+1) + ":");
            System.out.println();
            System.out.print("Nome: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            System.out.print("Preco de compra: ");
            preco_compras[i] = sc.nextDouble();
            System.out.print("Preco de venda: ");
            preco_vendas[i] = sc.nextDouble();
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            lucros[i] = (preco_vendas[i] - preco_compras[i]) / preco_compras[i] * 100;
        }

        lucro_baixo = 0;
        lucro_medio = 0;
        lucro_cima = 0;
        for (int i = 0; i < n; i++) {
            if (lucros[i] < 10) {
                lucro_baixo++;
            }
            else if (lucros[i] < 20) {
                lucro_medio++;
            }
            else {
                lucro_cima++;
            }
        }

        total_compras = 0;
        total_vendas = 0;
        for (int i = 0; i < n; i++) {
            total_compras += preco_compras[i];
            total_vendas += preco_vendas[i];
        }

        total_lucro = total_vendas - total_compras;

        System.out.println("RELATORIO:");
        System.out.println();
        System.out.println("Lucro abaixo de 10%: " + lucro_baixo);
        System.out.println("Lucro entre 10% e 20%: " + lucro_medio);
        System.out.println("Lucro acima de 20%: " + lucro_cima);
        System.out.println("Valor total de compra: " + String.format("%.2f", total_compras));
        System.out.println("Valor total de venda: " + String.format("%.2f", total_vendas));
        System.out.println("Lucro total: " + String.format("%.2f", total_lucro));

        sc.close();
    }
}