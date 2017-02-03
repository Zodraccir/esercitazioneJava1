package it.ariadne.object;

public class Track extends Vehicle {
	public Track(String targa) {
		super(targa);
		// TODO Auto-generated constructor stub
	}

	private boolean carrellato;

	public boolean isCarrellato() {
		return carrellato;
	}

	public void setCarrellato(boolean carrellato) {
		this.carrellato = carrellato;
	}
}
