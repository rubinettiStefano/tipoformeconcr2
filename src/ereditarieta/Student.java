package ereditarieta;

public class Student extends Person
{
	private String section;

	public String getSection()
	{
		return section;
	}

	public void setSection(String section)
	{
		this.section = section;
	}

	@Override
	public String toString()
	{
		return "Ciao sono studente "+name;
	}
}
