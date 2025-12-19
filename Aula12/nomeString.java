package Aula12;
 
import java.util.Scanner;

public class nomeString { 
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o seu primeiro nome : ");
        String primeiroNome = scan.next();
        System.out.println ("Digite o seu Sobrenome : ");
        String segundoNome = scan.next();
              // podemos usar o scan.nextLine ou o scan.next, o scan.nextLine le a linha inteira ou seja mais de uma String, enquanto o  scan.next vai ler somente a proxima String. 
        System.out.println("O seu nome completo é:   " + primeiroNome  + "  "+ segundoNome + " e a sua idade é : ");
       
        
        scan.close();
    }
}