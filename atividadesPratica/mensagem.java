
import java.util.Scanner;
public class mensagem {
     public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite alguma coisa");
    String mensagem = scan.nextLine();

System.out.println("A mensagem digitada foi : " + mensagem);
    scan.close();
    
}
}