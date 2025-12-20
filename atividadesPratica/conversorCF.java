import java.util.Scanner;
public class conversorCF {
    public static void main (String[] args) {
  Scanner scan = new Scanner (System.in);
  System.out.println("Digite a temperatura em Farenheit, pra transformarmos para celsius");
   double Farenheit = scan.nextDouble();
   
   double celsius = (5 *(Farenheit-32) /9);
   
   System.out.println("O valor de celsius ficou em : " + celsius );





  scan.close();
}
}
