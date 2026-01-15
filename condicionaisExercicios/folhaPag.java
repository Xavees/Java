package condicionaisExercicios;
import java.util.Scanner;
public class folhaPag {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Digite o valor do salario por hora ");
        double salarioHora = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês ");
        int qtdHoras = scan.nextInt();

        double salarioBruto = salarioHora * qtdHoras;


        if (salarioBruto <= 900) {
           
           double descontoINSS = (salarioBruto * 0.10);
           double descontoSindicato = (salarioBruto * 0.03);
           double fgts = (salarioBruto * 0.11);
           double totDesconto = descontoINSS + descontoSindicato;

           double salarioLiquido = salarioBruto - totDesconto;
           
           
           
           
           
            System.out.println("O seu salario bruto é de " + salarioBruto);
            System.out.println("Você é isento do imposto de Renda");
            System.out.println("O desconto do sindicato é de " + descontoSindicato);
            System.out.println("Você recebe " + fgts + " do FGTS (não é descontado)");
            System.out.println("Será descontado " + descontoINSS + " para o INSS");
            System.out.println("Será descontado " + totDesconto + " do seu salario :");
            System.out.println(" O seu salário liquído será de " + salarioLiquido);
        

        }else if (salarioBruto <= 1500) {

            double descontoIR = (salarioBruto * 0.05);
            double descontoSindicato = (salarioBruto * 0.03);
            double fgts = (salarioBruto * 0.11);
            double descontoINSS = (salarioBruto * 0.10);

            double totDesconto = (descontoINSS + descontoSindicato + descontoIR);
            
            double salarioLiquido = salarioBruto - totDesconto;





          
          
          
            System.out.println("O seu salario bruto é de " + salarioBruto);
            System.out.println("O desconto do imposto de renda é de " + descontoIR);
            System.out.println("O desconto do sindicato é de " + descontoSindicato);
            System.out.println("Você recebe " + fgts + " do FGTS (não é descontado)");
            System.out.println("Será descontado " + descontoINSS + " para o INSS");
            System.out.println("Será descontado " + totDesconto + " do seu salario :");
            System.out.println(" O seu salário liquído será de " + salarioLiquido);




        } else if (salarioBruto <= 2500) {


               double descontoIR = (salarioBruto * 0.10);
            double descontoSindicato = (salarioBruto * 0.03);
            double fgts = (salarioBruto * 0.11);
            double descontoINSS = (salarioBruto * 0.10);

            double totDesconto = (descontoINSS + descontoSindicato + descontoIR);
            
            double salarioLiquido = salarioBruto - totDesconto;





          
          
          
            System.out.println("O seu salario bruto é de " + salarioBruto);
            System.out.println("O desconto do imposto de renda é de " + descontoIR);
            System.out.println("O desconto do sindicato é de " + descontoSindicato);
            System.out.println("Você recebe " + fgts + " do FGTS (não é descontado)");
            System.out.println("Será descontado " + descontoINSS + " para o INSS");
            System.out.println("Será descontado " + totDesconto + " do seu salario :");
            System.out.println(" O seu salário liquído será de " + salarioLiquido);










        } else {

            double descontoIR = (salarioBruto * 0.20);
            double descontoSindicato = (salarioBruto * 0.03);
            double fgts = (salarioBruto * 0.11);
            double descontoINSS = (salarioBruto * 0.10);

            double totDesconto = (descontoINSS + descontoSindicato + descontoIR);
            
            double salarioLiquido = salarioBruto - totDesconto;





          
          
          
            System.out.println("O seu salario bruto é de " + salarioBruto);
            System.out.println("O desconto do imposto de renda é de " + descontoIR);
            System.out.println("O desconto do sindicato é de " + descontoSindicato);
            System.out.println("Você recebe " + fgts + " do FGTS (não é descontado)");
            System.out.println("Será descontado " + descontoINSS + " para o INSS");
            System.out.println("Será descontado " + totDesconto + " do seu salario :");
            System.out.println(" O seu salário liquído será de " + salarioLiquido);





        }




    
    
    
    
        scan.close();
    }
}   
