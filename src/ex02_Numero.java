import java.util.Scanner;

public class ex02_Numero {

    // Faça um Programa que peça um número e depois imprima a mensagem: "O número informado foi [número]".

    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("O numero informado foi " + num);

    }
}
