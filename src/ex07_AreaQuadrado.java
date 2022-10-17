import java.util.Scanner;

public class ex07_AreaQuadrado {

    //Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado do quadrado: ");
        double lado = scanner.nextDouble();

        //Area do quadrado é lado²
        double area = Math.pow(lado, 2);
        double resposta = area * 2;

        System.out.println("A area do quadrado de " + area);
        System.out.println("O dobro da area do quadrado é de " + resposta);

    }
}
