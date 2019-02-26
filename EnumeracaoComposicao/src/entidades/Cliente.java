package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String nome;
	private String email;
	private Date dataNascimento;

	public Cliente(String nome, String email, Date dataNascimento) {
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDatanascimento() {
		return dataNascimento;
	}

	public void setDatanascimento(Date datanascimento) {
		this.dataNascimento = datanascimento;
	}

	public String toString() {

		return "Cliente: " + nome + ", " + sdf.format(dataNascimento) + " - " + email;

	}

}
