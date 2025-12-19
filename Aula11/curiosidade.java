public class curiosidade {
    public static void main (String[] args) {
        int limite1 = 2147483647;

        int ascenderLimite = 1;

        System.out.println(limite1 + ascenderLimite);

        // Porque diabos quando somamos o numero maximo -> "2147483647" com +1 no Java ele da o valor "minimo do tipo int"? , Simples, é como se fosse uma roleta sem fim, ou seja, como se fossem valores em circulo, nao existe começo e fim, entao inves de dar erro quando extrapolamos o limite, ele volta pra o inicio, simples assim. 
    }
}
