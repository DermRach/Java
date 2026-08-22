public class LessonConstructorArgs
{
	String name;
	int age;
	
	public Lesson(String tname, int tage)
	{
		name = tname;
		age = tage;
	}

	void showInformation()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public static void main (String[]args)
	{
		LessonConstructorArgs ln = new LessonConstructorArgs("DermRach", 30);
		ln.showInformation();
	}
}
