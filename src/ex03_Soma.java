import java.util.Scanner;

public class ex03_Soma {

    //Faça um Programa que peça dois números e imprima a soma.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num1 = sc.nextInt();

        System.out.print("Digite outro numero: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));

    }
}
