package br.com.usjt_pi_api_theplateisonthetable.model.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	// @Column(name="fk_usuario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id_usuario;
	@NotNull
	public String nome;
	@NotNull
	public String cpf;
	@NotNull
	public String dataNasc;
	@NotNull
	public String tel;
	@NotNull
	public String email;
	@NotNull
	public String password;
	@NotNull
	public String toString;

	public Long getId() {
		return id_usuario;
	}

	public void setId(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id_usuario + ", nome=" + nome + ", cpf=" + cpf + ", dataNasc=" + dataNasc + ", tel=" + tel
				+ ", email=" + email + ", toString=" + toString + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((dataNasc == null) ? 0 : dataNasc.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id_usuario == null) ? 0 : id_usuario.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
		result = prime * result + ((toString == null) ? 0 : toString.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (dataNasc == null) {
			if (other.dataNasc != null)
				return false;
		} else if (!dataNasc.equals(other.dataNasc))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id_usuario == null) {
			if (other.id_usuario != null)
				return false;
		} else if (!id_usuario.equals(id_usuario))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		if (toString == null) {
			if (other.toString != null)
				return false;
		} else if (!toString.equals(other.toString))
			return false;
		return true;
	}

	/*
	 * // Construtor para testes de implementação public Usuario(Long id, @NotNull
	 * String nome, @NotNull String cpf, @NotNull String dataNasc, @NotNull String
	 * tel,
	 * 
	 * @NotNull String email, @NotNull String password, @NotNull Avaliacao
	 * avaliacao) { // TODO Auto-generated constructor stub super(); this.id = id;
	 * this.nome = nome; this.cpf = cpf; this.dataNasc = dataNasc; this.tel = tel;
	 * this.email = email; this.password = password; this.avaliacao = avaliacao; }
	 */
}
