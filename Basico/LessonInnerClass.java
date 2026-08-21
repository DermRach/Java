import java.util.Scanner;

// 11:57 21/08/2026
// Sem IDE específica
// Classe e subclasse (Sem herança)
// Versão 1.0
// Autor: DermRach (Rafael)
// Website: mundopauta.com.br

public class LessonInnerClass
{
	class SubLesson
	{
		String nameLessonNew;
		public SubLesson()
		{
			nameLessonNew = "Subclasse da classe Lesson";
		}

		void showInformationAboutSubClass()
		{
			System.out.println(nameLessonNew);
		}
	}

	public static void main (String[]args)
	{
  	LessonInnerClass ln = new LessonInnerClass(); // OUTER CLASSE E OBJETO

		// Linha importante OUTER_CLASSE.INNER_CLASSE  INNER_OBJETO = OUTER_OBJETO.NEW INNER_CLASSE()
		LessonInnerClass.SubLesson subLn = ln.new SubLesson();


		subLn.showInformationAboutSubClass();
		subLn.nameLessonNew = "Atributo de subclasse alterada";
		subLn.showInformationAboutSubClass();
	}
}
