package Aula16;
import java.util.Scanner;

public class tentativasWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tentativas = 3;

        while (tentativas > 0) {
            System.out.println("Digite a senha:");
            int senha = scan.nextInt();

            if (senha == 1234) {
                System.out.println("Senha correta!");
                break;
            }

            tentativas--;
            System.out.println("Tentativas restantes: " + tentativas);
        }

        scan.close();
    }
}
