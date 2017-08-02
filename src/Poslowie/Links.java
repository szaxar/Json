package Poslowie;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Links {
	@JsonProperty("last")
	private String last;
	
	@JsonProperty("next")
	private String next;
	
	@JsonProperty("self")
	private String self;

	
	@JsonProperty("prev")
	private String prev;
	
	public String getprev() {
		return prev;
	}
	
	public void setprev(String prev) {
		 this.prev=prev;
	}
	
	
	
	
	
	@JsonProperty("first")
	private String first;
	
	public String getFirst() {
		return first;
	}
	
	public void setFirst(String first) {
		 this.first=first;
	}
	
	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	@Override
	public String toString() {
		return "ClassPojo [last = " + last + ", next = " + next + ", self = "
				+ self + "]";
	}
}
