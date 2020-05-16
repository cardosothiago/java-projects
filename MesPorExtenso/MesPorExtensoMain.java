package trabalho;

import java.util.Scanner;

public class MesMain {

	public static void main(String args[]) {


		Scanner sc = new Scanner(System.in);
		Mes m = new Mes();
		
		System.out.println("Informe o número do mês: ");
		int mesdoano = sc.nextInt();
		m.setMesDoAno(mesdoano);
		System.out.print(m.getMesPorExtenso(mesdoano) + ".");
	}
}
