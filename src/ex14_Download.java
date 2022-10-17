import java.util.Scanner;

public class ex14_Download {

    // Faça um programa que peça o tamanho de um arquivo para download (em  MB)
    // e a velocidade de um link de Internet (em Mbps),
    // calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual tamanho do arquivo (em mb) ? ");
        int tamanhoMb = scanner.nextInt();
        System.out.print("Qual a velocidade do arquivo (em mbps) ? ");
        double velocidadeMbps = scanner.nextDouble();

        double download =  (tamanhoMb / (velocidadeMbps/8))/60;

        System.out.println("Um arquivo de " + tamanhoMb + " mb demora, aproximadamente " + download + " minutos para baixar.");

    }

}
