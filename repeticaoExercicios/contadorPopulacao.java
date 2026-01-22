package repeticaoExercicios;
import java.util.Scanner;

import condicionaisExercicios.diaSemana;
public class contadorPopulacao {
      public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
       
        double pop1 = 80000;
        double pop2 = 200000;
        int cont = 0;
        while(pop1 < pop2) {

         pop1 += (pop1/100) * 3;
         pop2 += (pop2/100) * 1.5;
         cont++;

         System.out.println("A população 1 representa o total de " +pop1);
         System.out.println("A população dois representa o total de " + pop2);
         System.out.println("A contagem de anos pra ser ultrapassada foi de : " + cont);
         






        }







        scan.close();
      }
}
