package classePessoa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Digite seu nome: ");
		pessoa.setNome(dados.nextLine());
		
		System.out.println("Digite sua idade: ");
		pessoa.setIdade(dados.nextInt());

		System.out.println("Insira sua altura em metros: ");
		pessoa.setAltura(dados.nextDouble());

		System.out.println("Fez Aniversario?? [s / n] ");
		char confir = dados.next().charAt(0);
		
		if (confir == 's') {
			pessoa.fazerAniversario();
			
		}
		
		System.out.println("Ola, " + pessoa.getNome());
		System.out.println("Sua idade é: " + pessoa.getIdade() + " anos.");
		System.out.println("Sua altura é: " + pessoa.getAltura());
		
	}

	
	
}
