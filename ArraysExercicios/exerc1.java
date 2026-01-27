package ArraysExercicios;

public class exerc1 {
    public static void main(String[] args) {
        
         double[] vetorA = new double[5];
         double[] vetorB = new double[5];

        vetorA[0] = 10;
        vetorA[1] = 20;
        vetorA[2] = 30;
        vetorA[3] = 40;
        vetorA[4] = 50;


        for(int i = 0 ; i < vetorA.length ; i++) {
            vetorB[i] = vetorA[i];

            System.out.println("O vetor B no indice : " + i + "  tem o valor de : " + vetorB[i]);
            System.out.println("O vetor a no indice : " + i + " tem o valor de : " + vetorA[i]);



        }
         




    }
    
}
