import java.util.Scanner;

public class ex13_SalarioBruto {

    // Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
    // Calcule e mostre o total do seu salário no referido mês,
    // sabendo-se que são descontados 11% para o Imposto de Renda,
    // 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
    //
    //- saláriobruto.
    //a.quanto pagou ao INSS.
    //b.quanto pagou ao sindicato.
    //c.o salário líquido.
    //d.calcule  os  descontos  e  o  salário  líquido,  conforme  a  tabela abaixo:
    //+  Salário  Bruto  :  R$ -IR  (11%)  :  R$ -INSS (8%)  :  R$ -Sindicato  (  5%)  :  R$  =  Salário Liquido : R$
    //
    //*Obs.: Salário Bruto - Descontos = Salário Líquido

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto vc ganha por hora? r$ ");
        double valorHora = scanner.nextDouble();

        System.out.print("Quantas hr vc trabalha por mês? ");
        double horasTrabalhadas = scanner.nextDouble();

        // calculando o salario bruto
        double salarioBruto = valorHora * horasTrabalhadas;

        // calculando os descontos
        double irpf = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;

        // calculando o salario liquido (salario bruto - descontos)
        double salarioLiquido = salarioBruto - irpf - inss - sindicato;

        // juntando as respostas
        System.out.println("O valor do salario bruto é de r$" + salarioBruto);
        System.out.println("O valor do inss é de r$" + inss);
        System.out.println("O valor do sindicato é de r$" + sindicato);
        System.out.println("O valor do salario liquido é de r$" + salarioLiquido);
        System.out.println("r$ " + salarioBruto + " - r$ " + irpf + " - r$ " + inss + " - r$ " + sindicato + " = " + salarioLiquido);


    }
}
