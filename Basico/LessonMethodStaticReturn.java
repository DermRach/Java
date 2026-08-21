import java.util.Scanner;

// 11:29 21/08/2026
// Sem IDE específica
// Método com retorno
// Versão 1.0
// Autor: DermRach (Rafael)
// Website: mundopauta.com.br

public class LessonMethodStaticReturn
{
	static int showSoma(int valueA, int valueB)
	{
		return valueA + valueB;
	}

	public static void main (String[]args)
	{
		int result = showSoma(5,6);
		System.out.println(result);
	}
}
