package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Perguntas;
import entities2.Respostas;

public class Pesquisa {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		String empresa;
		int numPerg;
		
		System.out.println("- Criação de questionário -");
		System.out.println(" ");
		System.out.print("Digite o nome da empresa: ");
		empresa=sc.nextLine();
		System.out.println(" ");
		System.out.print("Digite a quantidade de perguntas do questionário: ");
		numPerg = sc.nextInt();
		System.out.println(" ");
		
		Perguntas[] vect = new Perguntas[numPerg];
		
		for (int i=0; i<numPerg; i++) {
			sc.nextLine();
			System.out.print("Digite a próxima pergunta do questionário: ");
			String perguntas = sc.nextLine();
			vect[i] = new Perguntas(perguntas);
			}
		
		System.out.println(" ");
		System.out.println("- Responda o questionário abaixo: -");
				
		Respostas[] vect1 = new Respostas[numPerg];
		
		for (int i=0; i<numPerg; i++) {
			sc.nextLine();
			System.out.print(vect[i].getPerguntas());
			System.out.println(" ");
			System.out.print("Digite sua resposta: ");
			String respostas = sc.nextLine();
			vect1[i] = new Respostas(respostas);
			}
		
	sc.close();	
}
}
