package holeriteComOO;

public class FolhaPagamento {

	// essa é uma forma de declaração de CONSTANTE em java
	public static final double SALARIO_MINIMO = 450.00;

	private Funcionario funcionario;
	private int numeroHorasTrabalhadas;
	private double salarioInicial;
	private double valorHoraTrabalhada;
	private double valorAuxilioAlimentacao;
	private double salarioFinal;

	public FolhaPagamento(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public int getNumerohorasTrabalhadas() {
		return numeroHorasTrabalhadas;
	}

	public void setNumerohorasTrabalhadas(int numerohorasTrabalhadas) {
		this.numeroHorasTrabalhadas = numerohorasTrabalhadas;
	}

	public double getSalarioInicial() {
		return salarioInicial;
	}

	public void setSalarioInicial(double salarioInicial) {
		this.salarioInicial = salarioInicial;
	}

	public double getValorHoraTrabalhada() {
		return valorHoraTrabalhada;
	}

	public void setValorHoraTrabalhada(double valorHoraTrabalhada) {
		this.valorHoraTrabalhada = valorHoraTrabalhada;
	}

	public double getValorAuxilioAlimentacao() {
		return valorAuxilioAlimentacao;
	}

	public void setValorAuxilioAlimentacao(double valorAuxilioAlimentacao) {
		this.valorAuxilioAlimentacao = valorAuxilioAlimentacao;
	}

	public double getSalarioFinal() {
		return salarioFinal;
	}

	public void setSalarioFinal(double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}

	public void calcularHora() {

		double valorHoraTrabalhada;

		if (funcionario.getCategoria() == 'G') {
			if (funcionario.getTurnoDeTrabalho() == 'N') {
				valorHoraTrabalhada = SALARIO_MINIMO * 0.18;
			} else {
				valorHoraTrabalhada = SALARIO_MINIMO * 0.15;
			}
		} else if (funcionario.getTurnoDeTrabalho() == 'N') {
			valorHoraTrabalhada = SALARIO_MINIMO * 0.13;
		} else {
			valorHoraTrabalhada = SALARIO_MINIMO * 0.10;
		}

		this.valorHoraTrabalhada = valorHoraTrabalhada;
	}

	public void calcularSalarioInicial() {
		this.salarioInicial = this.valorHoraTrabalhada * this.numeroHorasTrabalhadas;
	}

	public void calcularAuxilioAlimentacao() {

		if (this.salarioInicial <= 300.00) {
			this.valorAuxilioAlimentacao = this.salarioInicial * 0.2;
		} else if (salarioInicial > 300.00 && salarioInicial <= 600.00) {
			this.valorAuxilioAlimentacao = this.salarioInicial * 0.15;
		} else {
			this.valorAuxilioAlimentacao = this.salarioInicial * 0.05;
		}

	}

	public void calcularSalarioFinal() {
		
		this.salarioFinal = this.salarioInicial + this.valorAuxilioAlimentacao;
	}
	
	public void imprimirHolerite() {
		
		System.out.println();
		System.out.println(" --- Folha de Pagamento --- ");
		System.out.println("\nCódigo: " + funcionario.getCodigo() );
		System.out.println("# de horas trabalhadas: " + numeroHorasTrabalhadas );
		System.out.println("Salário inicial: " + salarioInicial);
		System.out.println("Auxilio alimentacao: " + valorAuxilioAlimentacao);
		System.out.println("Salário final: " + salarioFinal);
		System.out.println();
		
	}

}
