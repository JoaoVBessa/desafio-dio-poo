package aplicacao;

import aparelho.Iphone;

public class App {

	public static void main(String[] args) {
		
		Iphone celular = new Iphone();
		
		System.out.println("Funções do REPRODUTOR MUSICAL.");
		celular.tocar();
		celular.pausar();
		celular.selecionarMusica();
		
		System.out.println("\nFunções do APARELHO TELEFÔNICO.");
		
		celular.ligar();
		celular.atender();
		celular.iniciarCorreioVoz();
		
		System.out.println("\nFunções do NAVEGADOR NA INTERNET.");
		
		celular.exibirPagina();
		celular.adicionarNovaAba();
		celular.atualizarPagina();
		
	}
	
}
