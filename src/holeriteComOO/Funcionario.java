package holeriteComOO;

public class Funcionario {

	private int codigo;
	private char categoria;
	private char turnoDeTrabalho;

	public Funcionario() {
		this.codigo = (int) (Math.random() * 100);

	}

	public String getCodigo() {
		return "FN-" + codigo;
	}

	public char getCategoria() {
		return categoria;
	}

	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}

	public char getTurnoDeTrabalho() {
		return turnoDeTrabalho;
	}

	public void setTurnoDeTrabalho(char turnoDeTrabalho) {
		 this.turnoDeTrabalho = turnoDeTrabalho;
	}

}
