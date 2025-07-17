package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dao.FolioEnviaDatosDscDao;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.Constantes;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.Estaticos;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.MetodosVarios;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.ObtenerPropiedades;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.mapper.IdFoliosCorreoElectronicoMapper;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.mapper.IdFoliosEnviaDatosDscMapper;

@Repository
public class FolioEnviaDatosDscDaoImpl implements FolioEnviaDatosDscDao {

	private final static Logger log = Logger
			.getLogger(FolioEnviaDatosDscDaoImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private ObtenerPropiedades propiedades = new ObtenerPropiedades(
			Constantes.NOMBRE_PROPERTIES_PROCESA_DATOS);

	public List obtenerInfoCorreoElectronicoTablaEnviaDatosDsc() {
		return obtenerInfoCorreoElectronicoTablaEnviaDatosDscPRV();
	}

	@Override
	public List obtenerDatosTablaEnviaDatosDsc() {
		return obtenerDatosTablaEnviaDatosDscPRV();
	}

	public List SelectEnviaDatosDsc(String querySelectEnviaDatosDsc) {
		return SelectEnviaDatosDscPRV(querySelectEnviaDatosDsc);
	}

	public int InsertEnviaDatosDsc(String queryInsertEnviaDatosDsc) {
		return InsertEnviaDatosDscPRV(queryInsertEnviaDatosDsc);
	}

	public int UpDate_P1_EnviaDatosDsc(String queryUpdateEnviaDatosDsc) {
		return UpdateEnviaDatosDscPRV(queryUpdateEnviaDatosDsc);

	}

	public int UpDate_P2_EnviaDatosDsc(String queryUpdateEnviaDatosDsc) {
		return UpdateEnviaDatosDscPRV(queryUpdateEnviaDatosDsc);

	}

	public int UpDate_P3_EnviaDatosDsc(String queryUpdateEnviaDatosDsc) {
		return UpdateEnviaDatosDscPRV(queryUpdateEnviaDatosDsc);
	}

	public int DeleteEnviaDatosDsc(String queryDeleteEnviaDatosDsc) {
		return DeleteEnviaDatosDscPRV(queryDeleteEnviaDatosDsc);
	}

	// *****************************************************************************************************************************************************************************************************************************************************

	private int DeleteEnviaDatosDscPRV(String queryDeleteEnviaDatosDsc) {
		int registrosAfectados = jdbcTemplate.update(queryDeleteEnviaDatosDsc);
		log.info("DeleteEnviaDatosDsc afectados...: " + registrosAfectados);

		return registrosAfectados;
	}

	private int UpdateEnviaDatosDscPRV(String queryUpdateEnviaDatosDsc) {

		int registrosAfectados = jdbcTemplate.update(queryUpdateEnviaDatosDsc);
		log.info("UpdateEnviaDatosDsc afectados...: " + registrosAfectados);

		return registrosAfectados;
	}

	private int InsertEnviaDatosDscPRV(String queryInsertEnviaDatosDsc) {

		int registrosAfectados = jdbcTemplate.update(queryInsertEnviaDatosDsc);
		log.info("InsertEnviaDatosDsc afectados...: " + registrosAfectados);

		return registrosAfectados;
	}

	private List SelectEnviaDatosDscPRV(String querySelectEnviaDatosDsc) {
		List folios = null;
		try {
			String sql = querySelectEnviaDatosDsc;

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

	private List obtenerInfoCorreoElectronicoTablaEnviaDatosDscPRV() {
		// 09:00:00 a 12:59:59 hrs HORARIO DE LA MAÑANA
		// 13:00:00 a 18:00:00 hrs HORARIO DE LA TARDE

		String varMarcaTiempoEntreHorario = MetodosVarios
				.MarcaTiempoEntreHorario();
		// ********************************************************************************
		if ((varMarcaTiempoEntreHorario.equalsIgnoreCase(""))) {
			log.info("NO LLEGO AL HORARIO DE LA MAÑANA");
			log.info("NO LLEGO AL HORARIO DE LA TARDE");
			log.info("ADIOS ...!!!!");
			System.exit(-1);
		}
		// ********************************************************************************

		List folios = null;
		String PaseTiempo = "";
		try {
			log.info(Estaticos.RutaEnviaDatosDscProperties);
			String sql = "";

			if ((varMarcaTiempoEntreHorario.equalsIgnoreCase("AM"))) {// 09:00:00
																		// a
																		// 12:59:59
																		// hrs
				sql = propiedades
						.obtenerPropiedades(Constantes.CONSULTA_INFO_CORREOELECTRONICO_ENVIADATOSDSC);
				PaseTiempo = "AM";
				log.info("||public List obtenerInfoCorreoElectronicoTablaEnviaDatosDscPRV() {||Constantes.CONSULTA_INFO_CORREOELECTRONICO_ENVIADATOSDSC ...: "
						+ Constantes.CONSULTA_INFO_CORREOELECTRONICO_ENVIADATOSDSC);
			} else if (varMarcaTiempoEntreHorario.equalsIgnoreCase("PM")) {// 13:00:00
																			// a
																			// 18:00:00
																			// hrs
				sql = propiedades
						.obtenerPropiedades(Constantes.CONSULTA_INFO_CORREOELECTRONICO_ENVIADATOSDSC_00);
				log.info("||public List obtenerInfoCorreoElectronicoTablaEnviaDatosDscPRV() {||Constantes.CONSULTA_INFO_CORREOELECTRONICO_ENVIADATOSDSC_00 ...: "
						+ Constantes.CONSULTA_INFO_CORREOELECTRONICO_ENVIADATOSDSC_00);
				PaseTiempo = "PM";
			}
			log.info("||public List obtenerInfoCorreoElectronicoTablaEnviaDatosDscPRV() {||sql ...:"
					+ sql);
			log.info("||public List obtenerInfoCorreoElectronicoTablaEnviaDatosDscPRV() {||new IdFoliosEnviaDatosDscMapper()}");

			folios = jdbcTemplate.query(sql,
					new IdFoliosCorreoElectronicoMapper(PaseTiempo));

			log.info("folios.isEmpty()        ...:" + folios.isEmpty());
			log.info("folios.size()           ...:" + folios.size());
			log.info("folios.toArray().length ...:" + folios.toArray().length);

		} catch (Exception e) {
			e.printStackTrace();
			log.error("||public List obtenerInfoCorreoElectronicoTablaEnviaDatosDscPRV(){||Ocurrio un error al consultar folios ...:\n"
					+ e.getMessage());
		}
		return folios;
	}

	private List obtenerDatosTablaEnviaDatosDscPRV() {
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
			log.info(Estaticos.RutaEnviaDatosDscProperties);
			String sql = "";

			String varMarcaTiempoEntreHorario = MetodosVarios
					.MarcaTiempoEntreHorario();
			if ((varMarcaTiempoEntreHorario.equalsIgnoreCase("AM"))) {// 09:00:00
																		// a
																		// 12:59:59
																		// hrs
				sql = propiedades
						.obtenerPropiedades(Constantes.CONSULTA_INFO_ENVIADATOSDSC);
				log.info("||public List obtenerDatosTablaEnviaDatosDscPRV() {||Constantes.CONSULTA_INFO_ENVIADATOSDSC ...: "
						+ Constantes.CONSULTA_INFO_ENVIADATOSDSC);
				log.info("||public List obtenerDatosTablaEnviaDatosDscPRV() {||sql ...:"
						+ sql);
			} else if (varMarcaTiempoEntreHorario.equalsIgnoreCase("PM")) {// 13:00:00
																			// a
																			// 18:00:00
																			// hrs
				sql = propiedades
						.obtenerPropiedades(Constantes.CONSULTA_INFO_ENVIADATOSDSC_00);
				log.info("||public List obtenerDatosTablaEnviaDatosDscPRV() {||Constantes.CONSULTA_INFO_ENVIADATOSDSC00 ...: "
						+ Constantes.CONSULTA_INFO_ENVIADATOSDSC_00);
				log.info("||public List obtenerDatosTablaEnviaDatosDscPRV() {||sql ...:"
						+ sql);
			}
			log.info("||public List obtenerDatosTablaEnviaDatosDscPRV() {||new IdFoliosEnviaDatosDscMapper()}");

			folios = jdbcTemplate.query(sql, new IdFoliosEnviaDatosDscMapper());

			log.info("folios.isEmpty()        ...:" + folios.isEmpty());
			log.info("folios.size()           ...:" + folios.size());
			log.info("folios.toArray().length ...:" + folios.toArray().length);

		} catch (Exception e) {
			e.printStackTrace();
			log.error("||public List obtenerDatosTablaEnviaDatosDscPRV(){||Ocurrio un error al consultar folios ...:\n"
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
