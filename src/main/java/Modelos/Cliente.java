package Modelos;

public class Cliente {
	private int codigoCliente;
	private String nombreCliente;
	private String contactoCliente;
	private String apellidoCLiente;
	private String telefonoCliente;
	private String faxCliente;
	private String direccionCliente;
	private String direccion2Cliente;
	private String ciudadCliente;
	private String regionCliente;
	private String paisCliente;
	private String codigoPostalCliente;
	private int codigoEmpleadoRepVentas;
	private double limiteCredito;

	public Cliente(int codigoCliente, String nombreCliente, String apellidoCLiente) {
		super();
		this.codigoCliente = codigoCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCLiente = apellidoCLiente;
	}

	public Cliente(int codigoCliente, String nombreCliente, String contactoCliente, String apellidoCLiente,
			String telefonoCliente, String faxCliente, String direccionCliente, String direccion2Cliente,
			String ciudadCliente, String regionCliente, String paisCliente, String codigoPostalCliente,
			int codigoEmpleadoRepVentas, double limiteCredito) {
		this.codigoCliente = codigoCliente;
		this.nombreCliente = nombreCliente;
		this.contactoCliente = contactoCliente;
		this.apellidoCLiente = apellidoCLiente;
		this.telefonoCliente = telefonoCliente;
		this.faxCliente = faxCliente;
		this.direccionCliente = direccionCliente;
		this.direccion2Cliente = direccion2Cliente;
		this.ciudadCliente = ciudadCliente;
		this.regionCliente = regionCliente;
		this.paisCliente = paisCliente;
		this.codigoPostalCliente = codigoPostalCliente;
		this.codigoEmpleadoRepVentas = codigoEmpleadoRepVentas;
		this.limiteCredito = limiteCredito;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public String getContactoCliente() {
		return contactoCliente;
	}

	public String getApellidoCLiente() {
		return apellidoCLiente;
	}

	public String getTelefonoCliente() {
		return telefonoCliente;
	}

	public String getFaxCliente() {
		return faxCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public String getDireccion2Cliente() {
		return direccion2Cliente;
	}

	public String getCiudadCliente() {
		return ciudadCliente;
	}

	public String getRegionCliente() {
		return regionCliente;
	}

	public String getPaisCliente() {
		return paisCliente;
	}

	public String getCodigoPostalCliente() {
		return codigoPostalCliente;
	}

	public int getCodigoEmpleadoRepVentas() {
		return codigoEmpleadoRepVentas;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	@Override
	public String toString() {
		return "Cliente [codigoCliente=" + codigoCliente + ", nombreCliente=" + nombreCliente + ", contactoCliente="
				+ contactoCliente + ", apellidoCLiente=" + apellidoCLiente + ", telefonoCliente=" + telefonoCliente
				+ ", faxCliente=" + faxCliente + ", direccionCliente=" + direccionCliente + ", direccion2Cliente="
				+ direccion2Cliente + ", ciudadCliente=" + ciudadCliente + ", regionCliente=" + regionCliente
				+ ", paisCliente=" + paisCliente + ", codigoPostalCliente=" + codigoPostalCliente
				+ ", codigoEmpleadoRepVentas=" + codigoEmpleadoRepVentas + ", limiteCredito=" + limiteCredito + "]";
	}
}