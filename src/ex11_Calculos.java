import java.util.Scanner;

public class ex11_Calculos {

    //Faça  um  Programa  que  peça  2  números  inteiros  e  um  número  real.
    // Calcule e mostre:
    // a. o produto do dobro do primeiro com metade do segundo
    // b. a soma do triplo do primeiro com o terceiro
    // c. o terceiro elevado ao cubo.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite outro numero inteiro: ");
        int num2 = scanner.nextInt();

        System.out.print("Agora digite um numero real: ");
        int num3 = scanner.nextInt();

        int resposta1 = (2 * num1) * (num2 / 2);
        int resposta2 = (3 * num1) + num3;
        double resposta3 = Math.pow (num3, 3);


        System.out.println("os numeros escolhidos foram: " + num1 + ", " + num2 + " e " + num3);
        System.out.println("a) o produto do dobro do primeiro com metade do segundo é " + resposta1);
        System.out.println("b) a soma do triplo do primeiro com o terceiro é " + resposta2);
        System.out.println("c) o terceiro elevado ao cubo é " + resposta3);
    }
}