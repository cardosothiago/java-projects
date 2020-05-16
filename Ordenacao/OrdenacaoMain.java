package trabalho;

import java.util.Scanner;

public class OrdenacaoMain {

	public static void main(String args[]) {
		Ordenacao colecao = new Ordenacao();

		Scanner sc = new Scanner(System.in);

		System.out.println("-----------------");
		System.out.println("Informe 3 valores");
		System.out.println("-----------------");

		System.out.print("Informe o primeiro n�mero: ");
		colecao.adicionarNumero(sc.nextInt());

		System.out.print("Informe o segundo n�mero: ");
		colecao.adicionarNumero(sc.nextInt());

		System.out.print("Informe o terceiro n�mero: ");
		colecao.adicionarNumero(sc.nextInt());

		colecao.ordenar();

		int[] valores = colecao.getNumeros();

		System.out.println("-----------------");
		System.out.println("Valores ordenados");
		System.out.println("-----------------");

		for (int i = 0; i < valores.length; i++) {
			int valor = valores[i];
			System.out.println(valor);
		}


		System.out.println("-----------------");

	}
}
