package ArraysExercicios;

public class exerc5 {
    public static void main(String[] args) {
        double [] vetorA = new double [10];
        double [] vetorB = new double [10];

        
        
        vetorA[0] =  10;
        vetorA[1] =  20;
        vetorA[2] =  30;
        vetorA[3] =  40;
        vetorA[4] =  50;
        vetorA[5] =  60;
        vetorA[6] =  70;
        vetorA[7] =  80;
        vetorA[8] =  90;
        vetorA[9] =  100;

        for(int i = 0 ; i < vetorA.length; i++) {
            vetorB[i] = vetorA [i] * i;
            System.out.println("O Vetor A no indice : " + i + " tem o valor de   :  " + vetorA[i] );
            System.out.println("O vetor B nesse mesmo indice , é  :" + vetorB[i]);
                



        }





    }
}
