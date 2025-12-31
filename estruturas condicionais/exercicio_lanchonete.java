import java.util.Locale;
import java.util.Scanner;

public class exercicio_lanchonete {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double pagamento;

        System.out.print("Codigo do produto comprado: ");
        codigo = sc.nextInt();
        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextInt();

        pagamento = 0;
        switch (codigo) {
            case 1:
                pagamento = quantidade * 5.00;
                break;
        
            case 2:
                pagamento = quantidade * 3.50;
                break;

            case 3:
                pagamento = quantidade * 4.80;
                break;

            case 4:
                pagamento = quantidade * 8.90;
                break;

            case 5:
                pagamento = quantidade * 7.32;
                break;
        }

        System.out.println();
        System.out.println("Valor a pagar: R$ " + String.format("%.2f", pagamento));

        sc.close();
    }
}