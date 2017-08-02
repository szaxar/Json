package agh.cs.lab9;

import java.io.IOException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import Poslowie.Dataobject;
import Poslowie.Json;

public class Srednia {

	private int n = 0;
	private double suma;
	private String kadencja;

	Json[] json;

	public Srednia(Json[] json,String kadencja) {
		this.json = json;
		this.kadencja=kadencja;
	}

	public double getsrednia() throws JsonParseException, JsonMappingException,
			IOException {

		for (Json j : json) {
			for (Dataobject x : j.getDataobject()) {
				n++;
				Wydatki wydatki = new Wydatki(x.getId(), kadencja);
				suma = suma + wydatki.getWydatki();

			}
		}
		suma = suma / n;

		return suma;

	}

}