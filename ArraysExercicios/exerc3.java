package ArraysExercicios;

public class exerc3 {
    public static void main(String[] args) {
        double [] arrays1 = new double[15];
        double [] arrays2 = new double[15];

        arrays1[0] = 2;
        arrays1[1] = 4;
        arrays1[2] = 8;
        arrays1[3] = 10;
        arrays1[4] = 12;
        arrays1[5] = 14;
        arrays1[6] = 16;
        arrays1[7] = 18;
        arrays1[8] = 20;
        arrays1[9] = 22;
        arrays1[10] = 24;
        arrays1[11] = 26;
        arrays1[12] = 28;
        arrays1[13] = 30;
        arrays1[14] = 32;

        for (int i = 0 ; i < arrays1.length ; i++) {
            arrays2[i] = arrays1[i] * arrays1[i];

            System.out.println("O array 1 do indice : " + i +  " É igual a " + arrays1[i]);
            System.out.println("O quadrado do array é : " + i + "É " + arrays2[i] );


        }



    }
    
}
