
/*
	 * Uma empresa possui dez funcion�rios com as seguintes caracter�sticas: 
	 * 
	 * c�digo, 
	 * n�mero de horas trabalhadas no m�s, 
	 * turno de trabalho (M � matutino; V � vespertino; N � noturno), 
	 * categoria (O � oper�rio; ou G � gerente), valor da hora trabalhada.
	 *  Sabendo-se que essa empresa deseja informatizar sua folha de pagamento, 
	 *  fa�a um programa que:
	 * 
	 * a) Leia as informa��es dos funcion�rios, exceto o valor da hora trabalhada,
		n�o permitindo que sejam informa��es dos turnos e nem categorias inexistentes. 
		Trabalhe sempre com a digita��o de letras mai�sculas;
		
		b) Calcule o valor da hora trabalhada, conforme a tabela 1. 
		Adote o valor de R$450,00 para o sal�rio m�nimo;
		
		c) Calcule o sal�rio inicial dos funcion�rios com base no valor da hora trabalhada e no n�mero de horas trabalhadas; 
		
		d) Calcule o valor do aux�lio alimenta��o recebido pelo funcion�rio de acordo com seu sal�rio inicial, conforme a tabela 2;
	 * 
	 *  e) Mostre o c�digo, n�mero de horas trabalhadas, valor da hora trabalhada, sal�rio inicial, aux�lio alimenta��o e sal�rio final (sal�rio inicial + aux�lio alimenta��o).
	 * 
	 */

package holeriteApenasSubRotinas;
import java.util.Scanner;

public class Exercicio5SubRotinas {


		// essa � uma forma de declara��o de CONSTANTE em java
		public static final double SALARIO_MINIMO = 450.0;

		public static void main(String[] args) {
			int qtdeFuncionarios = 10;
			int[] codigos = new int[10];
			
			Scanner leitor = new Scanner(System.in);
			
			for (int id = 0; id < qtdeFuncionarios; id++) {
				processarFuncionario(codigos, leitor, id);
			}
		}

		private static void processarFuncionario(int[] codigos, Scanner leitor, int id) {
			codigos[id] = lerCodigo(leitor, codigos);
			
			int horasTrabalhasNoMes = lerHorasTrabalhadas(leitor);
			
			char turnoTrabalho = lerTurnoTrabalho(leitor);
			
			char categoria = lerCategoria(leitor);
			
			// b) Calcule o valor da hora trabalhada, conforme a tabela 1. 
			// Adote o valor de R$450,00 para o sal�rio m�nimo;
			double valorHoraTrabalhada = calcularHora(turnoTrabalho, categoria);
			
			// c) Calcule o sal�rio inicial dos funcion�rios com 
			// base no valor da hora trabalhada e no 
			// n�mero de horas trabalhadas;
			double salarioInicial = calcularSalarioInicial(horasTrabalhasNoMes, valorHoraTrabalhada);
			
			// d) Calcule o valor do aux�lio alimenta��o recebido pelo 
			// funcion�rio de acordo com seu sal�rio inicial, conforme a tabela 2;
			double auxilioAlimentacao = calcularAuxilioAlimentacao(salarioInicial);
			
			// e) Mostre o c�digo, n�mero de horas trabalhadas, 
			// valor da hora trabalhada, sal�rio inicial, 
			// aux�lio alimenta��o e sal�rio final 
			// (sal�rio inicial + aux�lio alimenta��o).
			System.out.println("\nC�digo: " + codigos[id]);
			System.out.println("# de horas trabalhadas: " + horasTrabalhasNoMes);
			System.out.println("Sal�rio inicial: " + salarioInicial);
			System.out.println("Auxilio alimentacao: " + auxilioAlimentacao);
			System.out.println("Sal�rio final: " + (salarioInicial + auxilioAlimentacao));
			System.out.println();
		}

		private static double calcularSalarioInicial(int horasTrabalhasNoMes, double valorHoraTrabalhada) {
			return valorHoraTrabalhada * horasTrabalhasNoMes;
		}

		private static int lerHorasTrabalhadas(Scanner leitor) {
			System.out.print("Quantidade de horas trabalhadas no m�s: ");
			int horasTrabalhasNoMes = leitor.nextInt();
			return horasTrabalhasNoMes;
		}

		private static int lerCodigo(Scanner leitor, int[] codigos) {
			int novoCodigo;
			
			do {
				System.out.print("Insira o c�digo do funcion�rio: ");
				novoCodigo = leitor.nextInt();
			} while(codigoJaExiste(codigos, novoCodigo));
			
			return novoCodigo;
			
		}

		private static boolean codigoJaExiste(int[] codigos, int novoCodigo) {
			boolean achou = false;
			
			for (int codigo : codigos) {
				if (codigo == novoCodigo) {
					achou = true;
					break;
				}
			}
			
			return achou;
		}

		private static double calcularAuxilioAlimentacao(double salarioInicial) {
			double auxilioAlimentacao;
			
			if (salarioInicial <= 300.00) {
				auxilioAlimentacao = salarioInicial * 0.2;
			} else if (salarioInicial > 300.00 && salarioInicial <= 600.00) {
				auxilioAlimentacao = salarioInicial * 0.15;
			} else {
				auxilioAlimentacao = salarioInicial * 0.05;
			}
			return auxilioAlimentacao;
		}

		private static double calcularHora(char turnoTrabalho, char categoria) {
			double valorHoraTrabalhada;
			
			if(categoria == 'G') {
				if (turnoTrabalho == 'N') {
					valorHoraTrabalhada = SALARIO_MINIMO * 0.18;
				} else {
					valorHoraTrabalhada = SALARIO_MINIMO * 0.15;
				}
			} else if (turnoTrabalho == 'N') {
				valorHoraTrabalhada = SALARIO_MINIMO * 0.13;
			} else {
				valorHoraTrabalhada = SALARIO_MINIMO * 0.10;
			}
			
			return valorHoraTrabalhada;
		}

		private static char lerCategoria(Scanner leitor) {
			char categoria = 'X';
			
			System.out.print("Categoria [O,G]: ");
			
			// n�o permitir que sejam informa��es de categorias inexistentes
			while(categoria != 'G' && categoria != 'O') {

				categoria = leitor.next().charAt(0);
				
				if (categoria != 'G' && categoria != 'O') {
					System.out.print("Categoria inv�lida, insira O ou G: ");
				}
			}
			
			return categoria;
		}

		private static char lerTurnoTrabalho(Scanner leitor) {
			
			char turnoTrabalho = 'X';
					
			System.out.print("Turno [M,V,N]: ");
			
			// n�o permitir que sejam informa��es de turnos inexistentes 
			while(turnoTrabalho != 'M' && turnoTrabalho != 'V' && turnoTrabalho != 'N') {

				turnoTrabalho = leitor.next().charAt(0);
				
				if (turnoTrabalho != 'M' && turnoTrabalho != 'V' && turnoTrabalho != 'N') {
					System.out.print("Turno inv�lido, insira M, V ou N: ");
				}
			}
			
			return turnoTrabalho;
		}

	}

