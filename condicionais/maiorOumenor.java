package condicionais;
import java.util.Scanner;

public class maiorOumenor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua idade");
         float idade = scan.nextFloat();

        if (idade >= 18) {
        System.out.println("Você é maior de idade ");


        }else{
            System.out.println("Você é menor de idade ");
        }


        scan.close();
        
    }
    
}
