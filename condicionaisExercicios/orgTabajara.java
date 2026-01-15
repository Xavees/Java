package condicionaisExercicios;
import java.util.Scanner;
      public class orgTabajara {
            public static void main (String[] args) {
                Scanner scan = new Scanner(System.in);
                     System.out.println("Digite o salario atual do funcionario");
                     double salario = scan.nextFloat();

          if (salario <= 280) {

            double bonus = 0.20;

            double salarioBonus = (salario * bonus) + salario;

            System.out.println("O seu salario sem o bonus é de " + salario);
            System.out.println(" O salario após o bonus ficou de : " + salarioBonus);
            System.out.println("O seu bonus é de " + (salarioBonus - salario));

          } else if (salario > 280 && salario <= 700) {
            double bonus = 0.15;

            double salarioBonus = (salario * bonus) + salario;

            System.out.println("O seu salario sem o bonus é de " + salario);
            System.out.println(" O salario após o bonus ficou de : " + salarioBonus);
            System.out.println("O seu bonus é de " + (salarioBonus - salario));


          } else if (salario > 700 && salario <= 1500) {

            double bonus = 0.10;

            double salarioBonus = (salario * bonus) + salario;
            System.out.println("O seu salario sem o bonus é de " + salario);
            System.out.println(" O salario após o bonus ficou de : " + salarioBonus);
            System.out.println("O seu bonus é de " + (salarioBonus - salario));
          
          } else { 
            System.out.println("Invalido, tente novamente ! ");
          }
           




scan.close();
            }    
}
