import java.util.Locale;
import java.util.Scanner;

public class exercicio_aumento {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, novo_salario, aumento, porcentagem;

        System.out.print("Digite o salario da pessoa: ");
        salario = sc.nextDouble();

        if (salario <= 1000) {
            porcentagem = 20;
            aumento = salario / 100 * porcentagem;
            novo_salario = salario + aumento;
        }
        else if (salario <= 3000) {
            porcentagem = 15;
            aumento = salario / 100 * porcentagem;
            novo_salario = salario + aumento;
        }
        else if (salario <= 8000) {
            porcentagem = 10;
            aumento = salario / 100 * porcentagem;
            novo_salario = salario + aumento;
        }
        else {
            porcentagem = 5;
            aumento = salario / 100 * porcentagem;
            novo_salario = salario + aumento;
        }

        System.out.println();
        System.out.println("Novo salario = R$ " + String.format("%.2f", novo_salario));
        System.out.println("Aumento = R$ " + String.format("%.2f", aumento));
        System.out.println("Porcentagem = " + porcentagem + " %" );

        sc.close();
    }
}