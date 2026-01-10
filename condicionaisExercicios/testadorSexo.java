package condicionaisExercicios;
import java.util.Scanner;
public class testadorSexo {
    public static void main (String[] args) {
        Scanner Scan = new Scanner (System.in);

        System.out.println("Digite o seu genero");
        String genero = Scan.next();

        if (genero.equalsIgnoreCase("F")) {
            System.out.println("Você é do genero feminino");

        }
        else {
            System.out.println("VocÊ é do genero masculino");
        }


        Scan.close();
    }
}
