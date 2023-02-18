package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Perguntas;
import entities2.Respostas;

public class Pesquisa {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		String empresa, nome, cidade, telefone;
		int numPerg, idade;
		
		System.out.println("Crie seu questionário e solicite as respostas do entrevistado.");
		System.out.println(" ");
		System.out.print("Digite o nome da empresa: ");
		empresa=sc.nextLine();
		System.out.println(" ");
		System.out.println("- Criação de questionário -");
		System.out.println(" ");
		System.out.println("Já existem perguntas predefinidas no questionário: Nome, Idade, Cidade e Telefone.");
		System.out.println("Defina as perguntas personalizdas para o seu questionário.");
		System.out.println(" ");
		System.out.println("Pressione ENTER para iniciar.");
		sc.nextLine();
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
		System.out.println("Pressione ENTER para responder o questionário.");
		sc.nextLine();
		System.out.println(" ");
		System.out.println("- Responda o questionário abaixo: -");
		System.out.println(" ");
		
		System.out.print("Nome: ");
		nome=sc.nextLine();
		System.out.println(" ");
		System.out.print("Idade: ");
		idade=sc.nextInt();
		System.out.println(" ");
		sc.nextLine();
		System.out.print("Cidade: ");
		cidade=sc.nextLine();
		System.out.println(" ");
		System.out.print("Telefone com DDD: ");
		telefone=sc.nextLine();
		System.out.println(" ");
		
		System.out.println("Pressione ENTER para continuar o questionário.");
		
		Respostas[] vect1 = new Respostas[numPerg];
		
		for (int i=0; i<numPerg; i++) {
			sc.nextLine();
			System.out.print(vect[i].getPerguntas());
			System.out.println(" ");
			System.out.print("Digite sua resposta: ");
			String respostas = sc.nextLine();
			vect1[i] = new Respostas(respostas);
			}
		
		System.out.println(" ");
		System.out.println("- Questionário respondido -");
		System.out.println(" ");
		System.out.printf("Empresa solicitante: " +empresa); 
		System.out.println(" ");
		System.out.printf("Entrevistado: " +nome);
		System.out.println(" ");
		System.out.printf("Idade: " +idade);
		System.out.println(" ");
		System.out.printf("Cidade: " +cidade);
		System.out.println(" ");
		System.out.printf("Telefone: " +telefone);
		System.out.println(" ");
		
		for (int i=0; i<numPerg; i++) {
			System.out.print(vect[i].getPerguntas()+" ");
			System.out.print(vect1[i].getRespostas());
			}
			
	sc.close();	
}
}
