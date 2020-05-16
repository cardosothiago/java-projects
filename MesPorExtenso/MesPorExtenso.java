package trabalho;

public class Mes {

	public int mesdoano;

	public int getMesDoAno() {
		return mesdoano;
	}

	public void setMesDoAno(int mesdoano) {
		this.mesdoano = mesdoano;
	}

	public int getMesPorExtenso(int mesporextenso) {
		switch (mesdoano)

		{

		case 1:

			System.out.print("January - Mês ");

			break;

		case 2:

			System.out.print("February - Mês ");

			break;

		case 3:

			System.out.print("March - Mês ");

			break;

		case 4:

			System.out.print("April - Mês ");

			break;

		case 5:

			System.out.print("May - Mês ");

			break;

		case 6:

			System.out.print("June - Mês ");

			break;

		case 7:

			System.out.print("July - Mês ");

			break;

		case 8:

			System.out.print("August - Mês ");

			break;

		case 9:

			System.out.print("September - Mês ");

			break;

		case 10:

			System.out.print("October - Mês ");
			

			break;

		case 11:

			System.out.print("November - Mês ");

			break;

		case 12:

			System.out.print("December - Mês ");

			break;

		default:

			System.out.print("Um ano tem doze meses, que vão de 1 a 12, este não é um mês válido!");
			
		}
		return mesporextenso;
		
	}
}
