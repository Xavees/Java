package Aula18;


public class BreakContinueExemplo {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            // CONTINUE
            if (i == 5) {
                continue; // pula o restante do laço e vai para o próximo i
            }

            // BREAK
            if (i == 8) {
                break; // encerra o laço imediatamente
            }

            System.out.println("Valor de i: " + i);
        }

        System.out.println("Laço finalizado");
    }
}
