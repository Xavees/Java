package Aula12;
import java.util.Scanner;

public class leituraCompleta {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite seu nome, idade,  quantidade de filhos ,altura e se tem animal de estimação");
        String primeiroNome = scan.next(); 
        int idade = scan.nextInt();
        byte filhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean animal = scan.nextBoolean();

        System.out.println("Você digitou os seguintes valores");
        System.out.println("Nome : " + primeiroNome);
        System.out.println("idade : " + idade);
        System.out.println("Filhos : " + filhos);
        System.out.println("altura :" + altura);
        System.out.println("animal : " + animal);
    }
    
}
