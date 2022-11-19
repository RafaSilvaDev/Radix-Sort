package implementation;

import java.util.*;

public class RadixSort {

	public int[] radixSort(int[] lista) {
		final int qtdChaves = 10;

		List<Integer>[] chaves = new ArrayList[qtdChaves];

		// dentro de cada posi��o da lista 'chaves', teremos outra lista de inteiros
		// cada lista ir� guardar os numeros de maneira ordenada de acordo com sua unidade, dezena, centena...
		for (int i = 0; i < chaves.length; i++) {
			chaves[i] = new ArrayList<Integer>();
		}
		
		//vari�vel para verificar se os numeros de maior tamanho j� foram analisados
		boolean tamMax = false;
		
		//variaveis de apoio para a analise
		int temp = -1, posicao = 1;

		// la�o while verificando se o comprimento m�ximo j� foi atingido
		// logo, verificando se todos os digitos dos numeros j� foram ordenados
		while (!tamMax) {
			tamMax = true;

			// percorrendo lista
			for (Integer i : lista) {
				// definindo qual numero da lista iremos analisar
				temp = i / posicao;
				// incrementando indice do valor chave
				chaves[temp % qtdChaves].add(i);
				// verificando se o comprimento maximo foi atingido
				if (tamMax && temp > 0) {
					// caso n�o, atribuir falso para percorrer novamente
					tamMax = false;
				}
			}

			int a = 0;
			// percorrendo todas as sublistas dentro de 'chaves'
			for (int b = 0; b < qtdChaves; b++) {
				for (Integer i : chaves[b]) {
					// atribuindo valores j� ordenados dentro da lista
					lista[a++] = i;
				}
				// limpar conjunto de valores
				chaves[b].clear();
			}
			posicao *= qtdChaves;
		}
		return lista;
	}

	/*
	 * O Radix Sort funciona junto ao Counting Sort.
	 * Nele, iremos analisar numeros e ordena-los de acordo com sua unidade, dezena, centena... e assim por diante.
	 * Quando analisamos os numeros dentro de cada casa de unidade de medida, iremos realizar um counting sort entre 10 chaves
	 * para realizarmos a ordena��o.
	 * 
	 * A complexidade de tempo do Radix Sort � de O(n*s), onde:
	 * O = Complexidade
	 * n = Numero de elementos
	 * s = Tamanho da string
	 * 
	 * Links �teis:
	 * https://www.youtube.com/watch?v=R9zW0SDJ3HY <- explica��o simplificada
	 * https://www.youtube.com/watch?v=Lb_1R6JGD6o <- muito bem explicativo
	 * https://www.cs.usfca.edu/~galles/visualization/RadixSort.html
	 */
	
}
