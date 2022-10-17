import java.util.Scanner;

public class ex12_PesoIdeal {

    // Tendo como dados de entrada a altura de uma pessoa,
    // construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
    // (72.7*altura) -58

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é a sua altura (em m): ");
        double alt = scanner.nextDouble();

        double pesoIdeal = (72.7 * alt) - 58;

        System.out.println("o seu peso ideal é de " + pesoIdeal + "kg.");

    }
}
