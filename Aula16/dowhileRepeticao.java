package Aula16;
import java.util.Scanner;


public class dowhileRepeticao {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor para sair dele até o 90");
        int valor1 =  scan.nextInt();


        if(valor1 < 90) {

            do {
                valor1++;

                System.out.println(valor1);




            } while(valor1 < 90 );


        }else if (valor1 > 90) {
            

            do {
                valor1--;

                System.out.println(valor1);
            } while (valor1 > 90);

            





        }else {

            System.out.println("O valor ja é igual a 90");


        }

















        scan.close();
    }





}