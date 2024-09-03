package javaapplication_guilherme;

public class Contato {
    private String nome;
    private String telefone;
    private String email;
    
    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        }

    public void setNome(String nome) {
        this.nome = nome;
}
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString() {
        return "Contato{" + "nome='" + nome + '\'' + ", telefone='" + telefone + '\'' + ", email='" + email + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        Contato outro = (Contato) obj;
        
        if (nome == null) {
            if (outro.nome != null) {
                return false;
            }
        }
        else if (!nome.equals(outro.nome)) {
            return false;
        }

        if (email == null) {
            if (outro.email != null) {
                return false;
            }
        } 
        else if (!email.equals(outro.email)) {
            return false;
        }

        if (telefone == null) {
            if (outro.telefone != null) {
                return false;
            }
        } 
        else if (!telefone.equals(outro.telefone)) {
            return false;
        }
        
        return true;
    }
    
    public static Contato pesquisaPorNome(Vetor<Contato> vetor, String nome) {
        for (int i = 0; i < vetor.tamanho(); i++) {
            Contato contato = vetor.busca(i);
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null; // Retorna null se não encontrar o nome
    }
    
    public static Contato pesquisaPorEmail(Vetor <Contato> vetor, String email) {
        for (int i = 0; i < vetor.tamanho(); i++) {
            Contato contato = vetor.busca(i);
            if (contato.getEmail().equalsIgnoreCase(email)) {
                return contato;
            }
        }
        return null; // Retorna null se não encontrar o e-mail
    }
}