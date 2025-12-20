import java.util.Scanner;
public class soma {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Digite o primeiro valor  : ");
      int numero1 = scan.nextInt();
       System.out.println("Digite o segundo valor  : ");
      int numero2 = scan.nextInt();
        
      System.out.println("A soma dos dois valores é : " + (numero1 + numero2));

      scan.close();

    }

}
