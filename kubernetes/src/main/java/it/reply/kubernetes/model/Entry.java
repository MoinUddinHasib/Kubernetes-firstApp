package it.reply.kubernetes.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Entry implements Serializable {
	
	private Long indice;
	private Long valore;
	
	public Long getIndice() {
		return indice;
	}
	public void setIndice(Long indice) {
		this.indice = indice;
	}
	public Long getValore() {
		return valore;
	}
	public void setValore(Long valore) {
		this.valore = valore;
	}

}
