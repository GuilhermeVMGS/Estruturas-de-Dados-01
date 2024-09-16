package javaaplication_guilherme_desafioordenacao;

import java.util.ArrayList;

public class TestaArrayList {

    public static void main(String[] args) {
        // 1. Criação da lista e adicao de elementos
        ArrayList<Contato> lista = new ArrayList<>();
//        System.out.println("aaaaaaaaaaaaaaaaaa");
        lista.add(new Contato("Contato 1", "1111-1111", "contato1@email.com"));
        lista.add(new Contato("Contato 2", "2222-2222", "contato2@email.com"));
        lista.add(new Contato("Contato 3", "3333-3333", "contato3@email.com"));

        // 2. Verificar a quantidade de elementos
        System.out.println("Quantidade de elementos: " + lista.size());

        // 3. Imprimir elementos do ArrayL
        System.out.println("Elementos da lista:");
        for (Contato contato : lista) {
            System.out.println(contato);
        }

        // 4. Obter elemento de uma posicao
        int posicao = 1;
        System.out.println("Contato na posicao " + posicao + ": " + lista.get(posicao));

        // 5. Verificar se um elemento existe na lista
        Contato cBuscar = new Contato("Contato 2", "2222-2222", "contato2@email.com");
        System.out.println("Contato 2 existe na lista? " + lista.contains(cBuscar));

        // 6. Adicionar elemento em qualquer posicao
        Contato cAdicionar = new Contato("Contato 4", "4444-4444", "contato4@email.com");
        lista.add(1, cAdicionar); // Adiciona na posição 1
        System.out.println("Lista apos adicionar Contato 4 na posicao 1:");
        for (Contato contato : lista) {
            System.out.println(contato);
        }

        // 7. Duplicar o tamanho do ArrayL
        ArrayList<Contato> listaDuplicada = new ArrayList<>(lista.size() * 2);
        listaDuplicada.addAll(lista);
        System.out.println("Lista duplicada:");
        for (Contato contato : listaDuplicada) {
            System.out.println(contato);
        }

        // 8. Remover elemento da lista
        lista.remove(cBuscar);
        System.out.println("Lista apos remover Contato 2:");
        for (Contato contato : lista) {
            System.out.println(contato);
        }

        // 9. Pesquisar por nome
        String nomeBusca = "Contato 1";
        System.out.println("Pesquisando por nome: " + nomeBusca);
        for (Contato contato : lista) {
            if (contato.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("Encontrado: " + contato);
            }
        }

        // 10. Pesquisar por e-mail
        String emailBusca = "contato3@email.com";
        System.out.println("Pesquisando por e-mail: " + emailBusca);
        for (Contato contato : lista) {
            if (contato.getEmail().equalsIgnoreCase(emailBusca)) {
                System.out.println("Encontrado: " + contato);
            }
        }

        // 11. Pesquisar por telefone
        String telefoneBusca = "3333-3333";
        System.out.println("Pesquisando por telefone: " + telefoneBusca);
        for (Contato contato : lista) {
            if (contato.getTelefone().equals(telefoneBusca)) {
                System.out.println("Encontrado: " + contato);
            }
        }
    }
}
