import java.util.Scanner;

public class conversorMedida {
    public static void main (String[] args) {
    Scanner scan = new Scanner (System.in);

        System.out.println("Digite os metros que deseja converter em centimetro");
        double metros = scan.nextDouble();


        double centimetros = metros * 100;

        System.out.println(metros + " Metros,  em centimetros vai dar : "  + centimetros );

        scan.close();
    }
}
