package negocio;

import java.util.Date;

public class Produto {
	private String nome;
	private String rating;
	private String tags;
	private Double preco;
	private Date dtLancamento;
	
	public Produto(String nome, String rating, String tags, Double preco, Date dtLancamento) {
		this.nome = nome;
		this.rating = rating;
		this.tags = tags;
		this.preco = preco;
		this.dtLancamento = dtLancamento;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Date getDtLancamento() {
		return dtLancamento;
	}
	public void setDtLancamento(Date dtLancamento) {
		this.dtLancamento = dtLancamento;
	}
	
	@Override
    public String toString() {
        return nome + "," + rating + "," +  tags + "," +  preco + "," +  dtLancamento;
    }

}
