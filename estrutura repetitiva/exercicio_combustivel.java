import java.util.Scanner;

public class exercicio_combustivel {

    public static void temporizador(String[] args) {
        try {
            Thread.sleep(3000);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int codigo, alcool, gasolina, diesel;

        System.out.print("Informe um codigo (1 = Alcool, 2 = Gasolina, 3 = Diesel) ou 4 para parar: ");
        codigo = sc.nextInt();

        alcool = 0;
        gasolina = 0;
        diesel = 0;
        while (codigo != 4) {
            switch (codigo) {
                case 1:
                    alcool++;
                    break;
            
                case 2:
                    gasolina++;
                    break;
                
                case 3:
                    diesel++;
                    break;

                default:
                    System.out.println("codigo invalido, favor tente novamente!");
                    temporizador(args);
                    break;
            }

            System.out.print("Informe um codigo (1 = Alcool, 2 = Gasolina, 3 = Diesel) ou 4 para parar: ");
            codigo = sc.nextInt();
        }

        System.out.println();
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}