package Aula17;
import java.util.Scanner;
public class forEpeticao { 
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor ");
        int valor1 = scan.nextInt();

        for(int valor2 = 5;valor2 >= valor1;valor1++) {

            System.out.println("valor 1 tem o valor de " + valor1);

        }






        scan.close();
    }
    
}
