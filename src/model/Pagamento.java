package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "pagamento")
public class Pagamento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String dataCompra;
	@Column 
	private float precoTotal;
	@Column
	private String nomeLivro;
	@Column
	private String precoLivro;
	@Column
	private int qtdLivro;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}
	public float getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(float precoTotal) {
		this.precoTotal = precoTotal;
	}
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getPrecoLivro() {
		return precoLivro;
	}
	public void setPrecoLivro(String precoLivro) {
		this.precoLivro = precoLivro;
	}
	public int getQtdLivro() {
		return qtdLivro;
	}
	public void setQtdLivro(int qtdLivro) {
		this.qtdLivro = qtdLivro;
	}
	
}