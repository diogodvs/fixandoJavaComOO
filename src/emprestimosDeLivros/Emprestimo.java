package emprestimosDeLivros;

public class Emprestimo extends Livro {

	public Emprestimo() {
		super();

	}

	public void emprestarLivro(Livro livro) {

		char repetir = 's';
		String nomeLivro;
		boolean ver;

		do {
			System.out.println("Qual Livro deseja emprestar??");
			nomeLivro = dados.next();

			ver = livro.getListaLivros().contains(nomeLivro);

			if (ver == false) {
				System.out.println("Livro nao consta na nossa Lista!!");
				System.out.println("Deseja emprestar outro livro?? [ s / n ]");
				char confirmar = dados.next().charAt(0);

				if (confirmar == 'n') {
					System.out.println("Obrigado por usar nosso Sistema!");
					repetir = 'n';
				}
				
			} else {
				repetir = 's';
			}

		} while (repetir != 's');

		while (repetir == 's') {

			int index = livro.getListaLivros().indexOf(nomeLivro);

			if (livro.getSituacao().get(index) == "Disponivel") {
				System.out.println("Livro disponivel para emprestimo!!");
				System.out.println("Deseja realmente emprestar este livro? [ s / n ]");

				char confirmar = dados.next().charAt(0);

				if (confirmar == 's') {
					livro.getSituacao().set(index, "Emprestado");
					repetir = 'n';
				}

			} else {
				System.out.println("Livro Indisponivel!!");
				System.out.println("Deseja escolher outro? [ s / n ]");
				char confirmar = dados.next().charAt(0);

				if (confirmar == 'n') {
					System.out.println("Obrigado por usar nosso Sistema!");
					repetir = 'n';
				}
			}
		}
	}

	public void devolverLivro(Livro livro) {

		char repetir = 's';
		String nomeLivro;
		boolean ver;

		do {
			System.out.println("Qual Livro deseja devolver??");
			nomeLivro = dados.next();

			ver = livro.getListaLivros().contains(nomeLivro);

			if (ver == false) {
				System.out.println("Livro nao consta na nossa Lista!!");
				System.out.println("Deseja devolver outro livro?? [ s / n ]");
				char confirmar = dados.next().charAt(0);

				if (confirmar == 'n') {
					System.out.println("Obrigado por usar nosso Sistema!");
					repetir = 'n';
				}
			}  else {
				repetir = 's';
			}

		} while (repetir != 's');

		while (repetir == 's') {

			int index = livro.getListaLivros().indexOf(nomeLivro);

			if (livro.getSituacao().get(index) == "Emprestado") {
				System.out.println("Confirmar devolução do livro? [ s / n ]");
				char confirmar = dados.next().charAt(0);

				if (confirmar == 's') {
					livro.getSituacao().set(index, "Disponivel");
					repetir = 'n';
				} else if (confirmar == 'n') {
					System.out.println("Obrigado por usar nosso sistema!!");
					repetir = 'n';
				}

			} else {
				System.out.println("Esse livro ja se encontra em nosso estoque!!");
				repetir = 'n';
			}
		}
	}

	public void verListadeLivros(Livro livro) {
		System.out.println();
		System.out.println(" --- Lista de Livros ---");
		for (int i = 0; i < livro.getListaLivros().size(); i++) {
			System.out
					.print("Nome: " + livro.getListaLivros().get(i) + " contem: " + livro.getQuantidadePaginas().get(i)
							+ " paginas, " + "Situação: " + livro.getSituacao().get(i) + "\n");

		}
		System.out.println();
	}
}
