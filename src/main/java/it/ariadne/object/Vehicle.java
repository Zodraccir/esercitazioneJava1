package it.ariadne.object;

public abstract class Vehicle {
	private String marca;
	private String modello;
	private String cilindrata;
	private String cavalli;
	private double kilometri1litro;
	private String targa;
	private int posti;
	
	public Vehicle(String targa){
		this.targa=targa;
	}
	
	public Vehicle(){}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(String cilindrata) {
		this.cilindrata = cilindrata;
	}
	public String getCavalli() {
		return cavalli;
	}
	public void setCavalli(String cavalli) {
		this.cavalli = cavalli;
	}
	public double getKilometri1litro() {
		return kilometri1litro;
	}
	public void setKilometri1litro(double kilometri1litro) {
		this.kilometri1litro = kilometri1litro;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public int getPosti() {
		return posti;
	}
	public void setPosti(int posti) {
		this.posti = posti;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((targa == null) ? 0 : targa.hashCode());
		return result;
	}

	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (targa == null) {
			if (other.targa != null)
				return false;
		} else if (!targa.equals(other.targa))
			return false;
		return true;
	}
	
	
	
	
}
