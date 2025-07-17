package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dao.FolioDetalleSolactDao;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.Constantes;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.MetodosVarios;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.ObtenerPropiedades;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.mapper.IdFoliosSisactMapper;

@Repository
public class FolioDetalleSolactDaoImpl implements FolioDetalleSolactDao {

	private final static Logger log = Logger
			.getLogger(FolioDetalleSolactDaoImpl.class);
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private ObtenerPropiedades propiedades = new ObtenerPropiedades(
			Constantes.NOMBRE_PROPERTIES_PROCESA_DATOS);

	@Override
	public List ObtenerDatosTablasSisact(String folioSisactEnviaDatosDsc) {
		// 09:00:00 a 12:59:59 hrs HORARIO DE LA MAÑANA
		// 13:00:00 a 18:00:00 hrs HORARIO DE LA TARDE

		if ((MetodosVarios.MarcaTiempoEntreHorario().equalsIgnoreCase(""))) {
			log.info("NO LLEGO AL HORARIO DE LA MAÑANA");
			log.info("NO LLEGO AL HORARIO DE LA TARDE");
			log.info("ADIOS ...!!!!");
			System.exit(-1);
		}

		List folios = null;
		try {
			String sql = "";

			String varMarcaTiempoEntreHorario = MetodosVarios
					.MarcaTiempoEntreHorario();
			if ((varMarcaTiempoEntreHorario.equalsIgnoreCase("AM"))) {// 09:00:00
																		// a
																		// 12:59:59
																		// hrs
				sql = propiedades
						.obtenerPropiedades(Constantes.CONSULTA_INFO_DETALLESOLACT);
				sql += folioSisactEnviaDatosDsc;
				log.info("||public List obtenerDatosTablaEnviaDatosDsc() {||Constantes.CONSULTA_INFO_DETALLESOLACT ...: "
						+ Constantes.CONSULTA_INFO_DETALLESOLACT);
				log.info("||public List obtenerDatosTablaEnviaDatosDsc() {||sql ...:"
						+ sql);
			} else if (varMarcaTiempoEntreHorario.equalsIgnoreCase("PM")) {// 13:00:00
																			// a
																			// 18:00:00
																			// hrs
				sql = propiedades
						.obtenerPropiedades(Constantes.CONSULTA_INFO_DETALLESOLACT_00);
				sql += folioSisactEnviaDatosDsc;
				log.info("||public List obtenerDatosTablaEnviaDatosDsc() {||Constantes.CONSULTA_INFO_DETALLESOLACT_00 ...: "
						+ Constantes.CONSULTA_INFO_DETALLESOLACT_00);
				log.info("||public List obtenerDatosTablaEnviaDatosDsc() {||sql ...:"
						+ sql);
			}
			log.info("||public List obtenerDatosTablasSisact() {||new IdFoliosSisactMapper()}");

			folios = jdbcTemplate.query(sql, new IdFoliosSisactMapper());

			log.info("folios.isEmpty()        ...:" + folios.isEmpty());
			log.info("folios.size()           ...:" + folios.size());
			log.info("folios.folios.toArray() ...:" + folios.toArray().length);

		} catch (Exception e) {
			e.printStackTrace();
			log.error("||public List obtenerDatosTablasSisact(){||Ocurrio un error al consultar folios ...:\n"
					+ e.getMessage());
		}
		return folios;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
