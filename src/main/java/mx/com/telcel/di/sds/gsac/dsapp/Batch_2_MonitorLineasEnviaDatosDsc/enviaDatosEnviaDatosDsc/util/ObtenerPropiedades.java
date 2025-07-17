package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ObtenerPropiedades {

	private final static Logger log = Logger
			.getLogger(ObtenerPropiedades.class);
	private String nombreArchivo;

	public ObtenerPropiedades(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

	public String obtenerPropiedades(String propiedad) {
		Properties prop = new Properties();
		InputStream inputStream = getClass().getClassLoader()
				.getResourceAsStream(nombreArchivo);
		try {
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("no se encontro el archivo '"
						+ nombreArchivo + "'");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop.getProperty(propiedad);
	}

	public String Existe() {
		String RespuestaValidaExistencia = "";

		String filePath = nombreArchivo;
		File file = new File(filePath);

		if (file.exists()) {
			log.info("El archivo existe.");
			RespuestaValidaExistencia = nombreArchivo;
		} else {
			log.info("El archivo no existe.");
			RespuestaValidaExistencia = "";
		}

		return RespuestaValidaExistencia;
	}

	public boolean ValidaExistencia() {
		boolean RespuestaValidaExistencia = false;

		String filePath = nombreArchivo;
		File file = new File(filePath);

		if (file.exists()) {
			log.info("El archivo existe.");
			RespuestaValidaExistencia = true;
		} else {
			log.info("El archivo no existe.");
			RespuestaValidaExistencia = false;
		}

		return RespuestaValidaExistencia;
	}
}
