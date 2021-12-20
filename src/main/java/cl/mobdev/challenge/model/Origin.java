package cl.mobdev.challenge.model;

public class Origin {
    private String name;// "Earth (C-137)",
    private String url; // "https://rickandmortyapi.com/api/location/1",

    public Origin() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Origin [name=" + name + ", url=" + url + "]";
    }

}
