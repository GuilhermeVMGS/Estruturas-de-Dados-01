package javaapplication_guilherme;

    public class TestaVetor {

    public static void main(String[] args) {
        // 1. Criar um vetor de Strings com capacidade inicial 5
        Vetor<String> vetorString = new Vetor<>(5);
        
        System.out.println("Vetor inicial: " + vetorString); // Saída: []

        // 2. Adicionar elementos ao final do vetor
        vetorString.adiciona("elemento 1");
        vetorString.adiciona("elemento 2");
        vetorString.adiciona("elemento 3");
        System.out.println("Apos adicionar elementos: " + vetorString);

        // 3. Verificar a quantidade de elementos no vetor
        System.out.println("Quantidade de elementos: " + vetorString.tamanho());

        // 4. Obter elemento de uma posição específica
        String elemento = vetorString.busca(1);
        System.out.println("Elemento na posicao 1: " + elemento); 

        // 5. Verificar se um elemento existe no vetor
        int posicao = vetorString.busca("elemento 3");
        if (posicao != -1) {
            System.out.println("'elemento 3' encontrado na posicao: " + posicao); 
        } else {
            System.out.println("'elemento 3' nao encontrado no vetor.");
        }

        // 6. Adicionar um elemento em uma posição específica
        vetorString.adiciona(1, "elemento 1.5");
        System.out.println("Apos adicionar 'elemento 1.5' na posicao 1: " + vetorString); 

        // 7. Remover um elemento do vetor
        vetorString.remove(2);
        System.out.println("Apos remover o elemento na posicao 2: " + vetorString); 

        
    }
}
