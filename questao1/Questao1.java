package pratica2409.questao1;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        float altura, baseMaior, baseMenor; /* mE, area; -> Desnecessario criar variaveis para dar um retorno simples */
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe a ALTURA do trapézio: ");
        altura = input.nextFloat();
        System.out.print("Informe a base MAIOR do trapézio: ");
        baseMaior = input.nextFloat();

        //Verificando se a base MENOR realmente é MENOR que a base MAIOR
        do {
            System.out.print("Informe a base MENOR do trapézio: ");
            baseMenor = input.nextFloat();

            if (baseMenor >= baseMaior) {
                System.out.printf("Sua base MENOR esta sendo maior ou igual que a base MAIOR de %.2f, tente novamente%n", baseMaior);
            }
        } while (baseMenor >= baseMaior);

        Trapezio trapezio = new Trapezio(altura, baseMaior, baseMenor);
        
        input.close(); /* -> Fechando o fluxo do input, para nao consumir mais memoria de maneira desnecessaria */

        System.out.println("A area é: " + trapezio.calcularArea());
        System.out.println("A mediana de Euler é: " + trapezio.calcularMedianaEuler());
    }


}