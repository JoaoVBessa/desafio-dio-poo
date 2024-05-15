package aparelho;

import funcoes.AparelhoTelefonico;
import funcoes.NavegarInternet;
import funcoes.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegarInternet, ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("ESTÁ TOCANDO.");
		
	}
	
	@Override
	public void pausar() {
		System.out.println("ESTÁ PAUSADA.");
		
	}
	
	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONE A MÚSICA.");
		
	}
	
	@Override
	public void ligar() {
		System.out.println("LIGANDO.");
		
	}
	
	@Override
	public void atender() {
		System.out.println("ATENDENDO.");
	}
	
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIOU O CORREIO DE VOZ.");
		
	}
	
	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO PÁGINA.");
		
	}
	
	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA.");
		
	}
	
	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA.");
		
	}
	
}
