package Aula13;
import java.util.Scanner;

public class operadorDecremento {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite o valor que deseja fazer o decremento");
        int decremento = scan.nextInt();

        decremento--;

        System.out.println("O seu numero com o decremento adicionado é " + decremento);
scan.close();
    }
    
}
