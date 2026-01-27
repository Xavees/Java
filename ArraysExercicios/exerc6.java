package ArraysExercicios;

public class exerc6 {
    public static void main(String[] args) {
        double [] vetorA = new double[10];
        double [] vetorB = new double[10];
        double [] vetorC = new double[10];


        vetorA[0] = 90;
        vetorA[1] = 80;
        vetorA[2] = 70;
        vetorA[3] = 60;
        vetorA[4] = 50;
        vetorA[5] = 40;
        vetorA[6] = 30;
        vetorA[7] = 20;
        vetorA[8] = 10;
        vetorA[9] = 0;

        vetorB[0] = 0;
        vetorB[1] = 10;
        vetorB[2] = 20;
        vetorB[3] = 30;
        vetorB[4] = 40;
        vetorB[5] = 50;
        vetorB[6] = 60;
        vetorB[7] = 70;
        vetorB[8] = 80;
        vetorB[9] = 90;

    
     for(int i= 0; i < vetorA.length; i++ ) {
        vetorC [i] = vetorA[i] + vetorB[i];
        System.out.println("O valor do vetor A é : " + vetorA[i]);
        System.out.println("O valor do vetor B É : " + vetorB[i]);
        System.out.println("O valor do vetor A + B  é : " + vetorC[i]);


     }

         
    
    
    
    
    
    
    
    
    
    
    }
}
