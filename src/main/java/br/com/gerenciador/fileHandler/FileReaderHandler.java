package br.com.gerenciador.fileHandler;

import br.com.gerenciador.movie.Language;
import br.com.gerenciador.movie.Movie;
import br.com.gerenciador.screen.NavigateMenuScreens;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.time.LocalDate.parse;

public class FileReaderHandler {
    private static final ArrayList<Movie> movieArrayList = new ArrayList<>();

    private static void readFile() throws IOException {
        var fileReader = new FileReader("movie-database.csv");
        var bufferedReader = new BufferedReader(fileReader);

        var line = "";
        while ((line = bufferedReader.readLine()) != null) {
            var movieLine = line.split(",");
            movieArrayList.add(
                    new Movie(
                            movieLine[0],
                            movieLine[1],
                            parse(movieLine[2]),
                            movieLine[3],
                            Language.valueOf(movieLine[4])
                    ));
        }
        bufferedReader.close();
    }

    public static List<Movie> fetchAllMovies() throws IOException {
        readFile();
        for (Movie movie : movieArrayList) {
            System.out.println(movie);
        }
        return movieArrayList;
    }

    public static List<Movie> fetchByReleaseDate(Scanner scanner) throws IOException {
        readFile();
        System.out.println("Movie YEAR RELEASED: YYYY");
        var input = scanner.nextInt();
        var result = new ArrayList<Movie>();

        for (Movie movie : movieArrayList) {
            if (movie.releasedDate().getYear() == input) {
                result.add(movie);
            }
        }

        for (Movie movie : result) {
            System.out.println(movie);
        }

        return result;
    }

    public static List<Movie> fetchBySimilarProducersCompany(Scanner scanner) throws IOException {
        readFile();
        System.out.println("Movie Producer Company:");
        var input = scanner.nextLine();
        var result = new ArrayList<Movie>();
        for (Movie movie : movieArrayList) {
            if (movie.producer().contains(input)) {
                result.add(movie);
            }
        }
        for (Movie movie : result) {
            System.out.println(movie);
        }
        return result;
    }

    public static List<Movie> fetchSimilarNames(Scanner scanner) throws IOException {
        readFile();
        System.out.println("Movie Tittle: ");
        var input = scanner.nextLine();
        var result = new ArrayList<Movie>();
        for (Movie movie : movieArrayList) {
            if (movie.tittle().contains(input)) {
                result.add(movie);
            }
        }
        for (Movie movie : result) {
            System.out.println(movie);
        }
        return result;
    }

    public static List<Movie> fetchByLanguage(Scanner scanner) throws IOException {
        readFile();
        System.out.println(NavigateMenuScreens.fetchLanguage());;
        var input = scanner.nextInt();
        var result = new ArrayList<Movie>();

        for (Movie movie : movieArrayList) {
            if (movie.language().equals(Language.valueOf(input))) {
                result.add(movie);
            }
        }
        for (Movie movie : result) {
            System.out.println(movie);
        }
        return result;
    }
}
