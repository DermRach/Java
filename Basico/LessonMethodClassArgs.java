import java.util.Scanner;

// 11:26 21/08/2026
// Sem IDE específica
// Método sem retorno com argumentos e instância de objeto
// Versão 1.0
// Autor: DermRach (Rafael)
// Website: mundopauta.com.br

public class LessonMethodClassArgs
{
	void showSoma(int valueA, int valueB)
	{
		System.out.println(valueA + valueB);
	}

	public static void main (String[]args)
	{
		LessonMethodClassArgs ln = new LessonMethodClassArgs();
		ln.showSoma(20,30);
	}
}
