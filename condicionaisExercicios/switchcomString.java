package condicionaisExercicios;
import java.util.Scanner;
public class switchcomString {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma string pra saber se é vogal ou consoante");
        String letra = scan.next();

            


        switch(letra) {
            case "a":System.out.println(" A sua letra é VOGAL");
            break;
            case "e":System.out.println(" A sua letra é VOGAL");
            break;
            case "i":System.out.println(" A sua letra é VOGAL");
            break;
            case "o":System.out.println(" A sua letra é VOGAL");
            break;
            case "u":System.out.println(" A sua letra é VOGAL");
            break;
            default:System.out.println(" A sua letra é Consoante");









        }














        scan.close();





    }
}
