package condicionaisExercicios;
import java.util.Scanner;
public class notasParciais {
    public static void main (String[] args) {
                Scanner scan = new Scanner(System.in);


        System.out.println("Digite a primeira nota do aluno");
          double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota  do aluno ");
          double nota2 = scan.nextDouble();

        double mediaAluno = (nota1 + nota2) / 2;


        if (mediaAluno >= 9 && mediaAluno <= 10) {

            System.out.println("A media do aluno foi : " + mediaAluno);
            System.out.println("A nota de conceito do aluno foi : A ");
            System.out.println("E o aluno foi aprovado ");
        } else if (mediaAluno < 9 && mediaAluno >=7.5) {


            
            System.out.println("A media do aluno foi : " + mediaAluno);
            System.out.println("A nota de conceito do aluno foi : B ");
            System.out.println("E o aluno foi aprovado ");


        } else if (mediaAluno < 7.5 && mediaAluno >= 6) {

                
            System.out.println("A media do aluno foi : " + mediaAluno);
            System.out.println("A nota de conceito do aluno foi : C ");
            System.out.println("E o aluno foi aprovado ");

        } else if (mediaAluno < 6 && mediaAluno >= 4) {



            
            System.out.println("A media do aluno foi : " + mediaAluno);
            System.out.println("A nota de conceito do aluno foi : D");
            System.out.println("E o aluno foi reprovado ");
        } else if (mediaAluno < 4) {



            System.out.println("A media do aluno foi : " + mediaAluno);
            System.out.println("A nota de conceito do aluno foi : E ");
            System.out.println("E o aluno foi reprovado ");



        } else {

            System.out.println("Calculo deu errado, tenta novamente");
        }



















                scan.close();





    }
}
