package agh.cs.lab9;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import Posel.Posel;
import Poslowie.Json;

public class MainClass {

	public static void main(String[] args) throws JsonParseException,
			JsonMappingException, IOException {

		try {

			System.out.println("Poczatek Programu");
			if (args[1].equals(new String("1"))
					|| args[1].equals(new String("2"))) {
				if (args.length != 4)
					throw new IllegalArgumentException(
							"bledna ilosc argumentow");
			} else if (args.length != 2)
				throw new IllegalArgumentException("bledna ilosc argumentow");
			
			PoselId posel = null;
			List<Posel> lista = new ArrayList<Posel>();
			String nr, imie, nazwisko, kadencja;
			imie = "";
			nazwisko = "";
			int tmp;
			kadencja = args[0];
			nr = args[1];
			if (nr.equals(new String("1")) || nr.equals(new String("2")))
				imie = args[2];
			if (nr.equals(new String("1")) || nr.equals(new String("2")))
				nazwisko = args[3];

			Poslo poslo;
			Json json[];

			switch (kadencja) {

			case "7":
				poslo = new Poslo(kadencja);
				json = poslo.getPoslo();
				break;
			case "8":
				poslo = new Poslo(kadencja);
				json = poslo.getPoslo();
				break;
			default:
				throw new IllegalArgumentException("bledne wartosci kadencji");
			}

			
			System.out.println("Wczytuje Dane");
			
			if (nr.equals(new String("1")) || nr.equals(new String("2"))){
				posel = new PoselId(json, imie, nazwisko);
			}
			else {
				ListaPoslow listaPoslow=new ListaPoslow(json);
				lista=listaPoslow.getLista();
			}
			switch (nr) {

			case "1":
				Wydatki wydatki = new Wydatki(posel.getId(), kadencja);
				tmp = (int) (wydatki.getWydatki() * 100);
				System.out.println("Posel " + imie + " " + nazwisko + "wydal"
						+ (double) tmp / 100);
				break;
			case "2":
				WydatkiDrobne wydatkidrobne = new WydatkiDrobne(posel.getId(),
						kadencja);
				tmp = (int) (wydatkidrobne.getWydatki() * 100);
				System.out.println("Posel " + imie + " " + nazwisko
						+ "wydal na drobne naprawy " + (double) tmp / 100);
				break;
			case "3":
				Srednia srednia = new Srednia(json,kadencja);
				tmp = (int) (srednia.getsrednia() * 100);
				System.out.println("Srednie wydatki poslow to: " + (double) tmp / 100);
				break;
			case "4":
				NajwiecejPodrozySluzbowych najwiecej = new NajwiecejPodrozySluzbowych(
						lista, kadencja);
				System.out
						.println("Najwieceje podrozy sluzbowych wykonal posel o id "
								+ najwiecej.getIlosc());
				break;
			case "5":
				NajdluzszaPodrozSluzbowa nadluzsza = new NajdluzszaPodrozSluzbowa(
						lista, kadencja);
				System.out
						.println("Najdluzsza podroz sluzbowa wykonal posel o id "
								+ nadluzsza.getDlugosc());
				break;
			case "6":
				NajdrozszaPodrozSluzbowa najdrozsza = new NajdrozszaPodrozSluzbowa(
						lista, kadencja);
				System.out
						.println("Najdrozsza podroz sluzbowych wykonal posel o id "
								+ najdrozsza.getIlosc());
				break;
			case "7":
				Wlochy wlochy = new Wlochy(lista, kadencja);
				System.out.println("Poslowie ktorzy odwiedzili wlochy maja id: "+wlochy.get());
				break;
			default:
				throw new IllegalArgumentException("bledne wartosci nr");

			}

			System.out.println("Koniec Programu");

		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
