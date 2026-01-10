package condicionaisExercicios;
import java.util.Scanner;
//exercicio 1
public class maiorValor {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
   System.out.println("Digite o primeiro valor");
   int valor1 = scan.nextInt();
   
   System.out.println("Digite o segundo valor ");
   int valor2 = scan.nextInt();

   if (valor1>valor2) {

    System.out.println("O maior valor é o : " + valor1);

   }
   else {
    System.out.println("O maior valor é o : " + valor2);
   }



    scan.close();
    }
    
}
