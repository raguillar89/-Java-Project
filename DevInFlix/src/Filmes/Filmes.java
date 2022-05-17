package Filmes;

public class Filmes {
	
	private String filme;
	private String sinopse;
	private GeneroFilme genero;
	private String duracao;
	private String elenco;
	private String diretor;
	private String produtora;
	private String dataDeLancamento;
	
	public Filmes (String filme, String sinopse, GeneroFilme genero, String duracao, String elenco, String diretor, String produtora, String dataDeLancamento) {
		this.filme = filme;
		this.sinopse = sinopse;
		this.genero = genero;
		this.duracao = duracao;
		this.elenco = elenco;
		this.diretor = diretor;
		this.produtora = produtora;
		this.dataDeLancamento = dataDeLancamento;
	}
	
	public void apresentaFilme() {
		System.out.println("Filme: " + this.getFilme());
		System.out.println("Sinopse: " + this.getSinopse());
		System.out.println("Gênero: " + this.getGenero());
		System.out.println("Duração: " + this.getDuracao());
		System.out.println("Elenco: " + this.getElenco());
		System.out.println("Diretor: " + this.getDiretor());
		System.out.println("Produtora: " + this.getProdutora());
		System.out.println("Data de Lançamento: " + this.getDataDeLancamento());
	}
	
	public String getFilme() {
		return filme;
	}
	public void setFilme(String filme) {
		this.filme = filme;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public GeneroFilme getGenero() {
		return genero;
	}
	public void setGenero(GeneroFilme genero) {
		this.genero = genero;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getElenco() {
		return elenco;
	}
	public void setElenco(String elenco) {
		this.elenco = elenco;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getProdutora() {
		return produtora;
	}
	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}
	public String getDataDeLancamento() {
		return dataDeLancamento;
	}
	public void setDataDeLancamento(String dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}
	
	public String retorna_filme() {return(filme);}
	public String retorna_sinopse() {return(sinopse);}
	public GeneroFilme retorna_genero() {return(genero);}
	public String retorna_duracao() {return(duracao);}
	public String retorna_elenco() {return(elenco);}
	public String retorna_diretor() {return(diretor);}
	public String retorna_produtora() {return(produtora);}
	public String retorna_dataDeLancamento() {return(dataDeLancamento);}
	

	
}