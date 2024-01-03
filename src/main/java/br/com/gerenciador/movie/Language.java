package br.com.gerenciador.movie;

import lombok.Getter;

@Getter
public enum Language {

    PORTUGUESE(1),
    ENGLISH(2),
    SPANISH(3),
    UNKNOWN(Integer.MAX_VALUE);


    private final int id;

    Language(int id) {
        this.id = id;
    }

    public static Language valueOf(int id) {
        for (Language language : values()) {
            if (language.id == id) {
                return language;
            }
        }
        return UNKNOWN;
    }
}
