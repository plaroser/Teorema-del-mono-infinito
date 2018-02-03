package Test;

import java.io.IOException;

import Models.Mono;

public class Main {

	public static void main(String[] args) {
		Mono mono = new Mono();
		String texto = "";
		for (int i = 0; i < 100; i++) {
			char tecla = mono.pulsarTecla();
			System.out.print(tecla);
			texto += tecla;
		}
		try {
			mono.guardar(texto);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
