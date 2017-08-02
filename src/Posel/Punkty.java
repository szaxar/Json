package Posel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Punkty {
	private String tytul;

	private String numer;

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getNumer() {
		return numer;
	}

	public void setNumer(String numer) {
		this.numer = numer;
	}

	@Override
	public String toString() {
		return "ClassPojo [tytul = " + tytul + ", numer = " + numer + "]";
	}
}
