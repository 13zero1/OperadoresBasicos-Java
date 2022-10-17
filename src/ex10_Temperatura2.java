import java.util.Scanner;

public class ex10_Temperatura2 {

    // Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é a temperatura atual (em Celsius)? ");
        double tempC = scanner.nextDouble();

        double tempF = (((tempC * 9)/5) + 32);

        System.out.println("A temperatura de " + tempC + "ºC é de " + tempF + "ºF" );
    }
}