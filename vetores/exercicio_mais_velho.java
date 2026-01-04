import java.util.Scanner;

public class exercicio_mais_velho {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n, idade_mais_velha;
        String mais_velha;

        System.out.print("Quantas pessoas voce vai digitar? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.println();
        }

        idade_mais_velha = idades[0];
        mais_velha = nomes[0];
        for (int i = 0; i < n; i++) {
            if (idades[i] > idade_mais_velha) {
                idade_mais_velha = idades[i];
                mais_velha = nomes[i];
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + mais_velha);

        sc.close();
    }
}