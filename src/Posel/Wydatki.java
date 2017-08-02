package Posel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Wydatki {
	private Roczniki[] roczniki;

	private String liczba_rocznikow;

	private String liczba_pol;

	private Punkty[] punkty;

	public Roczniki[] getRoczniki() {
		return roczniki;
	}

	public void setRoczniki(Roczniki[] roczniki) {
		this.roczniki = roczniki;
	}

	public String getLiczba_rocznikow() {
		return liczba_rocznikow;
	}

	public void setLiczba_rocznikow(String liczba_rocznikow) {
		this.liczba_rocznikow = liczba_rocznikow;
	}

	public String getLiczba_pol() {
		return liczba_pol;
	}

	public void setLiczba_pol(String liczba_pol) {
		this.liczba_pol = liczba_pol;
	}

	public Punkty[] getPunkty() {
		return punkty;
	}

	public void setPunkty(Punkty[] punkty) {
		this.punkty = punkty;
	}

	@Override
	public String toString() {
		return "ClassPojo [roczniki = " + roczniki + ", liczba_rocznikow = "
				+ liczba_rocznikow + ", liczba_pol = " + liczba_pol
				+ ", punkty = " + punkty + "]";
	}
}
