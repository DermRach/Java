import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// 08:51 21/08/2026
// Sem IDE específica
// Registro de informação textual em arquivo
// Versão 1.0
// Autor: DermRach (Rafael)
// Website: mundopauta.com.br

public class LessonFileWrite
{
	public static void main (String[]args)
	{
		File file = new File("Devlog.txt");
		try 
		{
			FileWriter fw = new FileWriter("Devlog.txt");
			fw.write("Registrando informação em um arquivo");
			fw.close();
			System.out.println("O arquivo " + file.getName() + " foi atualizado com sucesso.");
		} catch (IOException e)
		{
			System.out.println("O arquivo não pode ser gravado por algum motivo.");
			e.printStackTrace();
		}
	}
}
