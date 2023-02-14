package application;

import java.util.Locale;
import java.util.Scanner;

public class Pesquisa {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		String empresa, addPergunta, pergunta1, pergunta2, pergunta3, pergunta4, pergunta5, pergunta6, pergunta7, pergunta8, pergunta9, pergunta10; 
		int numPergunta;
		
		numPergunta=1;
				
		System.out.println("Criação de quastionário com até 10 perguntas");
		System.out.println(" ");
		System.out.print("Digite o nome da empresa: ");
		empresa=sc.nextLine();
		System.out.println(" ");
		
		numPergunta=1;	
		
		System.out.printf("Digite a pergunta nº " +numPergunta);
		System.out.println(" ");
		System.out.print("Pergunta: ");
		pergunta1=sc.nextLine();
		System.out.println(" ");
		
		do {
		
		System.out.print("Deseja adicionar uma pergunta ao questionário? (Sim/Não): ");
		addPergunta=sc.nextLine();
		System.out.println(" ");
		
			if (addPergunta=="Sim") {
					numPergunta++;
					System.out.printf("Digite a pergunta nº " +numPergunta);
					System.out.println(" ");
					System.out.println("Pergunta: ");
					System.out.println(" ");
					pergunta2=sc.nextLine();			
		
				}
			
		
		}while (addPergunta!="Não");

		sc.close();	
		
}
}
