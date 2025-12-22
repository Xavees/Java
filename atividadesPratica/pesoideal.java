import java.util.Scanner;
public class pesoideal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu genêro");
        String genero = scan.nextLine();
        System.out.println("Digite a sua altura");
        Double altura = scan.nextDouble();
        System.out.println("Digite o seu peso atual");
        Double pesoAtual = scan.nextDouble();


            if (genero.equalsIgnoreCase("Mulher") || genero.equalsIgnoreCase("M")) {
              
                double pesoIdeal = (62.1 * altura) - 44.7;
                if ( pesoIdeal > pesoAtual) {
                    System.out.println("Você está abaixo do peso ideal");


                }else {
                    System.out.println("Você está acima do peso ideal");
                }
               
}else { 

        double pesoIdeal = (72.7 * altura) - 44.7;

        if (pesoAtual > pesoIdeal) {
            System.out.println("Você está acima do peso");
            
        }else {
            System.out.println("Você está abaixo do peso ");
        }
    
}
scan.close();
    }
}
