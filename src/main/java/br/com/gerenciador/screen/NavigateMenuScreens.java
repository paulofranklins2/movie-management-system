package br.com.gerenciador.screen;

import lombok.Getter;

@Getter
public class NavigateMenuScreens {

    public static String main() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("+---------------------------------------------------------------------------------------+\n");
        sBuilder.append("|                                 Movie Registration System.                            |\n");
        sBuilder.append("+---------------------------------------------------------------------------------------+\n");
        sBuilder.append("|                                                                                       |\n");
        sBuilder.append("|                                                                                       |\n");
        sBuilder.append("|                                        1 - Register Movie                             |\n");
        sBuilder.append("|                                        2 - Search for Movies                          |\n");
        sBuilder.append("|                                        3 - Edit Movie                                 |\n");
        sBuilder.append("|                                                                                       |\n");
        sBuilder.append("|                                        0 - Exit                                       |\n");
        sBuilder.append("+---------------------------------------------------------------------------------------+\n");
        return sBuilder.toString();
    }

    public static String fetchMenu() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("+---------------------------------------------------------------------------------------+\n");
        sBuilder.append("|                                 Movie Registration System.                            |\n");
        sBuilder.append("+---------------------------------------------------------------------------------------+\n");
        sBuilder.append("|                                                                                       |\n");
        sBuilder.append("|                                        1 - Fetch All Movies                           |\n");
        sBuilder.append("|                                        2 - Search by Name                             |\n");
        sBuilder.append("|                                        3 - Search by Year                             |\n");
        sBuilder.append("|                                        4 - Search by Producer                         |\n");
        sBuilder.append("|                                        5 - Search by Language                         |\n");
        sBuilder.append("|                                                                                       |\n");
        sBuilder.append("|                                        0 - Exit                                       |\n");
        sBuilder.append("+---------------------------------------------------------------------------------------+\n");
        return sBuilder.toString();
    }

    public static String fetchLanguage() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("+---------------------------------------------------------------------------------------+\n");
        sBuilder.append("|                                       Chose a Language                                |\n");
        sBuilder.append("+---------------------------------------------------------------------------------------+\n");
        sBuilder.append("|                                                                                       |\n");
        sBuilder.append("|                                                                                       |\n");
        sBuilder.append("|                                        1 - PORTUGUESE                                 |\n");
        sBuilder.append("|                                        2 - ENGLISH                                    |\n");
        sBuilder.append("|                                        3 - SPANISH                                    |\n");
        sBuilder.append("|                                        4 - UNKNOWN                                    |\n");
        sBuilder.append("|                                                                                       |\n");
        sBuilder.append("|                                                                                       |\n");
        sBuilder.append("+---------------------------------------------------------------------------------------+\n");
        return sBuilder.toString();
    }
}
