package br.com.gerenciador.screen;

import br.com.gerenciador.fileHandler.FileReaderHandler;

import java.io.IOException;
import java.util.Scanner;

import static br.com.gerenciador.service.MovieService.editMovie;
import static br.com.gerenciador.service.MovieService.newMovie;

public class NavigateMenuService {

    public static void runConsole() throws IOException {
        var scanner = new Scanner(System.in);

        var menu = Integer.MAX_VALUE;
        var subMenu = Integer.MAX_VALUE;
        while (menu != 0) {
            System.out.println(NavigateMenuScreens.main());
            menu = scanner.nextInt();
            scanner.nextLine(); // clear
            if (menu == 1) {
                newMovie(scanner);
                scanner.nextLine(); //clear
            } else if (menu == 2) {
                while (subMenu != 0) {
                    if (subMenu == 1) {
                        scanner.nextLine();

                        FileReaderHandler.fetchAllMovies();
                        System.out.println(NavigateMenuScreens.fetchMenu());
                        subMenu = scanner.nextInt();
                    } else if (subMenu == 2) {
                        scanner.nextLine();

                        FileReaderHandler.fetchSimilarNames(scanner);
                        System.out.println(NavigateMenuScreens.fetchMenu());
                        subMenu = scanner.nextInt();
                    } else if (subMenu == 3) {
                        scanner.nextLine();

                        FileReaderHandler.fetchByReleaseDate(scanner);
                        System.out.println(NavigateMenuScreens.fetchMenu());
                        subMenu = scanner.nextInt();
                    } else if (subMenu == 4) {
                        scanner.nextLine();

                        FileReaderHandler.fetchBySimilarProducersCompany(scanner);
                        System.out.println(NavigateMenuScreens.fetchMenu());
                        subMenu = scanner.nextInt();
                    } else if (subMenu == 5) {
                        scanner.nextLine();

                        FileReaderHandler.fetchByLanguage(scanner);
                        System.out.println(NavigateMenuScreens.fetchMenu());
                        subMenu = scanner.nextInt();
                    } else {
                        System.out.println(NavigateMenuScreens.fetchMenu());
                        subMenu = scanner.nextInt();
                    }
                }
            } else if (menu == 3) {
                editMovie(scanner);
            }
        }
    }
}
