package vista;

import java.util.Scanner;

public class Menu {

	Scanner scan = new Scanner(System.in);
	
	//Finals de las opciones del menu principal
	public static final int SALIR = 0;
	public static final int GESTIONAR_CLIENTES = 1;
	public static final int GESTIONAR_HOTELES = 2;
	
	//Finals de las opciones del menu clientes
	public static final int VISUALIZAR_CLIENTES = 1;
	public static final int REGISTRAR_CLIENTES = 2;
	
	//Finals de las opciones del menu hoteles
	public static final int VISUALIZAR_HOTELES = 1;
	public static final int VISUALIZAR_HOTELES_CON_HABITACIONES = 2;
	
	
	public static void mostrarMenuPrincipal() {
		System.out.println("----Menu Principal----");
		System.out.println(SALIR + ". Salir");
		System.out.println(GESTIONAR_CLIENTES + ". Gestionar clientes");
		System.out.println(GESTIONAR_HOTELES + ". Gestionar hoteles");
	}
	
	public static void mostrarMenuClientes() {
		System.out.println("----Menu Clientes----");
		System.out.println(VISUALIZAR_CLIENTES + ". Visualizar todos los clientes");
		System.out.println(REGISTRAR_CLIENTES + ". Registrar un cliente");
	}
	
	public static void mostrarMenuHoteles() {
		System.out.println("----Menu Hoteles----");
		System.out.println(VISUALIZAR_HOTELES + ".Visualizar todos los hoteles");
		System.out.println(VISUALIZAR_HOTELES_CON_HABITACIONES + ".Visualizar todas las habitaciones de un hotel");
	}
	
	public static void mensajeSalir() {
		System.out.println("SALIENDO DEL MENU");
	}
	
	public static void mensajeNoDisponible() {
		System.out.println("OPCION NO DISPONIBLE");
	}
}
