package dio.desafio.iphone;

public class Iphone {
	
	private Navegador navegador;
	private ReprodutorMusical reprodutorMusical;
	private Telefone telefone;

	
	public Iphone(Navegador navegador, ReprodutorMusical reprodutorMusical, Telefone telefone) {
		this.navegador = navegador;
		this.reprodutorMusical = reprodutorMusical;
		this.telefone = telefone;
	}
	
	public Navegador getNavegador() {
		return navegador;
	}

	public void setNavegador(Navegador navegador) {
		this.navegador = navegador;
	}

	public ReprodutorMusical getReprodutorMusical() {
		return reprodutorMusical;
	}

	public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
		this.reprodutorMusical = reprodutorMusical;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public void exibirPagina() {
		System.out.println("Exibindo pagina: " + navegador.getPaginaInicial());
	}
	
	public void adicionarNovaAba() {
		System.out.println("Nova aba aberta.");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando página.");
	}
	
	void tocar() {
		System.out.println("Tocando musica: " + reprodutorMusical.getMusica());
	}
	
	void pausar() {
		System.out.println("Pausando musica: " + reprodutorMusical.getMusica());
	}
	
	void selecionarMusica(String musica) {
		reprodutorMusical.setMusica(musica);
		System.out.println("Musica selecionada: " + musica);
	}
	
	void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
	}
	
	void atender() {
		System.out.println("Atendendo ligação.");
	}
	
	void IniciarCorreioDeVoz() {
		System.out.println("Correio de voz");
	}
	
	
}
	
