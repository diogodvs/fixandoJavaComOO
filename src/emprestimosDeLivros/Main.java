package emprestimosDeLivros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Emprestimo emprestimo = new Emprestimo();

		Livro livro = new Livro();

		Scanner ler = new Scanner(System.in);

		int opcao;

		System.out.println(" --- Biblioteca StackX --- ");

		do {
			System.out.println("     ---- Opções: ---- ");
			System.out.println(" [ 1 - Ver Lista de Livros ]");
			System.out.println(" [ 2 - Emprestar Livro ]");
			System.out.println(" [ 3 - Devolver Livro ");
			System.out.println(" [ 4 - Encerrar Sessão ] ");
			opcao = ler.nextInt();

			switch(opcao) {
			case 1: 
				emprestimo.verListadeLivros(livro);break;
			
			case 2: 
				emprestimo.emprestarLivro(livro);break;
			
			case 3: 
				emprestimo.devolverLivro(livro);break;
			
			case 4: 
				System.out.println("Sessão Encerrada!!");
				
			default: 
				System.out.println("Opção Invalida!!");
			}
			
		} while (opcao != 4);
	ler.close();}

}
