package br.com.gerenciador.movie;


import java.time.LocalDate;

public record Movie(
        String id,
        String tittle,
        LocalDate releasedDate,
        String producer,
        Language language
) {
}
