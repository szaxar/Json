package Posel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Posel {
	
	private String id;
	@JsonProperty("Aggs")
	private Aggs Aggs;

	private String schema_url;

	private String dataset;

	private Layers layers;

	private Data data;

	private String score;

	private String global_id;

	private String mp_url;

	private String slug;

	private String url;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Aggs getAggs() {
		return Aggs;
	}

	public void setAggs(Aggs Aggs) {
		this.Aggs = Aggs;
	}

	public String getSchema_url() {
		return schema_url;
	}

	public void setSchema_url(String schema_url) {
		this.schema_url = schema_url;
	}

	public String getDataset() {
		return dataset;
	}

	public void setDataset(String dataset) {
		this.dataset = dataset;
	}

	public Layers getLayers() {
		return layers;
	}

	public void setLayers(Layers layers) {
		this.layers = layers;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getGlobal_id() {
		return global_id;
	}

	public void setGlobal_id(String global_id) {
		this.global_id = global_id;
	}

	public String getMp_url() {
		return mp_url;
	}

	public void setMp_url(String mp_url) {
		this.mp_url = mp_url;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "ClassPojo [id = " + id + ", Aggs = " + Aggs + ", schema_url = "
				+ schema_url + ", dataset = " + dataset + ", layers = "
				+ layers + ", data = " + data + ", score = " + score
				+ ", global_id = " + global_id + ", mp_url = " + mp_url
				+ ", slug = " + slug + ", url = " + url + "]";
	}
}
