package Poslowie;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Json {
	@JsonProperty("Dataobject")
	private Dataobject[] Dataobject;
	@JsonProperty("Count")
	private String Count;
	
	@JsonProperty("Links")
	private Links Links;
	
	@JsonProperty("Took")
	private String Took;

	public Dataobject[] getDataobject() {
		return Dataobject;
	}

	public void setDataobject(Dataobject[] Dataobject) {
		this.Dataobject = Dataobject;
	}

	public String getCount() {
		return Count;
	}

	public void setCount(String Count) {
		this.Count = Count;
	}

	public Links getLinks() {
		return Links;
	}

	public void setLinks(Links Links) {
		this.Links = Links;
	}

	public String getTook() {
		return Took;
	}

	public void setTook(String Took) {
		this.Took = Took;
	}

	@Override
	public String toString() {
		return "ClassPojo [Dataobject = " + Dataobject + ", Count = " + Count
				+ ", Links = " + Links + ", Took = " + Took + "]";
	}
}
