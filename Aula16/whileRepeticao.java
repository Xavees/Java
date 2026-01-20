package Aula16;
import java.util.Scanner;

public class whileRepeticao {
        public static void main (String[] args) {
                Scanner scan = new Scanner(System.in);
            System.out.println("Digite um numero para contar dele até o 90");
            int number = scan.nextInt();

            if (number < 90) {
            

                while(number < 90) {

                    number++;
                    System.out.println(number);



                }



             }else if (number > 90) {



                while(number > 90) {
                number--;

                System.err.println(number);} 






             }else {
                    System.out.println("O valor digito é igual a 90");



             }










            scan.close();




        }
        




}
