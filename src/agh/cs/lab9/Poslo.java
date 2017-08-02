package agh.cs.lab9;

import java.io.IOException;
import java.net.URL;

import Poslowie.Json;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Poslo {
	private	String kadencja;
	private	String tmp;
	private	Integer tmp2;

	public Poslo(String kadencja) {
		this.kadencja = kadencja;
	}

	public Json[] getPoslo() throws JsonParseException, JsonMappingException,
			IOException {
		String strona = new String(
				"https://api-v3.mojepanstwo.pl/dane/poslowie.json?conditions[poslowie.kadencja]="
						+ kadencja + "&_type=objects&page=");

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(
				DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		Json jsontmp = new Json();
		Json[] json = null;
		try {

			URL jsonUrl = new URL(strona + "1");
			jsontmp = objectMapper.readValue(jsonUrl, Json.class);

			tmp = jsontmp
					.getLinks()
					.getLast()
					.substring(jsontmp.getLinks().getLast().length() - 2,
							jsontmp.getLinks().getLast().length());
			json = new Json[Integer.parseInt(tmp)];
			for (Integer i = 0; i < Integer.parseInt(tmp); i++) {
				tmp2 = i + 1;
				URL jsonUrl2 = new URL(strona + tmp2.toString());
				json[i] = objectMapper.readValue(jsonUrl2, Json.class);

			}

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return json;
	}

}
