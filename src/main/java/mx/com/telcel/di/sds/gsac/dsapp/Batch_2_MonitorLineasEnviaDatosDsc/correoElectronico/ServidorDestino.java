package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.correoElectronico;

public class ServidorDestino {

	private String nombre;
	private String ambiente;
	private String ip;
	private String puerto;
	private String usuario;
	private String contraseña;
	private String destinatarios;
	private String directorio;
	private String nombreArchivo;
	private String rutaFinalArchivo;

	@Override
	public String toString() {
		return "ServidorDestino [nombre=" + nombre + ", ambiente=" + ambiente
				+ ", ip=" + ip + ", puerto=" + puerto + ", usuario=" + usuario
				+ ", contraseña=" + contraseña + ", destinatarios="
				+ destinatarios + ", directorio=" + directorio
				+ ", nombreArchivo=" + nombreArchivo + ", rutaFinalArchivo="
				+ rutaFinalArchivo + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPuerto() {
		return puerto;
	}

	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getDestinatarios() {
		return destinatarios;
	}

	public void setDestinatarios(String destinatarios) {
		this.destinatarios = destinatarios;
	}

	public String getDirectorio() {
		return directorio;
	}

	public void setDirectorio(String directorio) {
		this.directorio = directorio;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public String getRutaFinalArchivo() {
		return rutaFinalArchivo;
	}

	public void setRutaFinalArchivo(String rutaFinalArchivo) {
		this.rutaFinalArchivo = rutaFinalArchivo;
	}
}
