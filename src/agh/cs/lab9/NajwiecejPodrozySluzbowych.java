package agh.cs.lab9;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


import Posel.Posel;
import Posel.Wyjazdy;


public class NajwiecejPodrozySluzbowych {
	
	private int suma = 0;
	private String kadencja;
	private String tmp;
	private int tmp2;
	List<Posel> lista = new ArrayList<Posel>();
	
	public NajwiecejPodrozySluzbowych(List<Posel> lista, String kadencja) {
		this.lista = lista;
		this.kadencja = kadencja;
	}

	public String getIlosc() throws JsonParseException, JsonMappingException,
			IOException {

	
			for (Posel posel : lista) {

				
				if (posel.getLayers().getWyjazdy().length != 1
						&& posel.getData().getPoslowieliczba_wyjazdow() != "0") {
					tmp2 = 0;
					for (Wyjazdy y : posel.getLayers().getWyjazdy()) {
						if (kadencja.equals("7")) {

							if (y.getOd().substring(0, 4).equals("2011")
									|| y.getOd().substring(0, 4).equals("2012")
									|| y.getOd().substring(0, 4).equals("2013")
									|| y.getOd().substring(0, 4).equals("2014")) {
								tmp2++;
							}
							if (suma < tmp2) {
								suma = tmp2;
								tmp = posel.getData().getPoslowieid();
							}
						} else {
							if (y.getOd().substring(0, 4).equals("2015")
									|| y.getOd().substring(0, 4).equals("2016")) {

								tmp2++;
							}
							if (suma < tmp2) {
								suma = tmp2;
								tmp = posel.getData().getPoslowieid();
							}
						}
					}
				}
			}
		
		return tmp;
	}

}