package agh.cs.lab9;

import java.io.IOException;
import java.net.URL;

import Posel.Posel;
import Posel.Roczniki;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Wydatki {
	
	private double suma = 0;
	private String id;
	private String kadencja;

	public Wydatki(String id, String kadencja) {
		this.id = id;
		this.kadencja = kadencja;
	}

	public double getWydatki() throws JsonParseException, JsonMappingException,
			IOException {
		String strona = new String(
				"https://api-v3.mojepanstwo.pl/dane/poslowie/" + id
						+ ".json?layers[]=wydatki");

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(
				DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		Posel posel = null;

		try {
			URL jsonUrl = new URL(strona);
			posel = objectMapper.readValue(jsonUrl, Posel.class);

		} catch (JsonGenerationException e1) {
			e1.printStackTrace();
		} catch (JsonMappingException e2) {
			e2.printStackTrace();
		} catch (IOException e3) {
			e3.printStackTrace();
		}

		for (int i = 0; i < 20; i++) {
			for (Roczniki x : posel.getLayers().getWydatki().getRoczniki()) {

				if (kadencja.equals("7")) {

					if (x.getRok().equals("2011") || x.getRok().equals("2012")
							|| x.getRok().equals("2013")
							|| x.getRok().equals("2014")) {
						double tmp3 = Double.parseDouble(x.getPola()[i]);
						suma = suma + tmp3;
					} else {
						if (x.getRok().equals("2015")
								|| x.getRok().equals("2016")) {
							double tmp3 = Double.parseDouble(x.getPola()[i]);
							suma = suma + tmp3;
						}
					}
				}
			}
		}
		return suma;

	}
}
