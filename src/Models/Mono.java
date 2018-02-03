package Models;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Mono {
	private ListaLetra listaLetra;

	public Mono() {
		super();
		this.listaLetra = new ListaLetra();
	}

	public Character pulsarTecla() {
		return listaLetra.getRandom();
	}

	public void guardar(String texto) throws IOException {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("mono.txt"));
			writer.write(texto);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null)
				writer.close();
		}
	}
}
