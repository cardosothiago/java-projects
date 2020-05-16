package trabalho;

import java.util.Arrays;

public class Ordenacao {
	private static final int TAMANHO = 3;
	
	private int[] numeros = new int[TAMANHO];
	private int cont = -1;
	
	public void adicionarNumero( int numero ) {
		cont++;
		if( cont < TAMANHO ) {
			numeros[cont] = numero;
		}
	}
	
	public void ordenar() {
		Arrays.sort(numeros);
	}

	public int[] getNumeros() {
		return numeros;
	}
	


}
