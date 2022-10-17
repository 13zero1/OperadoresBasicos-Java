import java.util.Scanner;

public class ex04_notas {

    //Faça um Programa que peça as 4 notas bimestrais e mostre a média.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a 1ª nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a 1ª nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a 1ª nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a 1ª nota: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("\nA media das notas foi de " + media);

    }
}
