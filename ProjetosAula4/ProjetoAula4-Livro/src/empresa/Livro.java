package empresa;

public class Livro {
	//a palavra protect(distingue o tipo de visibilidade) faz com que as classes filhas(Herança) sejam capazes de enxergar os atributos
	protected String titulo;
	protected Autor autor;
	protected String genero;
	protected int edicao;
	public Livro(String titulo, Autor autor, String genero, int edicao) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.edicao = edicao;
	}
	
	public Livro() {
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	void info() {
		System.out.println("Título Livro: " +titulo);
		System.out.println("Gênero Livro: " +genero);
		System.out.println("Edição Livro: " +edicao);
		autor.info();
		
	}
}
