package condicionais;
import java.util.Scanner;
public class ifdiaSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o dia da semana em numero");
        int diaSemana = scan.nextInt();


        if (diaSemana == 1) {
            System.out.println(" É segunda feira");

        }
        else if (diaSemana == 2) {
            System.out.println("É Terça feira");

        } else if (diaSemana == 3) {
            System.out.println("É Quarta Feira");
        }
         else if(diaSemana == 4 ) {
            System.out.println("É Quinta Feira");
         }
         else if (diaSemana == 5) {
            System.out.println("É Sexta Feira");
         }
         else if (diaSemana == 6) {
            System.out.println("É Sabado");

         }
         else if (diaSemana == 7) {
            System.out.println("É Domingo");
        
         } else {
            System.out.println("Digite um numero de 1 a 7");
         }

        scan.close();
    }
}
