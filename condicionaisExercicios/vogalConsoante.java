package condicionaisExercicios;
import java.util.Scanner;
public class vogalConsoante {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra para saber se ela é consoante ou vogal");
        String letra  = scan.next();


        if (
    letra.equalsIgnoreCase("A") ||
    letra.equalsIgnoreCase("E") ||
    letra.equalsIgnoreCase("I") ||
    letra.equalsIgnoreCase("O") ||
    letra.equalsIgnoreCase("U")
) {

            System.out.println("Sua letra é vogal");

        } else {
            System.out.println("Sua letra é consoante");
        }
            
scan.close();

    }
}
