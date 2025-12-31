import java.util.Locale;
import java.util.Scanner;

public class exercicio_troco_verificado {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double preco, valor_recebido, troco;
        int quantidade;

        System.out.print("Preço unitário do produto: ");
        preco = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        valor_recebido = sc.nextDouble();

        if (preco * quantidade < valor_recebido) {
            troco = valor_recebido - preco * quantidade;

            System.out.println();
            System.out.println("TROCO = " + String.format("%.2f", troco));
        }
        else {
            troco = preco * quantidade - valor_recebido;

            System.out.println();
            System.out.println("DINHEIRO INSUFICIENTE. FALTAM " + String.format("%.2f", troco) + " REAIS");
        }

        sc.close();
    }
}