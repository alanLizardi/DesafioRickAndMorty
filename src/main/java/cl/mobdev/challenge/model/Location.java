package cl.mobdev.challenge.model;

import java.util.ArrayList;

public class Location {

	private int id;
	private String name;
	private String type;
	private String dimension;
	private ArrayList<String> residents;
	private String url;
	private String created;

	public Location() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public ArrayList<String> getResidents() {
		return residents;
	}

	public void setResidents(ArrayList<String> residents) {
		this.residents = residents;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Location [created=" + created + ", dimension=" + dimension + ", id=" + id + ", name=" + name
				+ ", residents=" + residents + ", type=" + type + ", url=" + url + "]";
	}

}
