package condicionaisExercicios;
import java.util.Scanner;
public class positivoNegativo {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor que deseja saber se é positivo ou negativo");
        double valor1 = scan.nextDouble();

        if (valor1 < 0) {
            System.out.println("O Valor é negativo");

        }else {
            System.out.println("O Valor é positivo");
        }

        scan.close();
    }
}
