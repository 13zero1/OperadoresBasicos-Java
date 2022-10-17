import java.util.Scanner;

public class ex09_Temperatura {

    //Faça um Programa que peça a temperatura em graus Farenheit,
    // transforme e mostre a temperatura em graus Celsius.
    // C = (5 * (F-32) / 9)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é a temperatura atual? ");
        double tempF = scanner.nextDouble();

        double tempC = (5 * (tempF - 32) / 9);

        System.out.println("A temperatura de " + tempF + "ºF em Celsius é de " + tempC + "ºC" );
    }
}
