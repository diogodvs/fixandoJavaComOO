package emprestimosDeLivros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livro {

	private List<String> listaLivros = new ArrayList<String>();
	private List<Integer> quantidadePaginas = new ArrayList<Integer>();
	private String nomeLivro;
	private List<String> situacao = new ArrayList<String>();
	Scanner dados;

	public Livro() {
		super();
		setListaLivros(null);
		setQuantidadePaginas(null);
		setSituacao(null);	
		this.dados = new Scanner(System.in);
	}

	public List<String> getSituacao() {
		return situacao;
	}

	public void setSituacao(List<String> situacao) {

		for (int i = 0; i < getListaLivros().size(); i++) {
			this.situacao.add(i, "Disponivel");
		}
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public void setListaLivros(List<String> listaLivros) {
		this.listaLivros.add(0, "Livro1");
		this.listaLivros.add(1, "Livro2");
		this.listaLivros.add(2, "Livro3");
		this.listaLivros.add(3, "Livro4");
		this.listaLivros.add(4, "Livro5");
		this.listaLivros.add(5, "Livro6");
		this.listaLivros.add(6, "Livro7");
		this.listaLivros.add(7, "Livro8");
		this.listaLivros.add(8, "Livro9");
		this.listaLivros.add(9, "Livro10");
	}

	public void setQuantidadePaginas(List<Integer> quantidadePaginas) {
		this.quantidadePaginas.add(0, 200);
		this.quantidadePaginas.add(1, 300);
		this.quantidadePaginas.add(2, 400);
		this.quantidadePaginas.add(3, 250);
		this.quantidadePaginas.add(4, 270);
		this.quantidadePaginas.add(5, 290);
		this.quantidadePaginas.add(6, 220);
		this.quantidadePaginas.add(7, 245);
		this.quantidadePaginas.add(8, 376);
		this.quantidadePaginas.add(9, 456);

	}

	public List<String> getListaLivros() {
		return listaLivros;
	}

	public List<Integer> getQuantidadePaginas() {
		return quantidadePaginas;
	}

}
