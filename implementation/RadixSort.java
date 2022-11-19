package implementation;

import java.util.*;

public class RadixSort {

	public int[] radixSort(int[] lista) {
		final int qtdChaves = 10;

		List<Integer>[] chaves = new ArrayList[qtdChaves];

		// dentro de cada posição da lista 'chaves', teremos outra lista de inteiros
		// cada lista irá guardar os numeros de maneira ordenada de acordo com sua unidade, dezena, centena...
		for (int i = 0; i < chaves.length; i++) {
			chaves[i] = new ArrayList<Integer>();
		}
		
		//variável para verificar se os numeros de maior tamanho já foram analisados
		boolean tamMax = false;
		
		//variaveis de apoio para a analise
		int temp = -1, posicao = 1;

		// laço while verificando se o comprimento máximo já foi atingido
		// logo, verificando se todos os digitos dos numeros já foram ordenados
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
					// caso não, atribuir falso para percorrer novamente
					tamMax = false;
				}
			}

			int a = 0;
			// percorrendo todas as sublistas dentro de 'chaves'
			for (int b = 0; b < qtdChaves; b++) {
				for (Integer i : chaves[b]) {
					// atribuindo valores já ordenados dentro da lista
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
	 * para realizarmos a ordenação.
	 * 
	 * A complexidade de tempo do Radix Sort é de O(n*s), onde:
	 * O = Complexidade
	 * n = Numero de elementos
	 * s = Tamanho da string
	 * 
	 * Links úteis:
	 * https://www.youtube.com/watch?v=R9zW0SDJ3HY <- explicação simplificada
	 * https://www.youtube.com/watch?v=Lb_1R6JGD6o <- muito bem explicativo
	 * https://www.cs.usfca.edu/~galles/visualization/RadixSort.html
	 */
	
}
