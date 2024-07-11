// Importe as interfaces necessárias
import cellPhone.AparelhoTelefônico;
import cellPhone.NavegadorInternet;
import cellPhone.ReprodutorMusical;

public class Iphone implements AparelhoTelefônico, NavegadorInternet, ReprodutorMusical{
	@Override
	public void tocar() {
		System.out.println("Alô, telefone tocando");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausado com sucesso");
		
	}

	@Override
	public void selecionarMusical(String musica) {
		System.out.println("Você selecionou a musica " + musica);
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atualizada!");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada com sucesso");
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Acessando a pagina " + url + " ....");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando pro numero " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendeu");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("iniciando correio de voz");
		
	}

	
}


