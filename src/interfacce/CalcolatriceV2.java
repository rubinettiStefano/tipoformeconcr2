package interfacce;

public class CalcolatriceV2 implements Calcolatore
{
	@Override
	public double somma(double a, double b)
	{
		return b+a;
	}

	@Override
	public double sottrazione(double a, double b)
	{
		return a-b;
	}

	@Override
	public double moltiplicazione(double a, double b)
	{
		return b*a;
	}

	@Override
	public double divisione(double a, double b)
	{
		return a/b;
	}

	@Override
	public int fattoriale(int a)
	{
		if(a<0)
			throw new RuntimeException();
		if(a<=1)
			return 1;

		int res = 1;

		for(int i=2;i<=a;i++)
			res*=i;

		return res;
	}
}
