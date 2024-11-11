package interfacce;

public class CalcolatriceV1 implements Calcolatore
{
	@Override
	public double somma(double a, double b)
	{
		return a+b;
	}

	@Override
	public double sottrazione(double a, double b)
	{
		return a-b;
	}

	@Override
	public double moltiplicazione(double a, double b)
	{
		return a*b;
	}

	@Override
	public double divisione(double a, double b)
	{
		return (double)a/b;
	}

	@Override
	//FATTORIALE DI UN NUMERO È la moltiplicazione dei numeri da 1 a quel numero
	//il fattoriale di 0 è 1   0! -> 1
	//il fattoriale di 1 è 1   1! -> 1
	//non esiste fattoriale di numeri negativi
	public int fattoriale(int a)
	{
		int res = 1;

		for(int i=2;i<=a;i++)
			res*=i;

		return res;
	}

	public String presentazione()
	{
		return 	"C'era una volta una calcolatrice chiamata Calcolatorix, non una calcolatrice comune: era la più rapida e precisa di tutte. " +
				"In una città dove i conti non tornavano mai e la confusione regnava, Calcolatorix si fece avanti per salvare la giornata. " +
				"Con un semplice click, risolveva divisioni impossibili, calcolava radici quadrate e portava pace nelle menti dei matematici più disperati." +
				" Ogni problema risolto era come una medaglia guadagnata sul campo, e presto diventò l'eroe di ogni scrivania. " +
				"Calcolatorix non cercava gloria, ma solo una vita senza errori decimali e risultati perfetti.";
	}
}
