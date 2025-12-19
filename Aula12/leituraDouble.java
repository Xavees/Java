package Aula12;
import java.util.Scanner;
public class leituraDouble {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
         System.out.println("Digite a sua altura");
         double altura = scan.nextDouble();

         System.out.println("A sua altura é " + altura);

         scan.close();
    }
}
