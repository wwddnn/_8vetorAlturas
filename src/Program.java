import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas ");
        int n = sc.nextInt();

        String[ ] nomes = new String[n];
        int[ ] idades = new int[n];
        double[ ] alturas = new double[n];

        for (int i = 0; i <n;  i++) {
            System.out.println("Dados da " + (i +1) + "°" + " pessoa ");
            System.out.print("Nome ");
            nomes[i] = sc.next();
            System.out.print("Idade ");
            idades[i]= sc.nextInt();
            System.out.print("Altura ");
            alturas[i] = sc.nextDouble();
        }
        //media das alturas das pessoas
        double soma = 0;
        double media = 0;
        for (int i = 0; i < alturas.length; i++) {
            soma += alturas[i];
            media = soma / alturas.length;
        }
        System.out.printf("Altura media %.2f%n", media);
        //pessoas menores de 16 anos
        double menores16 = 0;
        for (int i = 0; i < n ; i++) {
            if (idades[i] < 16) {
                menores16++;
            }
        }

        //percentual de menores em relacao ao total de pessoas
        double percentual =( menores16 / n) * 100.0;
        System.out.printf("Percentual de pessoas com menos de 16 anos %.1f%%",  percentual);
        System.out.println();

        //nome das pessoas com menos de 16 anos
        System.out.println("Nome  das pessoas com menos de 16 anos ");
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }
        sc.close();
    }
}
