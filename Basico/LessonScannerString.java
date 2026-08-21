import java.util.Scanner;

// 11:15 21/08/2026
// Sem IDE específica
// Impressão de um texto por meio de interação do usuário pelo teclado
// Versão 1.0
// Autor: DermRach (Rafael)
// Website: mundopauta.com.br

public class LessonScannerString
{
	public static void main (String[]args)
	{
		Scanner getInputText = new Scanner(System.in);
		System.out.println("Digite um texto.");
		String contentText = getInputText.nextLine();

		System.out.println(contentText);
	}
}
