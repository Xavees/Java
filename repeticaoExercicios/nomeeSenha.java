package repeticaoExercicios;
import java.util.Scanner;
public class nomeeSenha {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

       int tentativas = 10;


        while (tentativas != 0) {

            System.out.println("Digite o seu nome de usuario");
            String nomeUser = scan.next();
            System.out.println("Digite a sua senha");
            String senhaUser = scan.next();


            if (!nomeUser.equals(senhaUser)) {
                System.out.println("O seu usuario e senha são validos !");
                tentativas = 0;



            } else {

                System.out.println("Seu usuario e senha sao invalido , pois são iguais !");



            }




            
        }






        scan.close();

    }
    
}
