package Aula12;
import java.util.Scanner;

public class leituraInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite a sua idade");
        int idade = scan.nextInt();

        System.out.println("A sua idade é : " + idade);
        scan.close();
    }
    
}
