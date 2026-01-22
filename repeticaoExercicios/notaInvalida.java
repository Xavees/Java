package repeticaoExercicios;
import java.util.Scanner;
public class notaInvalida {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);

        double cont = 4;

        while(cont != 0) {

                System.out.println("Digite a nota do aluno");
                double notaAluno = scan.nextDouble();

                if (notaAluno >= 0 && notaAluno <= 10) {
                    System.out.println("a nota do aluno foi inserida com sucesso");

                    cont = 0;


                }
                else {
                    System.out.println("Nota invalida, digite novamente ! ");


                }

        }






        scan.close();
    }
    }
