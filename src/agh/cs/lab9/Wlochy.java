package agh.cs.lab9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Posel.Posel;
import Posel.Wyjazdy;



import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


public class Wlochy {
	
	private	List<String> wlochy = new ArrayList<>();
	private	String kadencja;
	List<Posel> lista = new ArrayList<Posel>();
	
	public Wlochy(List<Posel> lista, String kadencja) {
		this.lista = lista;
		this.kadencja = kadencja;
	}

	public List<String> get() throws JsonParseException, JsonMappingException,
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
								if (y.getKraj().equals(new String("W³ochy"))) {
									wlochy.add(posel.getData().getPoslowieid());
									break;

								}
							}

						} else {
							if (y.getOd().substring(0, 4).equals("2015")
									|| y.getOd().substring(0, 4).equals("2016")) {
								if (y.getKraj().equals(new String("W³ochy"))) {
									wlochy.add(posel.getData().getPoslowieid());
									break;
								}

							}

						}

					}

				}
			}
		
		return wlochy;
	}
}
