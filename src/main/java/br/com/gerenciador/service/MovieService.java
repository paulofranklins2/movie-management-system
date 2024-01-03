package br.com.gerenciador.service;

import br.com.gerenciador.movie.Language;
import br.com.gerenciador.movie.Movie;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.UUID;

import static br.com.gerenciador.fileHandler.FileWriterHandler.insertMovie;
import static java.time.LocalDate.parse;

public class MovieService {

    public static void newMovie(Scanner scanner) throws IOException {
        var tittleInput = getField(scanner, "Tittle");
        var releasedDate = getReleasedDate(scanner);
        var producerInput = getField(scanner, "Producer");
        var languageInput = getLanguageInput(scanner);

        insertMovie(
                new Movie(
                        UUID.randomUUID().toString(),
                        tittleInput,
                        releasedDate,
                        producerInput,
                        Language.valueOf(languageInput)
                ));
    }

    public static void editMovie(Scanner scanner) {
        System.out.println("Not yet implemented");
    }


    private static int getLanguageInput(Scanner scanner) {
        System.out.println("Movie Language");
        return scanner.nextInt();
    }

    private static String getField(Scanner scanner, String field) {
        String result;
        do {
            System.out.printf("Movie %s%n", field);
            result = scanner.nextLine().trim();
        } while (result.isBlank() && result.isEmpty());
        return result;
    }

    private static LocalDate getReleasedDate(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Released Date: YYYY-MM-DD");
                return parse(scanner.nextLine());
            } catch (DateTimeParseException ignored) {
            }
        }
    }
}
