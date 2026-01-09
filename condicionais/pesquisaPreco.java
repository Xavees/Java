package condicionais;
import java.util.Scanner;

public class pesquisaPreco {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço do produto");
        double preco = scan.nextDouble();
    
        if(preco<= 10) {
            System.out.println("Está barato");

        } else if (preco < 15) {
            System.out.println("O Valor  está um pouco acima, peça desconto");


        } else {

            System.out.println("O valor é inacessivel, saia já desse mercado");
        }

        

        scan.close();

    }    
}
