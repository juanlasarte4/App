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
	private TipoDocumento tipoDocumento;
	private String documento;
	private String email;
	private String password;

	public Cliente(int codigoCliente, String nombreCliente, String contactoCliente, String apellidoCLiente,
			String telefonoCliente, String faxCliente, String direccionCliente, String direccion2Cliente,
			String ciudadCliente, String regionCliente, String paisCliente, String codigoPostalCliente,
			int codigoEmpleadoRepVentas, double limiteCredito, TipoDocumento tipoDocumento, String documento, String email, String password) {
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
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
		this.email = email;
		this.password = password;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public void setContactoCliente(String contactoCliente) {
		this.contactoCliente = contactoCliente;
	}

	public void setApellidoCLiente(String apellidoCLiente) {
		this.apellidoCLiente = apellidoCLiente;
	}

	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	public void setFaxCliente(String faxCliente) {
		this.faxCliente = faxCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public void setDireccion2Cliente(String direccion2Cliente) {
		this.direccion2Cliente = direccion2Cliente;
	}

	public void setCiudadCliente(String ciudadCliente) {
		this.ciudadCliente = ciudadCliente;
	}

	public void setRegionCliente(String regionCliente) {
		this.regionCliente = regionCliente;
	}

	public void setPaisCliente(String paisCliente) {
		this.paisCliente = paisCliente;
	}

	public void setCodigoPostalCliente(String codigoPostalCliente) {
		this.codigoPostalCliente = codigoPostalCliente;
	}

	public void setCodigoEmpleadoRepVentas(int codigoEmpleadoRepVentas) {
		this.codigoEmpleadoRepVentas = codigoEmpleadoRepVentas;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
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
				+ ", codigoEmpleadoRepVentas=" + codigoEmpleadoRepVentas + ", limiteCredito=" + limiteCredito
				+ ", tipoDocumento=" + tipoDocumento + ", documento=" + documento + ", email=" + email + ", password=" + password
				+ "]";
	}
}