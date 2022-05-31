package holeriteComOO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		Funcionario func = new Funcionario();
		func.setTurnoDeTrabalho(lerTurnoTrabalho(leitor));
		func.setCategoria(lerCategoria(leitor));
		
		FolhaPagamento folha = new FolhaPagamento(func);
		folha.setNumerohorasTrabalhadas(lerHorasTrabalhadas(leitor));
		folha.calcularHora();
		folha.calcularSalarioInicial();
		folha.calcularAuxilioAlimentacao();
		folha.calcularSalarioFinal();
		folha.imprimirHolerite();
	}

	private static int lerCodigo(Scanner leitor, int[] codigos) {
		int novoCodigo;

		System.out.print("Insira o código do funcionário: ");
		return leitor.nextInt();
	}

	private static int lerHorasTrabalhadas(Scanner leitor) {
		System.out.print("Quantidade de horas trabalhadas no mês: ");
		int horasTrabalhasNoMes = leitor.nextInt();
		return horasTrabalhasNoMes;
	}

	private static char lerTurnoTrabalho(Scanner leitor) {

		char turnoTrabalho = 'X';

		System.out.print("Turno [M,V,N]: ");

		// não permitir que sejam informações de turnos inexistentes
		while (turnoTrabalho != 'M' && turnoTrabalho != 'V' && turnoTrabalho != 'N') {

			turnoTrabalho = leitor.next().charAt(0);

			if (turnoTrabalho != 'M' && turnoTrabalho != 'V' && turnoTrabalho != 'N') {
				System.out.print("Turno inválido, insira M, V ou N: ");
			}
		}

		return turnoTrabalho;
	}

	private static char lerCategoria(Scanner leitor) {
		char categoria = 'X';

		System.out.print("Categoria [O,G]: ");

		// não permitir que sejam informações de categorias inexistentes
		while (categoria != 'G' && categoria != 'O') {

			categoria = leitor.next().charAt(0);

			if (categoria != 'G' && categoria != 'O') {
				System.out.print("Categoria inválida, insira O ou G: ");
			}
		}

		return categoria;
	}
}
