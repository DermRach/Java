package org.example;

// Console use command javac -d . ExamplePackage.java
// Acesse o código fonte LessonPackage.java presente nesta pasta

// 01:29 22/08/2026
// Sem IDE específica
// Uso do pacote ExamplePackage
// Versão 1.0
// Autor: DermRach (Rafael)
// Website: mundopauta.com.br

public class ExamplePackage
{
	private String[] parametros = {"Args","Param", "Io"};

	public void show()
	{
		for (String p : parametros)
		{
			System.out.println(p);
		}
	}
	
}
