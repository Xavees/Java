package condicionaisExercicios;
import java.util.Scanner;

public class maioreMenor {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int valor1 = scan.nextInt();
        System.out.println("Digite o segundo valor");
        int valor2 = scan.nextInt();

        System.out.println("Digite o terceiro valor");

        int valor3 = scan.nextInt();


        if (valor1 > valor2 && valor1 > valor3) {

            int valorMaior = valor1;

            if (valor2 < valor3) {

                int valorMenor = valor2;
                     System.out.println("O maior valor é o : " + valorMaior + " E o menor valor é o : " + valorMenor);
            }else {
                int valorMenor = valor3;

                System.out.println("O maior valor é o : " + valorMaior + " E o menor valor é o : " + valorMenor);
            }
        }else if (valor2 > valor1 && valor2 > valor3) {

            int valorMaior = valor2;

            if (valor1 < valor3) {
                int valorMenor = valor1;
                System.out.println("O maior valor é o : " + valorMaior + " e o menor valor é o : " + valorMenor );
            } else {
                int valorMenor = valor3;

                System.out.println("O Maior valor é o : " + valorMaior + " e o menor valor é o : " + valorMenor) ;
            }
            
        }else {
            int valorMaior = valor3;

            if (valor1 < valor2) {
                int valorMenor = valor1;

                System.out.println("O maior valor é o :" + valorMaior + " o menor valor é o : " + valorMenor);

            }else {
                int valorMenor = valor2;

                System.out.println("O maior valor é o : " + valorMaior + " E o menor valor é o : " + valorMenor);
                
            }
        }

   
















        scan.close();
    }
}
