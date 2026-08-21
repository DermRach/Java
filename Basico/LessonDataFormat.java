import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// 09:21 21/08/2026
// Sem IDE específica
// Data atual e formatação
// Versão 1.0
// Autor: DermRach (Rafael)
// Website: mundopauta.com.br

public class LessonDataFormat
{
	public static void main (String[]args)
	{
		LocalDateTime data = LocalDateTime.now();
		DateTimeFormatter dataPattern = DateTimeFormatter.ofPattern("E, dd/MM/yyyy :: hh:mm");
		String finalFormat = data.format(dataPattern);
		System.out.println("Data\\Hora: " + finalFormat);
	}
}
