package agendaContatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

	private ArrayList<String> nome;
	private ArrayList<Integer> idade;
	private ArrayList<Float> altura;
	private Scanner dados;

	public Agenda() {
		super();
		this.dados = new Scanner(System.in);
		this.nome = new ArrayList<String>();
		this.idade = new ArrayList<Integer>();
		this.altura = new ArrayList<Float>();

	}

	public List<String> getNome() {
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

	public ArrayList<Float> getAltura() {
		return altura;
	}

	public void setAltura(ArrayList<Float> altura) {
		this.altura = altura;
	}

	public void armazenaPessoa(String nome, int idade, float altura) {

		
		armazenaNome(nome);

		armazenaIdade(idade);

		armazenaAltura(altura);
		System.out.println();

	}

	public void armazenaNome(String nome) {
		
		System.out.println();
		System.out.println("Insira o nome que deseja salvar: ");
		nome = dados.next();

		this.nome.add(0, nome);
	}

	public void armazenaIdade(int idade) {

		System.out.println("Insira a Idade: ");
		idade = dados.nextInt();

		this.idade.add(0, idade);
	}

	public void armazenaAltura(float altura) {

		System.out.println("Insira a altura: ");
		altura = dados.nextFloat();

		this.altura.add(0, altura);
	}

	public void removeContato(String nome) {

		char verificar;

		System.out.println();
		System.out.println("Contatos");
		System.out.println(this.getNome());
		System.out.println("Escolha o nome que deseja excluir: ");
		nome = dados.next();

		int index = this.nome.indexOf(nome);

		System.out.println("O nome escolhido foi: " + nome);
		System.out.println("Tem certeza que deseja excluir? [ s / n ]");

		do {
			verificar = dados.next().charAt(0);

			if (verificar != 's' && verificar != 'n') {
				System.out.println("Por favor insira [ s / n ].");
			}

		} while (verificar != 's' && verificar != 'n');

		if (verificar == 's') {
			this.nome.remove(index);
			this.idade.remove(index);
			this.altura.remove(index);

			System.out.println("Contato Excluido!!");
		}
	}
}
