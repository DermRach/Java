// 01:29 22/08/2026
// Sem IDE específica
// Definição de constructor com argumentos
// Versão 1.0
// Autor: DermRach (Rafael)
// Website: mundopauta.com.br


public class LessonConstructorArgs
{
	String name;
	int age;
	
	public LessonConstructorArgs(String tname, int tage)
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
