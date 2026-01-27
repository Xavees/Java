package ArraysExercicios;

public class exerc4 {
    public static void main(String[] args) {
        double [] vetorA  = new double[15];
        double [] vetorB = new double[15];

        vetorA[0] = 1;
        vetorA[1] = 4;
        vetorA[2] = 9;
        vetorA[3] = 16;
        vetorA[4] = 25;
        vetorA[5] = 36;
        vetorA[6] = 49;
        vetorA[7] = 64;
        vetorA[8] = 81;
        vetorA[9] = 100;
        vetorA[10] = 121;
        vetorA[11] = 144;
        vetorA[12] = 169;
        vetorA[13] = 196;
        vetorA[14] = 225;


        for(int cont = 0 ; cont < vetorA.length; cont++) {
                vetorB[cont] = Math.sqrt(vetorA[cont]);
               // sqrt metodo pra calcular a raiz quadrada;;
               System.out.println("o valor do indice : " + cont + " Guarda o valor" + vetorA[cont]);
               System.out.println("A raiz quadrada desse valor é " + vetorB[cont]); 




        }


        

    }
}
