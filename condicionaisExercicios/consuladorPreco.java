package condicionaisExercicios;
import java.util.Scanner;
public class consuladorPreco {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço do primeiro produto");
        double preco1 = scan.nextDouble();

        System.out.println("Digite o preço do segundo produto");
        double preco2 = scan.nextDouble();

        System.out.println("Digite o preço do terceiro produto");
        double preco3 = scan.nextDouble();


        if (preco1 < preco2 && preco1 < preco3) {
         System.out.println("O menor preço é o do primeiro produto, o compre " );


        }else if (preco2 < preco3 && preco2 < preco1){
                System.out.println("O menor preço é o do segundo produto, o compre " );




        }else {

         System.out.println("O menor preço é o do terceiro produto, o compre " );


        }





        scan.close();

    }
}
