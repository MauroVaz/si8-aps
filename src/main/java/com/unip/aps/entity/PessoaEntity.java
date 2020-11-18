package com.unip.aps.entity;

public class PessoaEntity {
	
	private String UUID;
	private Boolean ativa;
	private String nome;
	private String cPF;
	private String cel;
	private String tel;
	private int papel;
	private int plastico;
	private int vidro;
	private int metal;
	private int organico;
	private int outros;
	private int total;
	
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Boolean getAtiva() {
		return ativa;
	}
	public void setAtiva(Boolean ativa) {
		this.ativa = ativa;
	}
	public String getUUID() {
		return UUID;
	}
	public void setUUID(String uUID) {
		UUID = uUID;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cPF;
	}
	public void setCpf(String cpf) {
		this.cPF = cpf;
	}
	public String getCel() {
		return cel;
	}
	public void setCel(String cel) {
		this.cel = cel;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getPapel() {
		return papel;
	}
	public void setPapel(int papel) {
		this.papel = papel;
	}
	public int getPlastico() {
		return plastico;
	}
	public void setPlastico(int plastico) {
		this.plastico = plastico;
	}
	public int getVidro() {
		return vidro;
	}
	public void setVidro(int vidro) {
		this.vidro = vidro;
	}
	public int getMetal() {
		return metal;
	}
	public void setMetal(int metal) {
		this.metal = metal;
	}
	public int getOrganico() {
		return organico;
	}
	public void setOrganico(int organico) {
		this.organico = organico;
	}
	public int getOutros() {
		return outros;
	}
	public void setOutros(int outros) {
		this.outros = outros;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((UUID == null) ? 0 : UUID.hashCode());
		result = prime * result + (ativa ? 1231 : 1237);
		result = prime * result + ((cel == null) ? 0 : cel.hashCode());
		result = prime * result + ((cPF == null) ? 0 : cPF.hashCode());
		result = prime * result + metal;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + organico;
		result = prime * result + outros;
		result = prime * result + papel;
		result = prime * result + plastico;
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
		result = prime * result + vidro;
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
		PessoaEntity other = (PessoaEntity) obj;
		if (UUID == null) {
			if (other.UUID != null)
				return false;
		} else if (!UUID.equals(other.UUID))
			return false;
		if (ativa != other.ativa)
			return false;
		if (cel == null) {
			if (other.cel != null)
				return false;
		} else if (!cel.equals(other.cel))
			return false;
		if (cPF == null) {
			if (other.cPF != null)
				return false;
		} else if (!cPF.equals(other.cPF))
			return false;
		if (metal != other.metal)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (organico != other.organico)
			return false;
		if (outros != other.outros)
			return false;
		if (papel != other.papel)
			return false;
		if (plastico != other.plastico)
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		if (vidro != other.vidro)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PessoaEntity [UUID=" + UUID + ", ativa=" + ativa + ", nome=" + nome + ", cpf=" + cPF + ", cel=" + cel
				+ ", tel=" + tel + ", papel=" + papel + ", plastico=" + plastico + ", vidro=" + vidro + ", metal="
				+ metal + ", organico=" + organico + ", outros=" + outros + "]";
	}
	
	

}
