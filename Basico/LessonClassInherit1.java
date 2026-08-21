import java.util.Scanner;

// 11:46 21/08/2026
// Sem IDE específica
// Classe Pai, Filho, herança e mudança de atributos de classe e método.
// Versão 1.0
// Autor: DermRach (Rafael)
// Website: mundopauta.com.br

class MajorLesson
{
	String nameLesson;
	int editionLesson;
	boolean flagLesson;

	public MajorLesson()
	{
		nameLesson = "Lição sobre Classes e Heranças";
		editionLesson = 1;
		flagLesson = true;
	}

	void showInformationAboutClass()
	{
		System.out.println(nameLesson);
		System.out.println(editionLesson);
		System.out.println(flagLesson);
	}
}

public class LessonClassInherit1 extends MajorLesson
{
	

	public static void main (String[]args)
	{
		LessonClassInherit1 ln = new LessonClassInherit1();
		ln.showInformationAboutClass();

		// Mudança de atributos de classe Pai
		ln.nameLesson = "Classe Filho muda atributos de Classe pai";
		ln.editionLesson = 2;
		ln.flagLesson = false;

		ln.showInformationAboutClass();
	}
}
