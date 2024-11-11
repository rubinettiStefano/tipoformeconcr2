package interfacce;

import java.util.Scanner;

public class FintoMain
{

	static Scanner sc = new Scanner(System.in);
	static Calcolatore c = new CalcolatriceV2();

	public static void main(String[] args)
	{
		String cmd= "";

		do
		{
			System.out.println("Inserisci operazione da svolgere:");
			System.out.println("A per addizione");
			System.out.println("S per sottrazione");
			System.out.println("M per moltiplicazione");
			System.out.println("D per divisione");
			System.out.println("F per fattoriale");
			System.out.println("quit per uscire");

			cmd = sc.nextLine().toLowerCase();

			switch(cmd)
			{
				case "a":
					faiSomma();
				break;
				case "s":
					faiSottrazione();
				break;
				case "m":
					faiMoltiplicazione();
				break;
				case "d":
					faiDivisione();
				break;
				case "f":
					faiFattoriale();
				break;
				case "quit":
					System.out.println("CIAO CIAO");;
				break;
				default:
					System.out.println("DAMMI COMANDO GIUSTO, MANNAGGINA");
			}

		}while(!cmd.equals("quit"));

	}

	private static void faiSomma()
	{
		System.out.println("Dammi primo numero");
		double primo = Double.parseDouble(sc.nextLine());
		System.out.println("Dammi secondo numero");
		double secondo = Double.parseDouble(sc.nextLine());

		System.out.println("Il risultato è "+c.somma(primo,secondo));
	}

	private static void faiSottrazione()
	{
		System.out.println("\nDammi primo numero");
		double primo = Double.parseDouble(sc.nextLine());
		System.out.println("Dammi secondo numero");
		double secondo = Double.parseDouble(sc.nextLine());

		System.out.println("Il risultato è "+c.sottrazione(primo,secondo)+"\n");
	}

	private static void faiMoltiplicazione()
	{
		System.out.println("Dammi primo numero");
		double primo = Double.parseDouble(sc.nextLine());
		System.out.println("Dammi secondo numero");
		double secondo = Double.parseDouble(sc.nextLine());

		System.out.println("Il risultato è " + c.moltiplicazione(primo, secondo));
	}

	private static void faiDivisione()
	{
		System.out.println("Dammi primo numero");
		double primo = Double.parseDouble(sc.nextLine());
		System.out.println("Dammi secondo numero");
		double secondo = Double.parseDouble(sc.nextLine());

		System.out.println("Il risultato è "+c.divisione(primo,secondo));
	}

	private static void faiFattoriale()
	{
		System.out.println("Dammi  numero");
		int primo = Integer.parseInt(sc.nextLine());

		System.out.println("Il risultato è "+c.fattoriale(primo));
	}
}
