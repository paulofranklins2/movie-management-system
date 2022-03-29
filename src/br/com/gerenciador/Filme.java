package br.com.gerenciador;

import java.time.LocalDate;

public class Filme implements Comparable<Filme> {
	private String titulo;
	private LocalDate ano;
	private String produtora;
	private String idioma;

	public Filme(String nome, LocalDate integer, String produtora, String idioma) {
		this.titulo = nome;
		this.ano = integer;
		this.produtora = produtora;
		this.idioma = idioma;
	}

	public String retornaTudo() {
		return this.titulo + "," + this.ano + "," + this.produtora + "," + this.idioma + "\n";
	}
	
	public String getInformacoes() {
		return this.titulo + "," + this.ano + "," + this.produtora + "," + this.idioma;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public LocalDate getAno() {
		return this.ano;
	}

	public String getProdutora() {
		return this.produtora;
	}

	public String getIdioma() {
		return this.idioma;
	}

	@Override
	public int compareTo(Filme filme) {
		if (this.getAno() == filme.getAno()) {
			return 1;
		} else {
			return -1;
		}
	}

}
