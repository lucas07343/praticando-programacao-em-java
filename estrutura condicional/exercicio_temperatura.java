import java.util.Locale;
import java.util.Scanner;

public class exercicio_temperatura {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char escala;
        double fahrenheit, celsius;

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        escala = sc.next().charAt(0);
        escala = Character.toUpperCase(escala);

        switch (escala) {
            case 'F':
                System.out.println();
                System.out.print("Digite a temperatura em Fahrenheit: ");
                fahrenheit = sc.nextDouble();

                celsius = 5.0 / 9.0 * (fahrenheit - 32);
                System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", celsius));
                break;
        
            case 'C':
                System.out.println();
                System.out.print("Digite a temperatura em Celsius: ");
                celsius = sc.nextDouble();

                fahrenheit = 9.0 / 5.0 * celsius + 32;
                System.out.println("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", fahrenheit));
                break;
        }

        sc.close();
    }
}