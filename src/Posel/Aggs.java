package Posel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Aggs {
	private _page _page;

	public _page get_page() {
		return _page;
	}

	public void set_page(_page _page) {
		this._page = _page;
	}

	@Override
	public String toString() {
		return "ClassPojo [_page = " + _page + "]";
	}
}
