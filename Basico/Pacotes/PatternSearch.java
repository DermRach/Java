package com.dermrach;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

// 07:57 28/08/2026
// Sem IDE específica
// Uso do pacote para Regex no programa LessonRegex
// Versão 1.0
// Autor: DermRach (Rafael)
// Website: mundopauta.com.br

public class PatternSearch
{
	private String foundword;
	private boolean flagfound;
	private String sentence;
	private Matcher matcher;
	private Pattern pattern;

	public PatternSearch(String word)
	{
		sentence = "Repository called DermRach with Java's Codes";
		foundword = word;
		pattern = Pattern.compile(foundword);
		matcher = pattern.matcher(sentence);
		flagfound = matcher.find();
		
		if (flagfound)
		{
			System.out.println("Found");
		} else
		{
			System.out.println("Can't found");
		}
	}

	void detectFound()
	{
		if (flagfound)
		{
			System.out.println("Found");
		} else
		{
			System.out.println("Can't found");
		}
	}
		

	public PatternSearch()
	{
		sentence = "Repository called DermRach with Java's Codes";
		foundword = "DermRach";
		pattern = Pattern.compile(foundword);
		matcher = pattern.matcher(sentence);
		flagfound = matcher.find();
		detectFound();
	}
	
}
