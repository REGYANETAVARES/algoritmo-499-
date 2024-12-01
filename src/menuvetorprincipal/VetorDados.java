/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuvetorprincipal;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author REGYANE
 */
public class VetorDados {
    private int[] vetor;
    private boolean preenchido;

    public VetorDados() {
        this.vetor = new int[5];
        this.preenchido = false; // Flag para verificar se o vetor foi preenchido
    }

    // Método para preencher o vetor
    public void preencherVetor(Scanner scanner) {
        System.out.println("\nEntrada do VETOR:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite numero " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        this.preenchido = true; // Marca o vetor como preenchido
    }

    // Método para ordenar o vetor
    public void ordenarVetor() {
        Arrays.sort(vetor);
    }

    // Método para imprimir o vetor
    public void imprimirVetor() {
        System.out.println("\nVETOR:");
        for (int numero : vetor) {
            System.out.println(numero);
        }
    }

    // Método para verificar se o vetor foi preenchido
    public boolean isPreenchido() {
        return preenchido;
    }
}
    

