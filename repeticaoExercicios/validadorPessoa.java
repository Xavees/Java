package repeticaoExercicios;
import java.util.Scanner;
public class validadorPessoa {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Validador de cadastro");

        boolean cont = true;


        while(cont == true ) {

            System.out.println("Cadastre a proxima pessoa, comece digitando o nome dela");
            String nome = scan.next();
            System.out.println("Digite a idade da pessoa ");
            int idade = scan.nextInt();
            System.out.println("Digite o salario da pessoa");
            double salario = scan.nextDouble();
            System.out.println("Digite sua sexualidade");
            String sex = scan.next();
            System.out.println("Digite seu estado civil : C D S V ");
            String estadoCivil = scan.next();




if (
    nome.length() > 3 &&
    idade <= 150 &&
    salario > 0 &&
    (
        sex.equalsIgnoreCase("F") ||
        sex.equalsIgnoreCase("M")
    ) &&
    (
        estadoCivil.equalsIgnoreCase("C") ||
        estadoCivil.equalsIgnoreCase("D") ||
        estadoCivil.equalsIgnoreCase("V") ||
        estadoCivil.equalsIgnoreCase("S")
    )
) {
    System.out.println("Usuario cadastrado com sucesso, fim do programa !");
    cont = false;
}else {

    System.out.println("Erro ao cadastrar usuario, tente novamente ! ");

}



            





            }






scan.close();
        }




}

