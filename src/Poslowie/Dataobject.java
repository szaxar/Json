package Poslowie;

public class Dataobject
{
    private String id;

    private String schema_url;

    private String dataset;

    private Data data;

    private String score;

    private String global_id;

    private String mp_url;

    private String slug;

    private String url;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getSchema_url ()
    {
        return schema_url;
    }

    public void setSchema_url (String schema_url)
    {
        this.schema_url = schema_url;
    }

    public String getDataset ()
    {
        return dataset;
    }

    public void setDataset (String dataset)
    {
        this.dataset = dataset;
    }

    public Data getData ()
    {
        return data;
    }

    public void setData (Data data)
    {
        this.data = data;
    }

    public String getScore ()
    {
        return score;
    }

    public void setScore (String score)
    {
        this.score = score;
    }

    public String getGlobal_id ()
    {
        return global_id;
    }

    public void setGlobal_id (String global_id)
    {
        this.global_id = global_id;
    }

    public String getMp_url ()
    {
        return mp_url;
    }

    public void setMp_url (String mp_url)
    {
        this.mp_url = mp_url;
    }

    public String getSlug ()
    {
        return slug;
    }

    public void setSlug (String slug)
    {
        this.slug = slug;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", schema_url = "+schema_url+", dataset = "+dataset+", data = "+data+", score = "+score+", global_id = "+global_id+", mp_url = "+mp_url+", slug = "+slug+", url = "+url+"]";
    }
}
			
			