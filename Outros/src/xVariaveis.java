import java.util.Scanner;

public class xVariaveis {

    public static void main(String[] args) {
         
        //variaveis imutaveis (constantes) - impossivel alterar o valor da variavel
        final double PI = 3.14159;

        //escopo de variaveis
        int x;

        if (true){
            x=10;
        } else{
            x=2;
        }

        System.out.println(x);

        System.out.println("");

        //tipos primitivos e nao primitivos de variaveis
        int a = 2;
        Integer b = 4;
        System.out.println(a);
        System.out.println(b);

        System.out.println("");


        //integracao com o usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String name = scanner.nextLine();
        System.out.println("Ola, "+ name);

        scanner.close();

    }

    
}
