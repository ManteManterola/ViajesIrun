package modelo;

import java.util.Scanner;

import controlador.GestorClientes;
import controlador.GestorHoteles;
import vista.Menu; 

public class GestorViajesIrun {
	public static Scanner scan = new Scanner(System.in);
	
	public static void run() {
		int opcion;
		do {
			Menu.mostrarMenuPrincipal();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.SALIR:
				break;
				
			case Menu.GESTIONAR_CLIENTES:
				GestorClientes.run();
				break;
				
			case Menu.GESTIONAR_HOTELES:
				GestorHoteles.run();
				break;

			default:
				Menu.mensajeNoDisponible();
				break;
			}
		} while (opcion!=Menu.SALIR);
		Menu.mensajeSalir();
	}
}
