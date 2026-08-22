import java.util.Arrays;

// 01:54 22/08/2026
// Sem IDE específica
// Definição de um array unidimensional e operações como sort, length, acesso e mudança de valores
// Versão 1.0
// Autor: DermRach (Rafael)
// Website: mundopauta.com.br

public class LessonArrayMethods
{
	static String[] movies = {"Predator", "Alien", "Avatar","Poltergeist","Pilgrim"};

	public static void main (String[]args)
	{
		int size = movies.length;
		String resultArray = movies[1]; // Output Alien
		movies[2] = "total Recall"; // Change Avatar to Total Recall
		Arrays.sort(movies); // Organiza em ordem alfabética o vetor movies
		
		System.out.println("Array's Size: " + size);
		System.out.println("Position 1 is " + resultArray);
		
		// Note a ordem alfabética e a mudança de Avatar para Total Recall
		// Antes na posição 2, na ordem, Total Recall vira por último na lista
		for (String m : movies)
		{
			System.out.println(m);
		}
		
	}
}
