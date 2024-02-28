package controlador;

import java.util.Scanner;

import modelo.GestorBBDD;
import vista.Formulario;
import vista.Menu;
import vista.Visor;

public class GestorClientes {
	public static Scanner scan = new Scanner(System.in);
	
	public static void run() {
		int opcion;
		GestorBBDD gestorBBDD = new GestorBBDD();
		do {
			Menu.mostrarMenuClientes();
			opcion = scan.nextInt();
			
			switch (opcion) {
			case Menu.SALIR:
				Menu.mensajeSalir();
				break;
				
			case Menu.VISUALIZAR_CLIENTES:
				gestorBBDD.Conectar();
				Visor.mostrarClientes(gestorBBDD.getClientes());
				gestorBBDD.cerrar();
				break;
				
			case Menu.REGISTRAR_CLIENTES:
				gestorBBDD.Conectar();
				gestorBBDD.insertarCliente(Formulario.pedirDatosCliente(scan));
				gestorBBDD.cerrar();
				break;
				
			default:
				Menu.mensajeNoDisponible();
				break;
			}
		} while (opcion != Menu.SALIR);
		
	}

}
