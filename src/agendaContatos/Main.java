package agendaContatos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		Agenda ct = new Agenda();

		Imprimir imp = new Imprimir();

		int opcao;

		do {

			System.out.println("Escolha uma opção: [ 1 - add ctt ] [ 2 - buscar ctt ] [ 3 - excluir ctt ]"
					+ " [ 4 - mostrar agenda ] [ 5 - encerrar ] ");
			opcao = leitor.nextInt();

			if (opcao == 1) {
				ct.armazenaPessoa(null, 0, 0);

			} else if (opcao == 2) {
				imp.imprimiPessoa(ct, leitor);

			} else if (opcao == 3) {
				ct.removeContato(null);

			} else if (opcao == 4) {
				imp.imprimiAgenda(ct);

			} else if (opcao == 5) {
				System.out.println("Agenda fechada!!");

			} else if (opcao >= 6 && opcao <= 0) {
				System.out.println("Opção invalida!!");
			}
		} while (opcao != 5);

		leitor.close();
	}

}
