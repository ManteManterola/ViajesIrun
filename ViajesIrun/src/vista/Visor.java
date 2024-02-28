package vista;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Habitacion;
import modelo.Hotel;

public class Visor {
	public static void mostrarClientes(ArrayList<Cliente> clientes) {
		for (Cliente cliente : clientes)
			System.out.println(cliente);
	}
	
	public static void mostrarHoteles(ArrayList<Hotel> hoteles) {
		for (Hotel hotel : hoteles)
			System.out.println(hotel);
	}
	
	public static void mostrarHabitaciones(ArrayList<Habitacion> habitaciones) {
		for (Habitacion habitacion : habitaciones)
			System.out.println(habitacion);
	}
}
