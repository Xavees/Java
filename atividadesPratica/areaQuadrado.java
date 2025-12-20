import java.util.Scanner;

public class areaQuadrado {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado ");
        double lQuadrado = scan.nextDouble();

        double areaQuadrado = lQuadrado * lQuadrado;

        System.out.println("A areá do quadrado é : " + areaQuadrado);


        scan.close();
    }
}
