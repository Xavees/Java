import java.util.Scanner;



public class manipulacaoValores {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite um valor real"); 
        double valorReal = scan.nextDouble();
        System.out.println("Digite o primeiro valor inteiro");
        int valor1 = scan.nextInt();
        System.out.println("Digite o segundo valor inteiro");
        int valor2 = scan.nextInt();

   int atividade1 = (valor1 * 2) / (valor2 / 2);
   double atividade2 = (valorReal * 3) + valor1;
   double atividade3 = (valorReal * valorReal * valorReal);


        System.out.println("O valor do dobro do primeiro divido pela metade do segundo é : " + atividade1);
        System.out.println("O valor do triplo do terceiro mais o valor do primeiro é igual a : " + atividade2);
        System.out.println("O valor do terceiro elevado ao cubo é igual a " + atividade3);
        scan.close();



    }
    
}
