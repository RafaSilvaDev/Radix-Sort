package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import implementation.RadixSort;

class SortTests {
	int[] numeros, novosNumeros;
	RadixSort radixS;
	
	@BeforeEach
	void setUp() throws Exception {
		radixS = new RadixSort();
	}

	@Test
	void radixSortDezElementos() {
		numeros = new int[10];
		Random rand = new Random();
		for(int i=0; i<10; i++) {
			numeros[i] = rand.nextInt(100);
		}
		Arrays.sort(numeros);
		assertEquals(numeros,radixS.radixSort(numeros));
	}
	
	@Test
	void radixSortCemElementos() {
		numeros = new int[100];
		Random rand = new Random();
		for(int i=0; i<100; i++) {
			numeros[i] = rand.nextInt(100);
		}
		Arrays.sort(numeros);
		assertEquals(numeros,radixS.radixSort(numeros));
	}
	
	@Test
	void radixSortMilElementos() {
		numeros = new int[1000];
		Random rand = new Random();
		for(int i=0; i<1000; i++) {
			numeros[i] = rand.nextInt(100);
		}
		Arrays.sort(numeros);
		assertEquals(numeros,radixS.radixSort(numeros));
	}
	
	@Test
	void radixSortUmMilhaoElementos() {
		numeros = new int[1000000];
		Random rand = new Random();
		for(int i=0; i<1000000; i++) {
			numeros[i] = rand.nextInt(100);
		}
		Arrays.sort(numeros);
		assertEquals(numeros,radixS.radixSort(numeros));
	}
	
	@Test
	void radixSortCemMilhoesElementos() {
		numeros = new int[100000000];
		Random rand = new Random();
		for(int i=0; i<100000000; i++) {
			numeros[i] = rand.nextInt(100);
		}
		Arrays.sort(numeros);
		assertEquals(numeros,radixS.radixSort(numeros));
	}

}
