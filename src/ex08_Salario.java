import java.util.Scanner;

public class ex08_Salario {

    // Faça um Programa que pergunte quanto você ganha por hora e o númerode horas trabalhadas no mês.
    // Calcule e mostre o total do seu salário no referido mês.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto vc ganha por hora? r$ ");
        double valorHora = scanner.nextDouble();

        System.out.print("Quantas hr vc trabalha por mês? ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioMensal = valorHora * horasTrabalhadas;

        System.out.println("seu salario é de r$" + salarioMensal );

    }
}
