package interfacce;

//Definirà solo QUALI SERVIZI qualcuno dovrà offrire, non COME
public interface Calcolatore
{
	//Metodi ASTRATTI
	//metodo con solo la FIRMA
	public abstract double somma(double a,double b);
	public abstract double sottrazione(double a,double b);
	public abstract double moltiplicazione(double a,double b);
	public abstract double divisione(double a,double b);
	public abstract int fattoriale(int a);
}
