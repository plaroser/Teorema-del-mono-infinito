package Models;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class ListaLetra extends TreeMap<Float, Character> {

	public ListaLetra() {
		super();
		inicialice();
	}

	private void inicialice() {
		put(0.001f, 'w');
		put(0.003f, 'k');
		put(0.054f, ':');
		put(0.071f, 'x');
		put(0.202f, 'ñ');
		put(0.211f, ';');
		put(0.320f, 'z');
		put(0.371f, 'j');
		put(0.487f, 'f');
		put(0.785f, 'y');
		put(0.795f, 'h');
		put(0.876f, 'g');
		put(0.893f, 'v');
		put(1.025f, 'q');
		put(1.409f, ',');
		put(1.503f, '.');
		put(1.537f, 'b');
		put(1.958f, 'p');
		put(2.104f, 'm');
		put(3.018f, 'c');
		put(3.109f, 't');
		put(3.324f, 'u');
		put(3.875f, 'd');
		put(4.815f, 'l');
		put(4.974f, 'i');
		put(5.049f, 'n');
		put(5.145f, 'r');
		put(5.841f, 's');
		put(7.379f, 'o');
		put(10.160f, 'e');
		put(11.107f, 'a');
		put(17.599f, ' ');
	}

	public Character put(Float key, Character value) {
		if (!super.isEmpty()) {
			float anterior = (float) super.lastKey();
			super.put((key + anterior), value);
		} else {
			super.put(key, value);
		}
		return value;
	}

	public Character getRandom() {
		Random rand = new Random();
		float aleatorio = rand.nextFloat() * 100;
		for (Map.Entry<Float, Character> entry : super.entrySet()) {
			if (entry.getKey() >= aleatorio) {
				return entry.getValue();
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
