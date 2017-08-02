package Posel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Roczniki {
	private String[] pola;

	private String rok;

	private String dokument_id;

	public String[] getPola() {
		return pola;
	}

	public void setPola(String[] pola) {
		this.pola = pola;
	}

	public String getRok() {
		return rok;
	}

	public void setRok(String rok) {
		this.rok = rok;
	}

	public String getDokument_id() {
		return dokument_id;
	}

	public void setDokument_id(String dokument_id) {
		this.dokument_id = dokument_id;
	}

	@Override
	public String toString() {
		return "ClassPojo [pola = " + pola + ", rok = " + rok
				+ ", dokument_id = " + dokument_id + "]";
	}
}
