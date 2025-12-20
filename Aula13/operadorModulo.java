package Aula13;
import java.util.Scanner;
public class operadorModulo {
    public static void main(String [] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite aqui se quiser saber se o numero é par ou impar");
        int numero = scan.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("O seu numero é par");
        
        }else{
            System.out.println("O seu numero é impar");
        }
scan.close();
    }
    
}
