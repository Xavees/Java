import java.util.Scanner;
public class pescadorMulta {
   public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de quilo dos peixes");
        int peixes = scan.nextInt();

        if (peixes <= 50 ) {
            System.out.println("A quantidade de quilo dos peixes, não foi extrapolada, ou seja. Você não será multado");

        }else {
            int peixesExtrapolados = (peixes - 50);
             double multa = (peixesExtrapolados * 4.0);


             System.out.println(" Você extrapolou nos kg dos peixes  a sua multa será de : " + multa );

            

        }

        scan.close();
   }  
}
