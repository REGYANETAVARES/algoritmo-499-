/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuvetorprincipal;

import java.util.Scanner;

public class MenuVetorPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VetorDados vetorDados = new VetorDados(); // Instância da classe de dados

        int opcao;

        do {
            // Exibindo o menu
            System.out.println("\nMENU VETOR - FUNCAO");
            System.out.println("1. Dados do VETOR");
            System.out.println("2. Ordena VETOR");
            System.out.println("3. Imprime VETOR");
            System.out.println("4. Sai do programa");
            System.out.print("OPCAO: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    vetorDados.preencherVetor(scanner);
                    break;
                case 2:
                    if (vetorDados.isPreenchido()) {
                        vetorDados.ordenarVetor();
                        System.out.println("Vetor ordenado com sucesso!");
                    } else {
                        System.out.println("Escolha primeiro a opcao 1 para preencher o vetor.");
                    }
                    break;
                case 3:
                    if (vetorDados.isPreenchido()) {
                        vetorDados.imprimirVetor();
                    } else {
                        System.out.println("Escolha primeiro a opcao 1 para preencher o vetor.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}