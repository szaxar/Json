package agh.cs.lab9;

import Poslowie.Dataobject;
import Poslowie.Json;

public class PoselId {
	private	String Name;
	private	Json[] json;

	public PoselId(Json[] json, String Imie, String Nazwisko) {
		this.Name = Imie + " " + Nazwisko;
		this.json = json;
	}

	public String getId() {

		for (Json a : json) {
			for (Dataobject j : a.getDataobject()) {
				if (j.getData().getPoslowienazwa().equals(Name))
					return j.getData().getPoslowieid();
			}
		}

		throw new IllegalArgumentException("brak posla");
	}
}
