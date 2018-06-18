package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "editora")

public class Editora {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEditora;
	@Column
	private String nome;
	@Column
	private String telefone;


	public int getidEditora() {
		return idEditora;
	}
	public void setidEditora(int idEditora) {
		this.idEditora = idEditora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone =  telefone;
	}
}