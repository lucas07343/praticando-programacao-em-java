import java.util.Scanner;
import java.util.Locale;

public class exercicio_notas {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota_final;

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        nota_final = nota1 + nota2;
        System.out.println();
        System.out.println("NOTA FINAL = " + String.format("%.1f", nota_final));

        if (nota_final < 60) {
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}