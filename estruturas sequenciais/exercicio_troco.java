import java.util.Scanner;
import java.util.Locale;

public class exercicio_troco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double preco, dinheiro, troco;
        int qte;

        System.out.print("Preço unitário do produto: ");
        preco = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        qte = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        dinheiro = sc.nextDouble();

        troco = dinheiro - preco * qte;
        System.out.println("TROCO = " + String.format("%.2f", troco));

        sc.close();
    }
}