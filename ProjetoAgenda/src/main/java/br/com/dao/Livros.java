package br.com.dao;

public class Livros {
	
	private int id_livro;
	private String nome_livro;
	private String data_lancamento;
	private String autor_livro;
	private String editora_livro;
	
	
	public Livros(int id_livro, String nome_livro) {
		
	}
	public int getId_livro() {
		return id_livro;
	}
	public void setId_livro(int id_livro) {
		this.id_livro = id_livro;
	}
	public String getNome_livro() {
		return nome_livro;
	}
	public void setNome_livro(String nome_livro) {
		this.nome_livro = nome_livro;
	}
	public String getData_lancamento() {
		return data_lancamento;
	}
	public void setData_lancamento(String data_lancamento) {
		this.data_lancamento = data_lancamento;
	}
	public String getAutor_livro() {
		return autor_livro;
	}
	public void setAutor_livro(String autor_livro) {
		this.autor_livro = autor_livro;
	}
	public String getEditora_livro() {
		return editora_livro;
	}
	public void setEditora_livro(String editora_livro) {
		this.editora_livro = editora_livro;
	}
	@Override
	public String toString() {
		return "Livros [id_livro=" + id_livro + ", nome_livro=" + nome_livro + ", data_lancamento=" + data_lancamento
				+ ", autor_livro=" + autor_livro + ", editora_livro=" + editora_livro + "]";
	}
	
	
	

}
