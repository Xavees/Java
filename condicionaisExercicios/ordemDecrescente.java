package condicionaisExercicios;
import java.util.Scanner;
public class ordemDecrescente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor : " );
          int valor1 = scan.nextInt();

        System.out.println("Digite o segundo valor : ");
        int valor2 = scan.nextInt();

        System.out.println("Digite o terceiro valor");
        int valor3 = scan.nextInt();

        if (valor1 > valor2 && valor1 > valor3) {
            if (valor2 > valor3) {

                System.out.println("A ordem decrescente dos valores é " + valor1 + valor2 + valor3);


            }else {

                System.out.println("A ordem decrescente dos valores é :" + valor1 + valor3 + valor2);

                
            }
            
        }else if (valor2 > valor3 && valor2 > valor1) {

        if (valor3 > valor1) {
            
        }

        }





        scan.close();
    }
}
