package cl.mobdev.challenge.model;

import java.util.ArrayList;

public class OriginAndLocation {
	private String name;
	private String url;
	private String dimension;

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

	private ArrayList<String> residents;
}
