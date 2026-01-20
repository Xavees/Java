package Aula16;
import java.util.Scanner;
public class dowhiletest {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

        int tent = 4;

        
        do {
        System.out.println("Digite a senha e tente logar corretamente");
        int senha = scan.nextInt();



           
           
            if (senha != 123) {
                System.out.println("SENHA INCORRETA");
                tent--;
                System.out.println("Você tem mais" + tent + " Tentativas");

                
            }else {
                System.out.println("SENHA CORRETA");
            }




        }while(tent != 0);


        scan.close();
    }
    
}
