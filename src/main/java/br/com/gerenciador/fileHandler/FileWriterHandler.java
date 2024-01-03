package br.com.gerenciador.fileHandler;

import br.com.gerenciador.movie.Movie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterHandler {
    public static void insertMovie(Movie movie) throws IOException {
        var file = new File("src/main/resources", "movie-database.csv");
        var fileWriter = new FileWriter(file, true);
        fileWriter.append(addMovieToFile(movie));
        fileWriter.flush();
        fileWriter.close();
    }

    private static String addMovieToFile(Movie movie) {
        return new StringBuilder()
                .append(movie.id())
                .append(",")
                .append(movie.tittle())
                .append(",")
                .append(movie.releasedDate())
                .append(",")
                .append(movie.producer())
                .append(",")
                .append(movie.language())
                .append("\n")
                .toString();
    }

}
