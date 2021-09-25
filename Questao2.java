package pratica2409;

// import java.util.Scanner;

// public class Questao2 {
//     public static void main(String[] args) {
//         int opcao;
//         Scanner input = new Scanner(System.in); //0
//         double n1, n2, divisao, raio, area;
//         do {
//             System.out.println("Digite a opção: ");
//             System.out.println("1: Divisão");
//             System.out.println("2: Área do Círculo");
//             System.out.println("3: Média de 5 números");
//             System.out.println("4: Sair");
//             opcao = input.nextInt(); //1
//             switch (opcao) {
//                 case 1:
//                     System.out.println("Digite os números: "); //2
//                     n1 = input.nextDouble(); //2
//                     n2 = input.nextDouble(); //2
//                     divisao = n1 / n2;
//                     System.out.println("Resultado da divisão: " + divisao);
//                     break;
//                 case 2:
//                     System.out.println("Digite o raio: ");
//                     raio = input.nextDouble();
//                     area = Math.PI * Math.pow(raio, 3); //!!0
//                     System.out.format("Área do círculo: %.2f\n", area);
//                     break;
//                 case 3:
//                     System.out.println("Digite os 5 números: ");
//                     double numeros[] = new double[5];
//                     double soma = 0;
//                     for (int i = 1; i <= 5; i++) { //!!==!!0
//                         numeros[i] = input.nextDouble(); //!!==!!0
//                         soma = soma + numeros[i]; //!!==!!0
//                     }
//                     System.out.println("Média: " + soma / 5);
//                     break;
//                 case 4:
//                     System.out.println("Fim do programa!");
//                     // (tag 3)
//                 default:
//                     System.out.println("Opção inválida!");
//             }
//         } while (opcao <= 4); //!!1
//     }
// }

/*=====RESPOSTA A=====*/
/*
TAGS SERÃO REPRESENTADAS COMO COMENTÁRIOS NA FRENTE DO CÓDIGO
LEGENDA:
n = numero

n = Tag de ERRO
!!n = Tag de DEFEITO
!!==!!n = Tag de FALHA

*/

/*
==========ERRO=========
|1. Não fechar o ciclo do input no final da utilização (tag 0)
|2. Não incluir uma limpeza de input para remover uma possivel quebra de linha desnecessaria (tag 1)
|3. Não mostrar qual numero esta sendo inserido na opção de divisão (tag 2)
|4. Faltando o break no final do caso 4, para não mostrar opção invalida no final do programa quando o usuario desejar sair do programa (tag 3)
=======================
*/

/*
========DEFEITO========
|1. Calculo incorreto da area de uma circunferência, o correto seria raio ao quadrado e NÃO raio ao cubo(tag !!0)
|2. Estrutura While finalizando o programa caso o numero da opção seja MAIOR que 4, porém continua em loop caso seja MENOR que 0 (tag !!2)
=======================
*/

/*
=========FALHA=========
|1. Estrutura For começando no index errado e indo alem do tamanho do array especificado, causando uma quebra no programa (tag !!==!!0)
=======================
*/

/*=====RESPOSTA B=====*/
/*
===================================CÓDIGO CORRIGIDO=================================
*/

import java.util.Scanner;

public class Questao2 {
    //Variavel geral da classe
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        
        double n1, n2, raio;
        int quantidadeNumerosMedia;
        do {
            System.out.println("Digite a opção: ");
            System.out.println("1: Divisão");
            System.out.println("2: Área do Círculo");
            System.out.println("3: Média de 'n' números");
            System.out.println("4: Sair");
            opcao = input.nextInt();
            input.nextLine(); //Lixeira de quebra de linha ocasional
            switch (opcao) {
                case 1:
                    System.out.println("Digite o número dividendo: ");
                    n1 = input.nextDouble();
                    System.out.println("Digite o número divisor: ");
                    n2 = input.nextDouble();
                    System.out.println("Resultado da divisão: " + calcularDivisao(n1, n2));
                    break;
                case 2:
                    System.out.println("Digite o raio: ");
                    raio = input.nextDouble();
                    System.out.format("Área do círculo: %.2f\n", calcularAreaDoCirculo(raio));
                    break;
                case 3:
                    System.out.println("Digite quantos números deseja a média: ");
                    quantidadeNumerosMedia = input.nextInt();
                    System.out.println("Média: " + calcularMediaDeTantosNumeros(quantidadeNumerosMedia));
                    break;
                case 4:
                    System.out.println("Fim do programa!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
        input.close();
    }

    //Calcular a divisao de dois numeros
    public static double calcularDivisao(double numero1, double numero2) {
        return numero1 / numero2;
    }

    //Calcular a area do circulo baseando-se no tamanho do raio
    public static double calcularAreaDoCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    //Calcular a media de tantos numeros determinados pelo tamanho do array
    public static double calcularMediaDeTantosNumeros(int tamanhoArray) {
        double numeros[] = new double[tamanhoArray];
        double soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %d número: ", i+1);
            numeros[i] = input.nextDouble();
            soma += numeros[i];
        }

        if (numeros.length != 0) {
            return soma / numeros.length;
        }
        else {
            return 0;
        }
    }
}