package com.exemplu2.jdbc;

public class Masina {
	private String nr;
	private String marca;
	private int an;
	private String culoare;
	private int km;
	
	public Masina(){	}

	public Masina(String nr, String marca, int an, String culoare, int km) {
		super();
		this.nr = nr;
		this.marca = marca;
		this.an = an;
		this.culoare = culoare;
		this.km = km;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAn() {
		return an;
	}

	public void setAn(int an) {
		this.an = an;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	@Override
	public String toString() {
		return "Masina [nr=" + nr + ", marca=" + marca + ", an=" + an + ", culoare=" + culoare + ", km=" + km + "]";
	}
	
	
}
