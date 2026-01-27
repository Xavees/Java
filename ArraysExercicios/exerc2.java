package ArraysExercicios;

public class exerc2 {
    public static void main(String[] args) {
        double [] arrays1 = new double[8];
        double [] arrays2 = new double[8];

     arrays1[0] = 1;
     arrays1[1] = 2;
     arrays1[2] = 3;
     arrays1[3] = 4;
     arrays1[4] = 5;
     arrays1[5] = 6;
     arrays1[6] = 7;
     arrays1[7] = 8;
     

     for (int cont = 0; cont < arrays1.length; cont++) {
        arrays2[cont] = arrays1[cont] * 2;

        System.out.println("O valor do array 1 no indice :" + cont +"  é :  " + arrays1[cont]);
        System.out.println("O valor do array 2 no indice : " + cont + "  é : " + arrays2[cont]);



     }




    }
}
