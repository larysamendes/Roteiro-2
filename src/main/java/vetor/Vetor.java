package vetor;

import java.util.Comparator;

/**
 * Implementação de um vetor de objetos simples para exercitar os conceitos de
 * Generics.
 * 
 * @author Adalberto
 *
 */
public class Vetor<T> {

	// O array interno onde os objetos manipulados são guardados
	private T[] arrayInterno;

	// O tamanho que o array interno terá
	private int tamanho;

	// Indice que guarda a proxima posição vazia do array interno
	private int indice;

	// O Comparators a serem utilizados
	private Comparator comparadorMaximo;
	private Comparator comparadorMinimo;

	public Vetor(int tamanho) {
		super();
		this.tamanho = tamanho;
		this.indice = 0;
		this.arrayInterno = new T[this.tamanho];
	}

	public void setComparadorMaximo(Comparator comparadorMaximo) {
		this.comparadorMaximo = comparadorMaximo;
	}

	public void setComparadorMinimo(Comparator comparadorMinimo) {
		this.comparadorMinimo = comparadorMinimo;
	}

	// Insere um objeto no vetor
	public void inserir(T o) {
		this.arrayInterno[indice ++] = o;
	}

	// Remove um objeto do vetor
	public void remover(T o) {
		this.arrayInterno[indice] = null;
	}

	// Procura um elemento no vetor
	public boolean  procurar(T o) {
		
		for (int i =0; i < this.arrayInterno.length; i ++){
			if (this.arrayInterno[i] == o){
				return true;
			}
		}return false;
	}

	// Diz se o vetor está vazio
	public boolean isVazio() {
		for (int i =0; i < this.arrayInterno.length; i ++){
			if (this.arrayInterno[i] != null){
				return false;
			}
		}return true;
	}

	// Diz se o vetor está cheio
	public boolean isCheio() {
		for (int i =0; i < this.arrayInterno.length; i ++){
			if (this.arrayInterno[i] == null){
				return false;
			}
		}return true;
	}

}
