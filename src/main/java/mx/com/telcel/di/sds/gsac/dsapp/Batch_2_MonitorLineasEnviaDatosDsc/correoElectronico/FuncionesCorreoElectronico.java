package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.correoElectronico;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.Constantes;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.ObtenerPropiedades;

public class FuncionesCorreoElectronico {

	private static ObtenerPropiedades propiedades = new ObtenerPropiedades(
			Constantes.NOMBRE_PROPERTIES_CORREO);

	public static ServidorDestino obtieneServidorDestino() {
		ServidorDestino servidor = new ServidorDestino();

		servidor.setNombre(propiedades
				.obtenerPropiedades(Constantes.SERVER_NOMBRE));
		servidor.setAmbiente(propiedades
				.obtenerPropiedades(Constantes.SERVER_AMBIENTE));
		servidor.setIp(propiedades.obtenerPropiedades(Constantes.SERVER_IP));
		servidor.setPuerto(propiedades
				.obtenerPropiedades(Constantes.SERVER_PUERTO));
		servidor.setUsuario(propiedades
				.obtenerPropiedades(Constantes.SERVER_USUARIO));
		servidor.setContraseña(propiedades
				.obtenerPropiedades(Constantes.SERVER_CONTRASEÑA));
		servidor.setDirectorio(propiedades
				.obtenerPropiedades(Constantes.SERVER_DIRECTORIO));
		servidor.setDestinatarios(propiedades
				.obtenerPropiedades(Constantes.SERVER_DESTINATARIOS));

		return servidor;
	}
}
