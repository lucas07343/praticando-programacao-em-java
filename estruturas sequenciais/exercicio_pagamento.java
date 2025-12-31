import java.util.Scanner;
import java.util.Locale;

public class exercicio_pagamento {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double valor_hora, pagamento;
        int horas;

        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Valor por hora: ");
        valor_hora = sc.nextDouble();
        System.out.print("Horas trabalhadas: ");
        horas = sc.nextInt();

        pagamento = valor_hora * horas;
        System.out.println();
        System.out.println("O pagamento para " + nome + " deve ser " + String.format("%.2f", pagamento));

        sc.close();
    }
}