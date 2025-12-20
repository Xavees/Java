package Aula13;
import java.util.Scanner;

public class operadorDivisao {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Digite um valor para dividirmos por 2");
        int valor = scan.nextInt();

        System.out.println(" A metade do valor que você digitou é " + valor/2);

        scan.close();
    }
    
}
