import java.util.ArrayList;

public class Esempio1
{

	public static void main(String[] args)
	{
		//IL TIPO DI UNA VARIABILE viene detto TIPO FORMALE
		//definisce come Java vede l'oggetto in memoria
		//e quindi quali metodi e quali proprietà può richiamare

		//Il tipo di un oggetto in memoria viene detto TIPO CONCRETO
		//definisce cosa c'è veramente in memoria

		//Il tipo formale può cambiare con il casting
		//il tipo concreto è definito dal costruttore ed è immutabile
		Student s = new Student();
		s.setName("Christian");
		s.setSurname("Lasaponara");
		s.setSection("JAITA133");

		Object o = s;
		System.out.println(s);

		Student s2 = new Student();
		s2.setName("Fabio");
		s2.setSurname("Guga");
		s2.setSection("JAITA133");

		Student s3 = new Student();
		s3.setName("Francesca");
		s3.setSurname("Bianchi");
		s3.setSection("JAITA133");

		Student s4 = new Student();
		s4.setName("Claudia");
		s4.setSurname("Fioravanti");
		s4.setSection("JAITA133");

		Employee e = new Employee();
		e.setName("Mario");
		e.setSurname("Rossi");
		e.setSalary(5000);

		ArrayList<Person> cattivi = new ArrayList<>();//generalizzare, per mettere gli oggetti insieme
		cattivi.add(s);
		cattivi.add(s2);
		cattivi.add(s3);
		cattivi.add(s4);
		cattivi.add(e);

		for(Person p : cattivi)
		{
			if(p instanceof Student)//instanceof è un operatore booleano che restituisce true se il tipo
				//dell'oggetto a cui la variabile a sinistra fa riferimento è quello specificato a destra
			{
				Student pCastato = (Student)p;
				System.out.println("Ti tengo d'occhio " + pCastato.getName() +" della sezione "+pCastato.getSection());
			}

			if(p instanceof Employee)
			{
				Employee pCastato = (Employee)p;
				System.out.println(pCastato.getName()+" è fuori posto,ma guadagna ben "+pCastato.getSalary()+" al mese");
			}
		}

		ArrayList<Student> soloStudenti = new ArrayList<>();

		for(Person p : cattivi)
		{
			if(p instanceof Student)
				soloStudenti.add((Student)p);
		}

		Person 	christianComePersona 	= cattivi.get(0);
		Student christianComeStudente 	= (Student) cattivi.get(0);

//		christianComePersona.getSection(); NON FUNZIONERÀ
		christianComeStudente.getSection();

		//PRINCIPIO DI SOSTITUZIONE DI LISKOV
		//Un sottotipo deve sempre!!!1!1!!! essere sostituibile ad un suo supertipo


		System.out.println(s);
	}

	public static void stampaPerson(Person p)
	{
		System.out.println(p.getName()+" "+p.getSurname());
	}
}
