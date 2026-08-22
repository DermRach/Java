// 01:43 22/08/2026
// Sem IDE específica
// Definição de variáveis e constantes
// Versão 1.0
// Autor: DermRach (Rafael)
// Website: mundopauta.com.br

public class LessonFinalVariable
{
	// PI é constante não pode ser alterado
	final float PI = 3.141519f;

	// Result e coeficient são variáveis
	float result, coeficient;

	public LessonFinalVariable()
	{
		result = 0.0f;
		coeficient = 1.5f;
	}

	void showInformation()
	{
		result = PI * coeficient;
		System.out.println(result);
	}

	public static void main (String[]args)
	{
	  LessonFinalVariable ln = new LessonFinalVariable();
		ln.showInformation();
	}
}
