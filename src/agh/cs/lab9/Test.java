package agh.cs.lab9;

import junit.framework.TestCase;
import Posel.Posel;
import Poslowie.Json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Test extends TestCase {

	
	public void testWydatki() throws JsonParseException, JsonMappingException,
			IOException {

		Poslo poslo = new Poslo("7");
		Json[] json = poslo.getPoslo();
		PoselId posel = new PoselId(json, "Andrzej", "Duda");
		Wydatki wydatki = new Wydatki(posel.getId(), "7");
		double tmp = 153345.53;
		int wydatek=(int) (wydatki.getWydatki()*100);
		double wydatek2=(double)wydatek/100;
		assertEquals(wydatek2, tmp);

	}

	public void testWydatkiDrobne() throws JsonParseException,
			JsonMappingException, IOException {

		Poslo poslo = new Poslo("7");
		Json[] json = poslo.getPoslo();
		
		PoselId posel = new PoselId(json, "Anna", "Grodzka");
		WydatkiDrobne wydatki = new WydatkiDrobne(posel.getId(), "7");
		double tmp = 1516.26;
		int wydatek=(int) (wydatki.getWydatki()*100);
		double wydatek2=(double)wydatek/100;
		
		assertEquals(wydatek2, tmp);

	}

	public void testWlochy() throws JsonParseException, JsonMappingException,
			IOException {

		List<Posel> lista = new ArrayList<Posel>();
		
		Poslo poslo = new Poslo("7");
		Json[] json = poslo.getPoslo();
		ListaPoslow listaPoslow=new ListaPoslow(json);
		lista=listaPoslow.getLista();
		Wlochy wlochy = new Wlochy(lista, "7");
		boolean test;
	
		if(wlochy.get().contains("Andrzej Duda")) test=true;
		else test=false;
		
assertEquals(false, test);
	}

}
