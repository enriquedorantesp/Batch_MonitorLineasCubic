package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dto.FoliosEnviaDatosDscDto;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.mapper.IdFoliosEnviaDatosDscMapper;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.mapper.IdFoliosSisactMapper;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BaseDeDatos {

	private final static Logger log = Logger.getLogger(BaseDeDatos.class);
	@Autowired
	private static JdbcTemplate jdbcTemplate;

	// @Override
	public static List SelectDetalleSolact(String sql) {
		return jdbcTemplate.query(sql, new IdFoliosSisactMapper());
	}

	// @Override
	public static List SelectEnviaDatosDsc(String sql) {
		List<FoliosEnviaDatosDscDto> lista;
		lista = jdbcTemplate.query(sql, new IdFoliosEnviaDatosDscMapper());
		return lista;

	}

	// @Override
	public static void InsertEnviaDatosDsc(String sql) {
		int registrosAfectados = jdbcTemplate.update(sql);
		log.info("InsertEnviaDatosDsc afectados...: " + registrosAfectados);
	}

	public static JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public static void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		BaseDeDatos.jdbcTemplate = jdbcTemplate;
	}
}
