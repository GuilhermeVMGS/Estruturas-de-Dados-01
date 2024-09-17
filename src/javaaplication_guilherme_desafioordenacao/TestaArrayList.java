package javaaplication_guilherme_desafioordenacao;

import java.util.ArrayList;

public class TestaArrayList {

    public static void main(String[] args) {
        // 1. Criação da lista e adição de elementos usando o método add
        ArrayList<Contato> lista = new ArrayList<>();
        lista.add(new Contato("Contato 1", "1111-1111", "contato1@email.com"));
        lista.add(new Contato("Contato 2", "2222-2222", "contato2@email.com"));
        lista.add(new Contato("Contato 3", "3333-3333", "contato3@email.com"));

        // 2. Verificar a quantidade de elementos com o método size
        System.out.println("Quantidade de elementos: " + lista.size());

        // 3. Imprimir elementos da lista
        System.out.println("Elementos da lista:");
        for (Contato contato : lista) {
            System.out.println(contato);
        }

        // 4. Obter elemento de uma posição usando o método get
        int posicao = 1;
        System.out.println("Contato na posição " + posicao + ": " + lista.get(posicao));

        // 5. Verificar se um elemento existe na lista usando o método contains
        Contato cBuscar = new Contato("Contato 2", "2222-2222", "contato2@email.com");
        System.out.println("Contato 2 existe na lista? " + lista.contains(cBuscar));

        // 6. Adicionar elemento em qualquer posição usando o método add com índice
        Contato cAdicionar = new Contato("Contato 4", "4444-4444", "contato4@email.com");
        lista.add(1, cAdicionar); // Adiciona na posição 1
        System.out.println("Lista após adicionar Contato 4 na posição 1:");
        for (Contato contato : lista) {
            System.out.println(contato);
        }

        // 7. Duplicar o tamanho do ArrayList
        ArrayList<Contato> listaDuplicada = new ArrayList<>(lista.size() * 2);
        listaDuplicada.addAll(lista); // Usando o método addAll para duplicar
        System.out.println("Lista duplicada:");
        for (Contato contato : listaDuplicada) {
            System.out.println(contato);
        }

        // 8. Remover elemento da lista usando o método remove
        lista.remove(cBuscar);
        System.out.println("Lista após remover Contato 2:");
        for (Contato contato : lista) {
            System.out.println(contato);
        }

        // 9. Pesquisar por nome usando o método indexOf (comparando o nome)
        String nomeBusca = "Contato 1";
        boolean encontrado = false;
        for (Contato contato : lista) {
            if (contato.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("Encontrado: " + contato);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contato com nome " + nomeBusca + " não encontrado.");
        }

        // 10. Pesquisar por e-mail usando o método indexOf (comparando o e-mail)
        String emailBusca = "contato3@email.com";
        encontrado = false;
        for (Contato contato : lista) {
            if (contato.getEmail().equalsIgnoreCase(emailBusca)) {
                System.out.println("Encontrado: " + contato);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contato com e-mail " + emailBusca + " não encontrado.");
        }

        // 11. Pesquisar por telefone usando o método indexOf (comparando o telefone)
        String telefoneBusca = "3333-3333";
        encontrado = false;
        for (Contato contato : lista) {
            if (contato.getTelefone().equals(telefoneBusca)) {
                System.out.println("Encontrado: " + contato);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Contato com telefone " + telefoneBusca + " não encontrado.");
        }
    }
}

