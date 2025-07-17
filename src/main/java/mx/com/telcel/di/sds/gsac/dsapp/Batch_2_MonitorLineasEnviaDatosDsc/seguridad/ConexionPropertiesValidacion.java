package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.seguridad;

import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.mapper.IdFoliosEnviaDatosDscMapper;

@Repository
public class ConexionPropertiesValidacion {
	private final static Logger log = Logger
			.getLogger(ConexionPropertiesValidacion.class);
	@Autowired
	private static JdbcTemplate jdbcTemplate;

	public static String ValidacionPropertiesConexion() {
		String RespuestaValidacionPropertiesConexion = "";

		return RespuestaValidacionPropertiesConexion;
	}

	private static List SelectList(String query) {
		List folios = null;
		try {
			String sql = query;

			log.info("||public List SelectEnviaDatosDsc() {||sql ...:" + sql);

			folios = jdbcTemplate.query(sql, new IdFoliosEnviaDatosDscMapper());

			log.info("folios.isEmpty()        ...:" + folios.isEmpty());
			log.info("folios.size()           ...:" + folios.size());
			log.info("folios.toArray().length ...:" + folios.toArray().length);

		} catch (Exception e) {
			e.printStackTrace();
			log.error("||public List SelectEnviaDatosDsc(){||Ocurrio un error al consultar folios ...:\n"
					+ e.getMessage());
		}
		return folios;

	}

	private static String Select(String query) {
		String RespuestaSelect = "";

		return RespuestaSelect;

	}

	public static Properties ElPropiedades(String nombreArchivo) {
		Properties prop = new Properties();

		return prop;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
