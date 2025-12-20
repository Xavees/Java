import java.util.Scanner;

public class calculoBimestral{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
     System.out.println("Digite a primeira nota do aluno");
     double nota1 = scan.nextDouble();
     System.out.println("Digite a segunda nota do aluno");
     double nota2 = scan.nextDouble();
     System.out.println("Digite a terceira nota do aluno");
     double nota3 = scan.nextDouble();
     System.out.println("Digite a quarta nota do aluno");
     double nota4 = scan.nextDouble();

    double media = (nota1 + nota2 + nota3 + nota4) / 4; 

        if(media >=5 ) {
            System.out.println(" A media do aluno é  " + media + " e você passou de ano");
        }else {
            System.out.println("A nota do aluno é :  " + media + " e você reprovou de ano !"); 
        }

      scan.close();


    }
}