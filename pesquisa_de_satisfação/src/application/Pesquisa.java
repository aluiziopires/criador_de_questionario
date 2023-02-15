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
		
		for (int i=0; i<numPerg+1; i++) {
			System.out.print("Digite a próxima pergunta do questionário: ");
			System.out.println(" ");
			String perguntas = sc.nextLine();
			vect[i] = new Perguntas(perguntas);
			}
		
		for (int i=0; i<numPerg+1; i++) {
			System.out.print(vect[i].getPerguntas());
			System.out.println(" ");
			System.out.print("Digite sua resposta: ");
			System.out.println(" ");
			String respostas = sc.nextLine();
			vect[i] = new Respostas(respostas);
			
			}
		
	sc.close();	
}
}
