package condicionaisExercicios;
import java.util.Scanner;
public class aprovadoNotas {
      public static void main (String[]args ) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota do aluno");
        double nota2 = scan.nextDouble();

        double mediaNotas = (nota1 + nota2 ) / 2;

        if (mediaNotas == 10) {
            System.out.println("Aprovado com distinção  !");
        
        }else if (mediaNotas >= 7) {
            System.out.println("Aprovado  !");
        
        } else {
            System.out.println("Reprovado  ! ");
        }



        scan.close();
      }   
}
