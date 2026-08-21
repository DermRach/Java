// 12:02 21/08/2026
// Sem IDE específica
// Uso do for para pecorrer um array [vetor] unidimensional e imprimir
// Versão 1.0
// Autor: DermRach (Rafael)
// Website: mundopauta.com.br


public class LessonForArray1
{
	static String[] nomes = {"SNES","N64","NES","MEGA DRIVE"};
	public static void main (String[]args)
	{
		for (int i =0; i < nomes.length; i++)
		{	
			System.out.println(i + " " + nomes[i]);
		}
	}
}
