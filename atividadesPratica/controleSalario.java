import java.util.Scanner;

public class controleSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu salarío por horas");
        double salarioHoras = scan.nextDouble();
        System.out.println("Digite quantas horas você trabalha mensalmente");
        double horasTrabalhadas = scan.nextDouble();

        double SalarioBruto = horasTrabalhadas * salarioHoras;

        double descontoIR = SalarioBruto * 0.11;
        double descontoSindicato = SalarioBruto * 0.05;
        double descontoINSS = SalarioBruto * 0.08;

        double salarioLiquido = SalarioBruto - descontoINSS - descontoIR - descontoSindicato;

      System.out.println("O seu salarío liquido é de : " + salarioLiquido);
      System.out.println("O seu salario bruto mensalmente é de : " + SalarioBruto);
      System.out.println("O desconto do INSS foi de : " + descontoINSS);
      System.out.println("O desconto do Sindicato foi de  :" + descontoSindicato);
      System.out.println("O desconto do Imposto de renda foi de : " + descontoIR);
      





scan.close();
    }
}
