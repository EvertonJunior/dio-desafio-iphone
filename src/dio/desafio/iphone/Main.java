package dio.desafio.iphone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Iphone iphone = new Iphone(new Navegador("Pagina Inicial"), new ReprodutorMusical("Musica Aleatoria"), new Telefone("123456789"));
		
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		iphone.selecionarMusica("Justin Bieber");
		iphone.tocar();
		iphone.pausar();
		
		iphone.ligar("123456");
		iphone.atender();
		iphone.IniciarCorreioDeVoz();
		
	}

}
