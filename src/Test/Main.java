package Test;

import Models.Mono;

public class Main {

	public static void main(String[] args) {
		Mono mono = new Mono();
		for (int i = 0; i < 100; i++) {
			System.out.print(mono.pulsarTecla());
		}
	}

}
