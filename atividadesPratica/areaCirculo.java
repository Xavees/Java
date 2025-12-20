import java.util.Scanner;

public class areaCirculo {
    public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio do circulo");
        double raioCirculo = scan.nextDouble();

        double areaCirculo = (raioCirculo * raioCirculo) * 3.14;

        System.out.println("O valor da aréa do cirulo é " + areaCirculo);

    scan.close();}
}
