package br.com.gerenciador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manipulador {

	static public void escrever(Filme filme) throws IOException {
		FileWriter fw = new FileWriter("Filmes.csv", true);
		fw.append(filme.retornaTudo());
		fw.flush();
		fw.close();
	}

	static public List<Filme> ler() throws IOException {
		FileReader fr = new FileReader("Filmes.csv");
		BufferedReader br = new BufferedReader(fr);

		List<Filme> filmes = new ArrayList<>();
		ArrayList<Filme> listaFilmes = new ArrayList<>(filmes);

		String linha;
		while ((linha = br.readLine()) != null) {
			String[] linhasFilme = linha.split(",");
			Filme f = new Filme(linhasFilme[0], LocalDate.parse(linhasFilme[1]), linhasFilme[2], linhasFilme[3]);
			filmes.add(f);
		}
		br.close();
		return filmes;

	}
}
