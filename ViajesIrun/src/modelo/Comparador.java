package modelo;

import java.util.Comparator;

public class Comparador implements Comparator<Hotel> {

	@Override
	public int compare(Hotel o1, Hotel o2) {
		
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
