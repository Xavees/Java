import java.util.Scanner;
public class horasTrabalhadas {
        public static void main (String[] args) {
    Scanner scan = new Scanner(System.in); 

            System.out.println("Digite seu salario por hora");
            double salario = scan.nextDouble();
            System.out.println("Digite  o numero de horas trabalhadas nesse mês");
            double horasMes = scan.nextDouble();

            double salarioBruto = horasMes * salario;

            System.out.println("O valor do seu salário bruto é :" + salarioBruto  );
            scan.close();


}


}
