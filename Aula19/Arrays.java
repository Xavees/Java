package Aula19;
import java.util.Scanner;
public class Arrays {
     public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

        double[] temperaturas = new double[365];

            temperaturas[0] = 31.3;
            temperaturas[1] = 32;
            temperaturas[2] = 33;
            temperaturas[3] = 35;
            temperaturas[4] = 37;

            System.out.println("O valor da temperatura do dia 1 é " + temperaturas[0]);
            System.out.println("O valor da temperatura do dia 2 é " + temperaturas[1]);
            System.out.println("O valor da temperatura do dia 3 é " + temperaturas[2]);
            System.out.println("O valor da temperatura do dia 4 é " + temperaturas[3]);
            System.out.println("O valor da temperatura do dia 5 é " + temperaturas[4]);

            System.out.println("A quantidade de dias registrados foi : " + temperaturas.length);

            for(int i = 0 ; i < temperaturas.length ; i++) {

                System.out.println("O valor da temperatura no dia" + (i + 1) + " é " + temperaturas[i]);


            }
            for (double temp : temperaturas) {
                
                System.out.println(temp);
            }








        scan.close();
     }
}
