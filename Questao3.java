package pratica2409;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        // ==FALHA==
        // int i = 0;
        // while (i < 10) { // Erro = Falta a incrementação do i para sair do While
        // System.out.println("Hello World\n"); //Falha = Código entra em Loop Infinito
        // }

        // ==CORREÇÃO==
        // int i = 0;
        // while (i < 10) {
        //     System.out.printf("%d Hello World\n", i);
        //     i++;
        // }

        // ==FALHA==
        // TODO code application logic here
        // int cont = 0; //Erro = variavel 'cont' não tem o seu valor final, pós segundo For utilizado em lugar nenhum
        // int vetor1[] = new int[10];
        // int vetor2[] = new int[10];// Erro = vetor2[] não tendo nenhum valor para ser comparado, além de 0
        // Scanner input = new Scanner(System.in); // Erro = Input não tendo o seu ciclo fechado
        // for (int i = 0; i <= 10; i++) { // Falha = For indo além do tamanho do Array
        //     System.out.println("Informe um numero: ");
        //     vetor1[i] = input.nextInt();
        // }
        // for (int i = 0; i <= 10; i++) { // Falha = For indo além do tamanho do Array 
        //     for (int j = 0; j <= 10; j++) { // Falha = For indo além do tamanho do Array // Falha = Segundo For totalmente desnecessário
        //         if (vetor1[i] == vetor2[j]) {
        //             cont++;
        //         }
        //     }
        // }

        //==CORREÇÃO==
        // TODO code application logic here
        int cont = 0;
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        //Possível solução secundária (Adicionar valores ao vetor2 para comparar a quantidade de valores iguais ao vetor1)
        //int vetor2[] = {0, 1, 2, 4, 5, 6, 8, 9, 10, 5};
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um numero: ");
            vetor1[i] = input.nextInt();

            if (vetor1[i] == vetor2[i]) {
                cont++;
            }
        }
        input.close();
        System.out.println("A quantidade de numeros iguais foram: " + cont);
    }
}
