import java.util.Random;
import java.util.Scanner;

public class TesteAlgoritimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int tamanhoVetor = 100000; 

        int[] vetorOriginal = new int[tamanhoVetor];
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorOriginal[i] = random.nextInt(100); 
        }  
        
        int[] vetorAtual = vetorOriginal.clone(); // Vetor que será manipulado
        int[] vetorAtual = vetorOriginal.clone();
        NossoVetor nossoVetor = new NossoVetor(vetorAtual);
        boolean vetorOrdenado = false; 

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Ordenação: Bubble Sort");
            System.out.println("2. Ordenação: Insertion Sort");
            System.out.println("3. Ordenação: Selection Sort");
            System.out.println("4. Busca: Busca Linear");
            System.out.println("5. Busca: Busca Binária");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: // Bubble Sort
                    vetorAtual = vetorOriginal.clone();
                    nossoVetor = new NossoVetor(vetorAtual);
                    // long inicioBubble = System.nanoTime();
                    nossoVetor.bubbleSort();
                    // long fimBubble = System.nanoTime();
                    //vetorOrdenado = true;
                    // System.out.println("\nVetor ordenado:");
                    // for (int num : nossoVetor.getVetor()) {
                    //     System.out.print(num + " ");
                    // }
                    System.out.println("\n\nNúmero de comparações e trocas: " + nossoVetor.comparacoes + nossoVetor.trocas);
                    // System.out.println("Número de trocas: " + nossoVetor.trocas);
                    // System.out.println("Bubble Sort - Tempo de execução (ns): " + (fimBubble - inicioBubble));
                    break;

                case 2: // Insertion Sort
                    vetorAtual = vetorOriginal.clone();
                    nossoVetor = new NossoVetor(vetorAtual);
                    // long inicioInsertion = System.nanoTime();
                    nossoVetor.insertionSort();
                    // long fimInsertion = System.nanoTime();
                    //vetorOrdenado = true;
                    System.out.println("\n\nNúmero de comparações e trocas: " + nossoVetor.comparacoes + nossoVetor.trocas);
                    // System.out.println("Vetor ordenado:");
                    // for (int num : nossoVetor.getVetor()) {
                    //     System.out.print(num + " ");
                    // }
                    // System.out.println("\nNúmero de comparações: " + nossoVetor.comparacoes);
                    // System.out.println("Número de trocas: " + nossoVetor.trocas);
                    // System.out.println("Insertion Sort - Tempo de execução (ns): " + (fimInsertion - inicioInsertion));
                    // System.out.println();
                    break;

                case 3: // Selection Sort
                    vetorAtual = vetorOriginal.clone();
                    nossoVetor = new NossoVetor(vetorAtual);
                    //long inicioSelection = System.nanoTime();
                    nossoVetor.selectionSort();
                    System.out.println("\n\nNúmero de comparações e trocas: " + nossoVetor.comparacoes + nossoVetor.trocas);
                    //long fimSelection = System.nanoTime();
                    // vetorOrdenado = true;
                    // System.out.println("Vetor ordenado:");
                    // for (int num : nossoVetor.getVetor()) {
                    //     System.out.print(num + " ");
                    // }
                    // System.out.println("\nNúmero de comparações: " + nossoVetor.comparacoes);
                    // System.out.println("Número de trocas: " + nossoVetor.trocas);
                    // System.out.println("Selection Sort - Tempo de execução (ns): " + (fimSelection - inicioSelection));
                    // System.out.println();
                    break;

                case 4: // Busca Linear
                    System.out.print("Digite o valor a ser buscado: ");
                    int valorBuscaLinear = scanner.nextInt();
                    long inicioBuscaLinear = System.nanoTime();
                    int resultadoBuscaLinear = nossoVetor.buscaLinear(valorBuscaLinear);
                    long fimBuscaLinear = System.nanoTime();
                    System.out.println("Resultado da Busca Linear: " + (resultadoBuscaLinear != -1 ? "Encontrado no índice " + resultadoBuscaLinear : "Não encontrado"));
                    System.out.println("Número de comparações: " + nossoVetor.comparacoesBusca);
                    System.out.println("Busca Linear - Tempo de execução (ns): " + (fimBuscaLinear - inicioBuscaLinear));
                    break;

                case 5: // Busca Binária
                    if (!vetorOrdenado) {
                        System.out.println("Erro: O vetor precisa estar ordenado para realizar a Busca Binária.");
                        break;
                    }
                    System.out.print("Digite o valor a ser buscado: ");
                    int valorBuscaBinaria = scanner.nextInt();
                    long inicioBuscaBinaria = System.nanoTime();
                    int resultadoBuscaBinaria = nossoVetor.buscaBinaria(valorBuscaBinaria);
                    long fimBuscaBinaria = System.nanoTime();
                    System.out.println("Resultado da Busca Binária: " + (resultadoBuscaBinaria != -1 ? "Encontrado no índice " + resultadoBuscaBinaria : "Não encontrado"));
                    System.out.println("Número de comparações: " + nossoVetor.comparacoesBusca);
                    System.out.println("Busca Binária - Tempo de execução (ns): " + (fimBuscaBinaria - inicioBuscaBinaria));
                    break;

                case 6: // Sair
                    System.out.println("Encerrando o programa. Até breve...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}