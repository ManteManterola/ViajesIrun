package controlador;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.*;
import vista.Formulario;
import vista.Menu;
import vista.Visor;

public class GestorHoteles {

	public static Scanner scan = new Scanner(System.in);
	
	public static void run() {
		
		int opcion;
		GestorBBDD gestorBBDD = new GestorBBDD();
		
		do {
			Menu.mostrarMenuHoteles();
			opcion = scan.nextInt();
			
			switch (opcion) {
			
			case Menu.VISUALIZAR_HOTELES:
				gestorBBDD.Conectar();
				ArrayList <Hotel> hoteles = gestorBBDD.getHoteles();
				hoteles.sort(new Comparador());
				Visor.mostrarHoteles(hoteles);
				gestorBBDD.cerrar();
				break;
				
			case Menu.VISUALIZAR_HOTELES_CON_HABITACIONES:
				gestorBBDD.Conectar();
				Hotel hotel = gestorBBDD.getHotel(gestorBBDD.sacarIdConCif(Formulario.pedirCifHotel()));
				System.out.println(hotel);
				Visor.mostrarHabitaciones(gestorBBDD.getHabitacionesConIdHotel(hotel.getId()));
				break;
				
			default:
				Menu.mensajeNoDisponible();
				break;
			}
		} while (opcion != Menu.SALIR);
			
	}
}
