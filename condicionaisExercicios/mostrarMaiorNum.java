package condicionaisExercicios;
import java.util.Scanner;
public class mostrarMaiorNum {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int valor1 = scan.nextInt();

        System.out.println("Digite o segundo  valor");
        int valor2 = scan.nextInt();

        System.out.println("Digite o terceiro valor");
        int valor3 = scan.nextInt();

        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println("O maior valor é o  : " + valor1);

        } else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println("O maior valor é o segundo : " + valor2);
            
        }else {
            System.out.println("O maior valor é o terceiro  : " + valor3 );
        }


        scan.close();
    }
    
}
