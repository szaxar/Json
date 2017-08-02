package agh.cs.lab9;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Posel.Posel;
import Poslowie.Dataobject;
import Poslowie.Json;

public class ListaPoslow {
	Json[] json;
	List<Posel> lista = new ArrayList<Posel>();

	public ListaPoslow(Json[] json) {
		this.json = json;
	}

	public List<Posel> getLista() {
		for (Json j : json) {
			for (Dataobject x : j.getDataobject()) {

				String strona = new String(
						"https://api-v3.mojepanstwo.pl/dane/poslowie/"
								+ x.getData().getPoslowieid()
								+ ".json?layers[]=wyjazdy");

				ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.configure(
						DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY,
						true);
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

			lista.add(posel);

			}

		}
		return lista;
	}
}
