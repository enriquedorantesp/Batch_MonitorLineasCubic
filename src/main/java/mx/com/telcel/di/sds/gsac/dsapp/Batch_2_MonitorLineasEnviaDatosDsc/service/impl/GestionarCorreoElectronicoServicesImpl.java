package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.correoElectronico.FuncionesCorreoElectronico;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.correoElectronico.ServidorDestino;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dao.FolioEnviaDatosDscDao;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dto.FoliosCorreoElectronicoEnviaDatosDscDto;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.MetodosVarios;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.service.GestionarCorreoElectronicoServices;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.service.ProcesaInformacionService;

@Service
public class GestionarCorreoElectronicoServicesImpl implements
		GestionarCorreoElectronicoServices {
	private final static Logger log = Logger
			.getLogger(GestionarCorreoElectronicoServicesImpl.class);
	@Autowired
	private FolioEnviaDatosDscDao foliosEnviaDatosDscDao;
	@Autowired
	private ProcesaInformacionService pis;

	@SuppressWarnings("unchecked")
	public void mandarCorreoLineaEmpresa() {
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

		List<FoliosCorreoElectronicoEnviaDatosDscDto> RegistrosfoliosEnviaDatosDsc = null;

		log.info("Procesando registros creados tabla ENVIADATOSDSC...");

		RegistrosfoliosEnviaDatosDsc = foliosEnviaDatosDscDao
				.obtenerInfoCorreoElectronicoTablaEnviaDatosDsc();

		ServidorDestino servidor = FuncionesCorreoElectronico
				.obtieneServidorDestino();
		pis.enviaCorreoElectronico(RegistrosfoliosEnviaDatosDsc, servidor);
		log.info("Registros procesados y reporte enviado de tabla ENVIADATOSDSC...");
		System.exit(0);
	}

	public void mandarCorreoLineaEmpresaPorFecha(Date fechaInicial,
			Date fechaFinal) {

	}

	public FolioEnviaDatosDscDao getFoliosEnviaDatosDscDao() {
		return foliosEnviaDatosDscDao;
	}

	public void setFoliosEnviaDatosDscDao(
			FolioEnviaDatosDscDao foliosEnviaDatosDscDao) {
		this.foliosEnviaDatosDscDao = foliosEnviaDatosDscDao;
	}
}
