import java.util.Scanner;

public class velocidadeDownload {
     public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.println("Digite a velocidade da sua internet");
        double veloNet = scan.nextDouble();
        System.out.println("Digite o tamanho do arquivo");
        double tamanhoArq = scan.nextDouble();

        double tempoDownload = tamanhoArq / veloNet;
        
        System.out.println("O tempo de espera pro download ser concluido será de : " + tempoDownload );



    scan.close();
}}
