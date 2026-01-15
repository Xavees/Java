package condicionaisExercicios;
import java.util.Scanner;
public class diaSemana {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite o dia da semana de 1-7");
        int diaSemana = scan.nextInt();


        switch (diaSemana) {

               case 1: System.out.println("Segunda-Feira");
                  break;
               case 2: System.out.println("Terça - Feira");
                  break;
               case 3: System.out.println("Quarta - Feira");
                  break;
               case 4: System.out.println("Quinta Feira");
                  break;
                case 5: System.out.println("Sexta - Feira");
                  break;
                case 6: System.out.println("Sabado");
                  break;
                case 7: System.out.println("Domingo");
                break;
                default: System.out.println("Dia da semana invalido");





        }







        scan.close();


    }
}
