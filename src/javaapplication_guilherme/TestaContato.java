package javaapplication_guilherme;

public class TestaContato {

    public static void main(String[] args) {
        // Criacao de um vetor de Contatos com capacidade inicial de 5 elementos
        Vetor<Contato> vetor = new Vetor<>(5);

        // Criacao de alguns contatos
        Contato contato1 = new Contato("Alice", "1234-5678", "alice@example.com");
        Contato contato2 = new Contato("Bob", "2345-6789", "bob@example.com");
        Contato contato3 = new Contato("Carol", "3456-7890", "carol@example.com");

        // 1. Adicionar elementos ao final do vetor
        vetor.adiciona(contato1);
        vetor.adiciona(contato2);
        vetor.adiciona(contato3);
        System.out.println("1.Vetor apos adicionar elementos: ");
        System.out.println(vetor);

        // 2. Verificar a quantidade de elementos no vetor
        System.out.println("2.Quantidade de elementos no vetor: " + vetor.tamanho());

        // 3. Imprimir elementos do vetor
        System.out.println("3.Elementos do vetor:");
        System.out.println(vetor);

        // 4. Obter elemento de uma posicao do vetor
        System.out.println("4.Elemento na posicao 1: " + vetor.busca(1));

        // 5. Verificar se um elemento existe no vetor
        int posicao = vetor.busca(contato2);
        System.out.println("5.Posicao do 'Bob': " + posicao);

        // Verificar um elemento que nao existe
        Contato contatoNaoExistente = new Contato("Dave", "4567-8901", "dave@example.com");
        posicao = vetor.busca(contatoNaoExistente);
        System.out.println("Posicao do 'Dave': " + posicao); // Esperado: -1

        // 6. Adicionar elemento em qualquer posicao do vetor
        Contato contato4 = new Contato("Eve", "4567-8901", "eve@example.com");
        vetor.adiciona(1, contato4);
        System.out.println("6.Vetor apos adicionar 'Eve' na posicao 1: ");
        System.out.println(vetor);

        // 7. Duplicar o tamanho do vetor (testado automaticamente ao adicionar mais elementos)
        Contato contato5 = new Contato("Frank", "5678-9012", "frank@example.com");
        vetor.adiciona(contato5);
        vetor.adiciona(new Contato("Grace", "6789-0123", "grace@example.com")); // Esse deve disparar o aumento de capacidade
        System.out.println("7.Vetor apos adicionar mais elementos (incluindo aumento de capacidade): ");
        System.out.println(vetor);

        // 8. Remover elemento do vetor
        vetor.remove(1);
        System.out.println("8.Vetor apos remover o elemento na posicao 1: ");
        System.out.println(vetor);

        // 9. Pesquisa por nome
        Contato encontradoPorNome = Contato.pesquisaPorNome(vetor, "Alice");
        System.out.println("9. da pesquisa por nome 'Alice': " + encontradoPorNome);

        // 10. Pesquisa por e-mail
        Contato encontradoPorEmail = Contato.pesquisaPorEmail(vetor, "frank@example.com");
        System.out.println("10.Resultado da pesquisa por e-mail 'frank@example.com': " + encontradoPorEmail);
    }
}
