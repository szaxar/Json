package Posel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Layers {
	private Wydatki wydatki;

	private String page;

	private String dataset;

	private Wyjazdy[] wyjazdy;

	private String channels;

	private String subscribers;

	public Wydatki getWydatki() {
		return wydatki;
	}

	public void setWydatki(Wydatki wydatki) {
		this.wydatki = wydatki;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getDataset() {
		return dataset;
	}

	public void setDataset(String dataset) {
		this.dataset = dataset;
	}

	public Wyjazdy[] getWyjazdy() {
		return wyjazdy;
	}

	public void setWyjazdy(Wyjazdy[] wyjazdy) {
		this.wyjazdy = wyjazdy;
	}

	public String getChannels() {
		return channels;
	}

	public void setChannels(String channels) {
		this.channels = channels;
	}

	public String getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(String subscribers) {
		this.subscribers = subscribers;
	}

	@Override
	public String toString() {
		return "ClassPojo [wydatki = " + wydatki + ", page = " + page
				+ ", dataset = " + dataset + ", wyjazdy = " + wyjazdy
				+ ", channels = " + channels + ", subscribers = " + subscribers
				+ "]";
	}
}
