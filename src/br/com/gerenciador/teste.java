package br.com.gerenciador;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
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
//		System.out.println(localDate);
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
//		System.out.println(formatter.format(localDate));
	}

}
