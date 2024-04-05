package daniel.paiva.springmvc.models;

public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;

	public Livro(String novoTitulo, String novoAutor, int novoAnoPublicacao) {
		titulo = novoTitulo;
		autor = novoAutor;
		anoPublicacao = novoAnoPublicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}
