package emprestimosDeLivros;

import java.util.ArrayList;

public class Pessoa {

	
	private ArrayList<String> nome;
	private ArrayList<Integer> idade;

	public Pessoa() {
		super();

	}

	public ArrayList<String> getNome() {
		return nome;
	}

	public void setNome(ArrayList<String> nome) {
		this.nome = nome;
	}

	public ArrayList<Integer> getIdade() {
		return idade;
	}

	public void setIdade(ArrayList<Integer> idade) {
		this.idade = idade;
	}

}
