package condicionaisExercicios;
import java.util.Scanner;
public class verifHorario {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu horario de aula, representado pelo M ( MATUTINO) V ( VESPERTINO) N (NOTURNO)");
        String horario = scan.next();



        if (horario.equalsIgnoreCase("M")) {

            System.out.println(" Você estuda no periodo da manhã");
        }else if (horario.equalsIgnoreCase("V")){

            System.out.println("Você estuda no periodo da tarde");

        } else if (horario.equalsIgnoreCase("N")) {

            System.out.println("Você estuda no periodo noturno");

        } else {
                System.out.println("horario invalido, digite novamente");

        }





        scan.close();
    }
}
