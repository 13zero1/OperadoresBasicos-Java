import java.util.Scanner;

public class ex05_CmParaM {

    // Faça um Programa que converta metros para centímetros.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de metros: ");
        double metros = scanner.nextDouble();

        double cm = metros * 100;

        System.out.println(metros + "m são " + cm + "cm");
    }
}
