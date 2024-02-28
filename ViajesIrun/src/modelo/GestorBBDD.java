package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GestorBBDD extends Conector{
	
	public Hotel getHotel(int id) {
		String sentenciaSelect = "SELECT * FROM hoteles WHERE id = ?";
		Hotel hotel = new Hotel();
		PreparedStatement preparedSt;
		
		try {
			preparedSt = con.prepareStatement(sentenciaSelect);
			preparedSt.setInt(1, id);
			ResultSet resultado = preparedSt.executeQuery();
			
			if (resultado.next()) {
				hotel.setId(resultado.getInt("id"));
				hotel.setCif(resultado.getString("cif"));
				hotel.setNombre(resultado.getString("nombre"));
				hotel.setGerente(resultado.getString("gerente"));
				hotel.setEstrellas(resultado.getInt("estrellas"));
				hotel.setCompañia(resultado.getString("compania"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return hotel;
	}
	
	public ArrayList<Cliente> getClientes() {
		String sentenciaSelect = "SELECT * FROM clientes";
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		try {
			Statement st = getCon().createStatement();
			ResultSet resultado = st.executeQuery(sentenciaSelect);
			
			while (resultado.next()) {
				Cliente cliente = new Cliente();
				cliente.setDni(resultado.getString("dni"));
				cliente.setNombre(resultado.getString("nombre"));
				cliente.setApellidos(resultado.getString("apellidos"));
				cliente.setDireccion(resultado.getString("direccion"));
				cliente.setLocalidad(resultado.getString("localidad"));
				
				clientes.add(cliente);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}
	
	public ArrayList<Hotel> getHoteles() {
		String sentenciaSelect = "SELECT * FROM hoteles";
		ArrayList <Hotel> hoteles = new ArrayList<Hotel>();
		
		Statement st;
		try {
			st = getCon().createStatement();
			ResultSet resultado = st.executeQuery(sentenciaSelect);
			
			while (resultado.next()) {
				Hotel hotel = new Hotel();
				hotel.setId(resultado.getInt("id"));
				hotel.setCif(resultado.getString("cif"));
				hotel.setNombre(resultado.getString("nombre"));
				hotel.setGerente(resultado.getString("gerente"));
				hotel.setEstrellas(resultado.getInt("estrellas"));
				hotel.setCompañia(resultado.getString("compania"));
				
				hoteles.add(hotel);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return hoteles;
	}
	
	public ArrayList<Habitacion> getHabitacionesConIdHotel(int id) {
		String sentenciaSelect = "SELECT * FROM habitaciones WHERE id_hotel = ?";
		ArrayList <Habitacion> habitaciones = new ArrayList<Habitacion>();
		PreparedStatement preparedSt;
		
		try {
			preparedSt = con.prepareStatement(sentenciaSelect);
			preparedSt.setInt(1, id);
			ResultSet resultado = preparedSt.executeQuery();
			
			while (resultado.next()) {
				Habitacion habitacion = new Habitacion();
				habitacion.setId(resultado.getInt("id"));
				habitacion.setIdHotel(resultado.getInt("id_hotel"));
				habitacion.setNumero(resultado.getString("numero"));
				habitacion.setDescripcion(resultado.getString("descripcion"));
				habitacion.setPrecio(resultado.getDouble("precio"));
				
				habitaciones.add(habitacion);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return habitaciones;
	}
	
	public void insertarCliente(Cliente cliente) {
		String sentenciaInsert = "INSERT INTO `clientes` (`dni`, `nombre`, `apellidos`, `direccion`, `localidad`) VALUES (?, ?, ?, ?, ?)";
		PreparedStatement preparedSt;
		
		try {
			preparedSt = con.prepareStatement(sentenciaInsert);
			preparedSt.setString(1, cliente.getDni());
			preparedSt.setString(2, cliente.getNombre());
			preparedSt.setString(3, cliente.getApellidos());
			preparedSt.setString(4, cliente.getDireccion());
			preparedSt.setString(5, cliente.getLocalidad());
			
			preparedSt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int sacarIdConCif(String cif) {
		int id = 0;
		String sentenciaSelect = "SELECT id FROM hoteles WHERE cif = ? ";
		
		try {
			PreparedStatement preparedSt = con.prepareStatement(sentenciaSelect);
			preparedSt.setString(1, cif);
			ResultSet resultado = preparedSt.executeQuery();
			
			if (resultado.next()) {
				id = resultado.getInt("id");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}
	
	
}
