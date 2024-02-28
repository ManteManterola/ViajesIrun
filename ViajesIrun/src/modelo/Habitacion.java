package modelo;

public class Habitacion {

	private int id;
	private int idHotel;
	private String numero;
	private String descripcion;
	private Double precio;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Habitacion [id=" + id + ", idHotel=" + idHotel + ", numero=" + numero + ", descripcion=" + descripcion
				+ ", precio=" + precio + "]";
	}

	
}
