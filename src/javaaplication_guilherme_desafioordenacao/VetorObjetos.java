package javaaplication_guilherme_desafioordenacao;

public class VetorObjetos {

	private Object[] elementos; 
	private int tamanho;

	public VetorObjetos(int capacidade){
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}

	public boolean adiciona(Object elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}
	
	public boolean adiciona(int posicao, Object elemento){	
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao invalida");
		}
		this.aumentaCapacidade();
		//mover todos os elementos
		for (int i=this.tamanho-1; i>=posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}
	
	private void aumentaCapacidade(){
		if (this.tamanho == this.elementos.length){
			Object[] elementosNovos = new Object[this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public Object busca(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao invalida");
		} 
		return this.elementos[posicao];
	}
	
	public int busca(Object elemento){
		for (int i=0; i<this.tamanho; i++){
			if (this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}
	
	public void remove(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao invalida");
		}
		for (int i=posicao; i<this.tamanho-1; i++){
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	public int tamanho(){
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i=0; i<this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (this.tamanho>0){
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");
		return s.toString();
	}

	public int capacidade() {
		return this.elementos.length;
	}   

	// MÃ©todo Bubble Sort para ordenar os elementos
    public void ordena() {
    for (int i = 0; i < this.tamanho - 1; i++) {  // Passagens
        boolean trocou = false;
        for (int j = 0; j < this.tamanho - 1 - i; j++) {  // Comparacoes
            if (this.elementos[j] instanceof Comparable && this.elementos[j + 1] instanceof Comparable) {
                Comparable obj1 = (Comparable) this.elementos[j];
                Comparable obj2 = (Comparable) this.elementos[j + 1];
                if (obj1.compareTo(obj2) > 0) {
                    // Troca os elementos
                    Object temp = this.elementos[j];
                    this.elementos[j] = this.elementos[j + 1];
                    this.elementos[j + 1] = temp;
                    trocou = true;
                }
            } else {
                throw new IllegalArgumentException("Elementos nao comparaveis.");
            }
        }
        // Se nao houve trocas, o vetor ja¡ esta¡ ordenado
        if (!trocou) {
            break;
        }
    }
}

}

