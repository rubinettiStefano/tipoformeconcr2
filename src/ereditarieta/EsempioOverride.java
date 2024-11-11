package ereditarieta;

public class EsempioOverride
{

	public static void main(String[] args)
	{
		Student s = new Student();
		s.setName("Jose");
		s.setSurname("Rubinetti");
		s.setSection("JAITA111");


		Object o =s;
		Person p = s;


		Person p2 = new Student();
		p2.setName("Jose");
		p2.setSurname("Rubinetti");

		if(p2 instanceof Student)
		{
			Student s2 = (Student) p2;
		}
		System.out.println(p);
		System.out.println(p2);

	}
}
