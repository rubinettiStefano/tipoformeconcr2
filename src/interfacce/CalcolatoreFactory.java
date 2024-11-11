package interfacce;

public class CalcolatoreFactory
{



	public static Calcolatore make()
	{
		double numeroRandomico = Math.random();

		if(numeroRandomico < 0.5)
		{
			System.out.println("Ho prodotto V1");
			return new CalcolatriceV1();
		}

		System.out.println("Ho prodotto V2");
		return new CalcolatriceV2();
	}
}
