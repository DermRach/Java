import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 08:58 21/08/2026
// Sem IDE específica
// Leitura do arquivo e exposição na tela do console
// Versão 1.0
// Autor: DermRach (Rafael)
// Website: mundopauta.com.br

public class LessonReadFile
{
	public static void main (String[]args)
	{
		File file = new File("Devlog.txt");
		
		try (Scanner getInput = new Scanner(file))
		{
			String contentFile = getInput.nextLine();
			System.out.println("Conteúdo: " + contentFile);
		} catch (FileNotFoundException e)
		{
			System.out.println("Ocorreu um erro na leitura do arquivo " + file.getName());
			e.printStackTrace();
		}
	}
}
