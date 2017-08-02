package agh.cs.lab9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Posel.Posel;
import Posel.Wyjazdy;



import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


public class NajdluzszaPodrozSluzbowa {

	private long suma = 0;
	private String kadencja;
	private String tmp;
	List<Posel> lista = new ArrayList<Posel>();
	
	public NajdluzszaPodrozSluzbowa(List<Posel> lista , String kadencja) {
		this.lista = lista;
		this.kadencja = kadencja;
	}

	public String getDlugosc() throws JsonParseException, JsonMappingException,
			IOException {

		for (Posel posel : lista) {
				
				
				if (posel.getLayers().getWyjazdy().length != 1
						&& posel.getData().getPoslowieliczba_wyjazdow() != "0") {
					for (Wyjazdy y : posel.getLayers().getWyjazdy()) {
						if (kadencja.equals("7")) {

							if (y.getOd().substring(0, 4).equals("2011")
									|| y.getOd().substring(0, 4).equals("2012")
									|| y.getOd().substring(0, 4).equals("2013")
									|| y.getOd().substring(0, 4).equals("2014")) {
								if (suma < Integer.parseInt(y.getLiczba_dni())) {

									suma = Integer.parseInt(y.getLiczba_dni());
									tmp = posel.getId();

								}

							}
						} else {
							if (y.getOd().substring(0, 4).equals("2015")
									|| y.getOd().substring(0, 4).equals("2016")) {
								if (suma < Integer.parseInt(y.getLiczba_dni())) {

									suma = Integer.parseInt(y.getLiczba_dni());
									tmp = posel.getId();

								}
							}

						}

					}
				}
			}
		

		return tmp;
	}
}
