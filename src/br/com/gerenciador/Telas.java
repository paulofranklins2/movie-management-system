package br.com.gerenciador;

public class Telas {

	public static String Principal() {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("+---------------------------------------------------------------------------------------+\n");
		sBuilder.append("|                              Sistema de Cadastro de Filmes                            |\n");
		sBuilder.append("+---------------------------------------------------------------------------------------+\n");
		sBuilder.append("|                                                                                       |\n");
		sBuilder.append("|                                                                                       |\n");
		sBuilder.append("|                                        1 - Cadastrar Filmes                           |\n");
		sBuilder.append("|                                        2 - Pesquisar Filmes                           |\n");
		sBuilder.append("|                                                                                       |\n");
		sBuilder.append("|                                                                                       |\n");
		sBuilder.append("|                                        0 - Sair                                       |\n");
		sBuilder.append("+---------------------------------------------------------------------------------------+\n");
		return sBuilder.toString();
	}

	public static String PesquisarFilmes() {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("+---------------------------------------------------------------------------------------+\n");
		sBuilder.append("|                              Sistema de Cadastro de Filmes                            |\n");
		sBuilder.append("+---------------------------------------------------------------------------------------+\n");
		sBuilder.append("|                                                                                       |\n");
		sBuilder.append("|                                                                                       |\n");
		sBuilder.append("|                                        1 - Buscar por Nomes                           |\n");
		sBuilder.append("|                                        2 - Buscar por Ano                             |\n");
		sBuilder.append("|                                        3 - Buscar por Produtora                       |\n");
		sBuilder.append("|                                        4 - Buscar por Idioma                          |\n");
		sBuilder.append("|                                                                                       |\n");
		sBuilder.append("|                                        0 - Sair                                       |\n");
		sBuilder.append("+---------------------------------------------------------------------------------------+\n");
		return sBuilder.toString();
	}
	
	public static String idiomas() {
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("+---------------------------------------------------------------------------------------+\n");
		sBuilder.append("|                                     Escolha um Idioma                                 |\n");
		sBuilder.append("+---------------------------------------------------------------------------------------+\n");
		sBuilder.append("|                                                                                       |\n");
		sBuilder.append("|                                                                                       |\n");
		sBuilder.append("|                                        1 - PORTUGUES                                  |\n");
		sBuilder.append("|                                        2 - INGLES                                     |\n");
		sBuilder.append("|                                        3 - ESPANHOL                                   |\n");
		sBuilder.append("|                                                                                       |\n");
		sBuilder.append("|                                                                                       |\n");
		sBuilder.append("|                                                                                       |\n");
		sBuilder.append("+---------------------------------------------------------------------------------------+\n");
		return sBuilder.toString();
	}
}
