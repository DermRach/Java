import java.util.ArrayList;
import java.util.Collections;

// 18:05 02/09/2026
/* Conferir, a partir das notas de uma turma, quais alunos foram aprovados, ficaram em recuperação ou foram reprovados.*/
// Autor: DermRach (Rafael)
// Website: MundoPauta.com.br
// Git-hub: https://github.com/DermRach

public class LessonStudentGrade
{
	static ArrayList<Integer> notas = new ArrayList<Integer>();
	static int qtdPassed, qtdNotPassed, qtdRecovery;

	public LessonStudentGrade()
	{
		notas.add(75);
		notas.add(100);
		notas.add(35);
		notas.add(50);
		notas.add(90);
		notas.add(65);
		notas.add(0);
		notas.add(60);
		notas.add(30);
		notas.add(95);
		qtdPassed = 0;
		qtdNotPassed = 0;
		qtdRecovery = 0;
		Collections.sort(notas);
	}

	static void verifySituation()
	{
		for (int i = 0; i < notas.size(); i ++)
		{
			if (notas.get(i) >= 70)
			{
				System.out.print("Grade " + notas.get(i));
				System.out.println("  Situation: Passed");	
				qtdPassed++;
			} else if (notas.get(i) < 70 && notas.get(i) >= 50)
			{
				System.out.print("Grade " + notas.get(i));
				System.out.println("  Situation: Recovery");
				qtdRecovery++;
			} else if (notas.get(i) < 50)
			{
				System.out.print("Grade " + notas.get(i));
				System.out.println("  Situation: Not Passed");
				qtdNotPassed++;
			}
		}
	}

	public static void main (String[]args)
	{
		LessonStudentGrade ln = new LessonStudentGrade();
		System.out.println("### Student Grade System ###");
		ln.verifySituation();
		System.out.println("### Stats of Situation ###");
		System.out.println("Quantity Passed: " + ln.qtdPassed);
		System.out.println("Quantity Not Passed: " + ln.qtdNotPassed);
		System.out.println("Quantity Recovery: " + ln.qtdRecovery);
	}
}
