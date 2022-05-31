package agendaContatos;

import java.util.Scanner;

public class Imprimir extends Agenda{

	public void imprimiPessoa(Agenda agenda, Scanner dados) {
		
		boolean verificar;

		System.out.println();
		System.out.println("Contatos");
		System.out.println(agenda.getNome());
		System.out.println("Escolha o contato que deseja buscar: ");
		String nome = dados.next();

		verificar = agenda.getNome().contains(nome);

		int index = agenda.getNome().indexOf(nome);

		if (verificar == true) {
			System.out.println();
			System.out.println("contato na posição " + index + " da agenda.");
			System.out.println("O nome escolhido foi: " + nome);
			System.out.println("Idade: " + agenda.getIdade().get(index));
			System.out.println("Altura: " + agenda.getAltura().get(index));

		} else {
			System.out.println("Contato não encontrado!!");
		}
	}
	public void imprimiAgenda(Agenda agenda) {

		for (int i = 0; i < agenda.getNome().size(); i++) {

			System.out.println();
			System.out.println("contato na posição " + i + " da agenda.");
			System.out.println("nome: " + agenda.getNome().get(i));
			System.out.println("nome: " + agenda.getIdade().get(i));
			System.out.println("nome: " + agenda.getAltura().get(i));
			System.out.println();
			System.out.println(" - - - - - - - - - - - - - - -");

		}
	}
}
