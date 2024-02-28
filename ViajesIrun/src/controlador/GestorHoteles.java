package controlador;

import java.util.Scanner;

import modelo.GestorBBDD;
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
				Visor.mostrarHoteles(gestorBBDD.getHoteles());
				gestorBBDD.cerrar();
				break;
				
			case Menu.VISUALIZAR_HOTELES_CON_HABITACIONES:
				gestorBBDD.Conectar();
				Visor.mostrarHabitaciones(gestorBBDD.getHabitacionesConIdHotel(gestorBBDD.sacarIdConCif(Formulario.pedirCifHotel())));
				break;
				
			default:
				Menu.mensajeNoDisponible();
				break;
			}
		} while (opcion != Menu.SALIR);
			
	}
}
