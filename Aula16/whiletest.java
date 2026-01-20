package Aula16;
import java.util.Scanner;
public class whiletest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 1 se quiser que continue a contagem e digite 0 se quiser que encerre");

         int cont = 4;   


        while (cont != 0) {
            System.out.println("Digite a senha");
             int senha = scan.nextInt();
        

             if (senha == 123) {
                System.out.println("a senha esta correta");
                cont = 0;



             }else {
                System.out.println("A senha está incorreta");
                cont--;
                System.out.println("Você tem " + cont + " tentativas" );

             }
            

        }






        scan.close();
    }
}
