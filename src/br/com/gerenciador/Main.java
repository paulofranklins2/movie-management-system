package br.com.gerenciador;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.println(Telas.Principal());
		int input = scanner.nextInt();
		while (input != 0) {

			if (input == 1) {
				scanner.nextLine();
				cadastrarFilme();
			} else if (input == 2) {
				System.out.println(Telas.PesquisarFilmes());
				int newInput = scanner.nextInt();
				if (newInput == 1) {
					filtrarPorNome();
				} else if (newInput == 2) {
					filtrarPorAno();
				} else if (newInput == 3) {
					filtrarPorProdutora();
				} else if (newInput == 4) {
					filtrarPorIdioma();
				} else {
					System.out.println(Telas.Principal());
				}
			}
			System.out.println(Telas.Principal());
			input = scanner.nextInt();
		}
		System.out.println("PROGRAMA FINALIZADO");
	}

	public static void cadastrarFilme() throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.print("nome");
		String nome = scanner.nextLine();
		System.out.println("Data Ano-Mes-Dia");
		LocalDate localDate;
		while (true) {
			try {
				String data = scanner.next();
				localDate = LocalDate.parse(data);
				break;

			} catch (DateTimeParseException ex) {
				System.out.println("Ano-Mes-Dia");
			}
		}
		scanner.nextLine();
		System.out.print("produtora");
		String produtora = scanner.nextLine();
		System.out.print(Telas.idiomas());

		int idioma = scanner.nextInt();
		Idioma convertIdioma = null;
		while (idioma < 1 || idioma > 3) {
			System.out.println("Idioma Indisponivel");
			idioma = scanner.nextInt();
		}
		if (idioma == 1) {
			convertIdioma = Idioma.PORTUGUES;
		}
		if (idioma == 2) {
			convertIdioma = Idioma.INGLES;
		}
		if (idioma == 3) {
			convertIdioma = Idioma.ESPANHOL;
		}
		Filme f = new Filme(nome, localDate, produtora, convertIdioma.name());
		Manipulador.escrever(f);
	}

	public static void filtrarPorNome() throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um nome");
		String pNome = scanner.nextLine();
		List<Filme> porNome = Manipulador.ler();
		for (Filme filme : porNome) {
			if (filme.getTitulo().toLowerCase().contains(pNome.toLowerCase())) {
				System.out.println(filme.getInformacoes());
			}
		}

	}

	public static void filtrarPorAno() throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um ano");
		CharSequence pAno = scanner.next();
		List<Filme> porAno = Manipulador.ler();
		for (Filme filme : porAno) {
			if (filme.retornaTudo().contains(pAno)) {
				System.out.println(filme.getInformacoes());
			}
		}
	}

	public static void filtrarPorProdutora() throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um nome");
		String pNome = scanner.nextLine();
		List<Filme> porNome = Manipulador.ler();
		for (Filme filme : porNome) {
			if (filme.getProdutora().toLowerCase().contains(pNome.toLowerCase())) {
				System.out.println(filme.getInformacoes());
			}
		}
	}

	public static void filtrarPorIdioma() throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um nome");
		String pNome = scanner.nextLine();
		List<Filme> porNome = Manipulador.ler();
		for (Filme filme : porNome) {
			if (filme.getIdioma().toLowerCase().contains(pNome.toLowerCase())) {
				System.out.println(filme.getInformacoes());
			}
		}
	}
}
