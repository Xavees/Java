package Aula13;
import java.util.Scanner;

public class operadorMultiplicacao {
     public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
         System.out.println("Digite um valor para ser multiplicado por 2");
            int numero = scan.nextInt();
        
           int resultado = (numero * 2);
           
        System.out.println("O seu valor multiplicado por dois vai dar o resultado de : " + resultado);
        scan.close();
        
     }
}