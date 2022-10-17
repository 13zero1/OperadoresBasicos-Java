import java.util.Scanner;

public class ex06_areaCirculo {

    //Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        double areaCirculo = Math.PI * Math.pow(raio, 2);

        System.out.println("A area do ciculo de " + raio + "cm é " + areaCirculo + "m²");

    }
}
