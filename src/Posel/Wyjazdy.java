package Posel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Wyjazdy {
	
	private String delegacja;

	private String koszt_hotel;

	private String koszt_fundusz;

	private String koszt_dieta;

	private String koszt_ubezpieczenie;

	private String kraj;

	private String koszt_zaliczki;

	private String koszt_dojazd;

	private String country_code;

	private String id;

	private String wniosek_nr;

	private String koszt_kurs;

	private String od;

	private String koszt_transport;

	private String miasto;

	private String _do;

	private String liczba_dni;

	private String koszt_suma;

	public String getDelegacja() {
		return delegacja;
	}

	public void setDelegacja(String delegacja) {
		this.delegacja = delegacja;
	}

	public String getKoszt_hotel() {
		return koszt_hotel;
	}

	public void setKoszt_hotel(String koszt_hotel) {
		this.koszt_hotel = koszt_hotel;
	}

	public String getKoszt_fundusz() {
		return koszt_fundusz;
	}

	public void setKoszt_fundusz(String koszt_fundusz) {
		this.koszt_fundusz = koszt_fundusz;
	}

	public String getKoszt_dieta() {
		return koszt_dieta;
	}

	public void setKoszt_dieta(String koszt_dieta) {
		this.koszt_dieta = koszt_dieta;
	}

	public String getKoszt_ubezpieczenie() {
		return koszt_ubezpieczenie;
	}

	public void setKoszt_ubezpieczenie(String koszt_ubezpieczenie) {
		this.koszt_ubezpieczenie = koszt_ubezpieczenie;
	}

	public String getKraj() {
		return kraj;
	}

	public void setKraj(String kraj) {
		this.kraj = kraj;
	}

	public String getKoszt_zaliczki() {
		return koszt_zaliczki;
	}

	public void setKoszt_zaliczki(String koszt_zaliczki) {
		this.koszt_zaliczki = koszt_zaliczki;
	}

	public String getKoszt_dojazd() {
		return koszt_dojazd;
	}

	public void setKoszt_dojazd(String koszt_dojazd) {
		this.koszt_dojazd = koszt_dojazd;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWniosek_nr() {
		return wniosek_nr;
	}

	public void setWniosek_nr(String wniosek_nr) {
		this.wniosek_nr = wniosek_nr;
	}

	public String getKoszt_kurs() {
		return koszt_kurs;
	}

	public void setKoszt_kurs(String koszt_kurs) {
		this.koszt_kurs = koszt_kurs;
	}

	public String getOd() {
		return od;
	}

	public void setOd(String od) {
		this.od = od;
	}

	public String getKoszt_transport() {
		return koszt_transport;
	}

	public void setKoszt_transport(String koszt_transport) {
		this.koszt_transport = koszt_transport;
	}

	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}

	public String getDo() {
		return _do;
	}

	public void setDo(String _do) {
		this._do = _do;
	}

	public String getLiczba_dni() {
		return liczba_dni;
	}

	public void setLiczba_dni(String liczba_dni) {
		this.liczba_dni = liczba_dni;
	}

	public String getKoszt_suma() {
		return koszt_suma;
	}

	public void setKoszt_suma(String koszt_suma) {
		this.koszt_suma = koszt_suma;
	}

	@Override
	public String toString() {
		return "ClassPojo [delegacja = " + delegacja + ", koszt_hotel = "
				+ koszt_hotel + ", koszt_fundusz = " + koszt_fundusz
				+ ", koszt_dieta = " + koszt_dieta + ", koszt_ubezpieczenie = "
				+ koszt_ubezpieczenie + ", kraj = " + kraj
				+ ", koszt_zaliczki = " + koszt_zaliczki + ", koszt_dojazd = "
				+ koszt_dojazd + ", country_code = " + country_code + ", id = "
				+ id + ", wniosek_nr = " + wniosek_nr + ", koszt_kurs = "
				+ koszt_kurs + ", od = " + od + ", koszt_transport = "
				+ koszt_transport + ", miasto = " + miasto + ", do = " + _do
				+ ", liczba_dni = " + liczba_dni + ", koszt_suma = "
				+ koszt_suma + "]";
	}
}