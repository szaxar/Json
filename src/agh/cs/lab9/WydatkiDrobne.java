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

public class WydatkiDrobne {

	private double suma = 0;
	private String id;
	private String kadencja;

	public WydatkiDrobne(String id, String kadencja) {
		this.id = id;
		this.kadencja = kadencja;
	}

	public double getWydatki() throws JsonParseException, JsonMappingException,
			IOException {
		String strona = new String(
				"https://api-v3.mojepanstwo.pl/dane/poslowie/" + id
						+ ".json?layers[]=wyjazdy&layers[]=wydatki");

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(
				DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
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

		for (Roczniki x : posel.getLayers().getWydatki().getRoczniki()) {
			if (kadencja.equals("7")) {

				if (x.getRok().equals("2011") || x.getRok().equals("2012")
						|| x.getRok().equals("2013")
						|| x.getRok().equals("2014")) {
					double tmp3 = Double.parseDouble(x.getPola()[12]);
					suma = suma + tmp3;
				} else {
					if (x.getRok().equals("2015") || x.getRok().equals("2016")) {
						double tmp3 = Double.parseDouble(x.getPola()[12]);
						suma = suma + tmp3;
					}
				}
			}
		}

		return suma;

	}
}
