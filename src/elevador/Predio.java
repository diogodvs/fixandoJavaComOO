package elevador;

import java.util.Scanner;

public class Predio {

	public static void main(String[] args) {

		Elevador elevador = new Elevador();

		Scanner leitor = new Scanner(System.in);

		int opcao;
		elevador.inicializa();

		do {
			System.out.println("Escolha uma opção: [1 - Entrar] [ 2 - sair] [ 3 - subir] [ 4 - descer] [ 5 - desligar] ");
	
			opcao = leitor.nextInt();

			if (opcao == 1) {
				elevador.entra();

			} else if (opcao == 2) {
				elevador.sai();

			} else if (opcao == 3) {
				elevador.sobe();

			} else if (opcao == 4) {
				elevador.desce();

			} else if (opcao == 5) {
				System.out.println("Elevador Desligado!!");
			
			} else {
				System.out.println("Opção Inexistente!!");
			}

		} while (opcao != 5);

	leitor.close();}

}
