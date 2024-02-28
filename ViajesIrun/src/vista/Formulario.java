package vista;

import java.util.Scanner;

import modelo.Cliente;

public class Formulario {

	static Scanner scan = new Scanner(System.in);
	
	public static Cliente pedirDatosCliente(Scanner scan) {
		Cliente cliente = new Cliente();
		
		System.out.println("Introduce el DNI");
		cliente.setDni(scan.next());
		
		System.out.println("Introduce el nombre");
		cliente.setNombre(scan.next());
		
		System.out.println("Introduce los apellidos");
		cliente.setApellidos(scan.next());
		
		System.out.println("Intruduce la direccion");
		cliente.setDireccion(scan.next());
		
		System.out.println("Introduce la localidad");
		cliente.setLocalidad(scan.next());
		
		return cliente;
	}
	
	public static String pedirCifHotel() {
		String cif;
		System.out.println("Introduzca el CIF del hotel");
		cif = scan.next();
		
		return cif;
	}
}
