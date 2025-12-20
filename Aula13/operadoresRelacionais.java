package Aula13;

public class operadoresRelacionais {
    public static void main (String[] args){
        System.out.println("Operadores relacionais;;");

        int valor1 = 1;
        int valor2 = 2;

        if(valor1==1 && valor2==2) {
            System.out.println("O valor de 1 e de 2 é igual a 1 e 2 respectivamente");
        }else {
            System.out.println("false");
        }
    }
    
}

// a Diferença entre o && e o & é que o comparador E duplo, da um curto circuito; ou seja, se o primeiro valor for falso, ele ja sabe que é falso e nem verifica o segundo, tornando mais facil debugar o codigo :))) 
// por isso se deve usar o && e || duplos, inves de  & e | ;;

