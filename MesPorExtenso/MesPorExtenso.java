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

			System.out.print("January - M�s ");

			break;

		case 2:

			System.out.print("February - M�s ");

			break;

		case 3:

			System.out.print("March - M�s ");

			break;

		case 4:

			System.out.print("April - M�s ");

			break;

		case 5:

			System.out.print("May - M�s ");

			break;

		case 6:

			System.out.print("June - M�s ");

			break;

		case 7:

			System.out.print("July - M�s ");

			break;

		case 8:

			System.out.print("August - M�s ");

			break;

		case 9:

			System.out.print("September - M�s ");

			break;

		case 10:

			System.out.print("October - M�s ");
			

			break;

		case 11:

			System.out.print("November - M�s ");

			break;

		case 12:

			System.out.print("December - M�s ");

			break;

		default:

			System.out.print("Um ano tem doze meses, que v�o de 1 a 12, este n�o � um m�s v�lido!");
			
		}
		return mesporextenso;
		
	}
}
