package Models;

public class Mono {
	private ListaLetra listaLetra;

	public Mono() {
		super();
		this.listaLetra = new ListaLetra();
	}

	public Character pulsarTecla() {
		return listaLetra.getRandom();
	}

}
