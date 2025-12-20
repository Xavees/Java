import java.util.Scanner;
public class conversorFC {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.println("Digite o valor de celsius para convertermos em Fareinght");
       double celsius = scan.nextDouble();

       double Fareinght = (celsius * 1.8) + 32;

       System.out.println("O valor de  fareinght ficou : " + Fareinght  );

       scan.close();
    }
    
}
