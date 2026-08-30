import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// 11:29 30/08/2026
// Calculo do ano de nascimento usando o LocalDateTime
// Autor: DermRach (Rafael)
// Website: mundopauta.com.br


public class LessonYearBirth
{
	static int age = 33;
	public static void main(String[]args)
	{
		LocalDateTime data = LocalDateTime.now();
		DateTimeFormatter fdata = DateTimeFormatter.ofPattern("yyyy");
		int yearbirth = Integer.parseInt(data.format(fdata));
		System.out.println(yearbirth - age);
	}
}
