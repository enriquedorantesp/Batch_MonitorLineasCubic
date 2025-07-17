package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.service.impl;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.Constantes;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.Estaticos;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.MetodosVarios;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.seguridad.Cifrar;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.service.EstatusInicialEnviaDatosDscService;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.service.impl.EstatusInicialEnviaDatosDscServiceImpl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class EstatusInicialEnviaDatosDscServiceImpl implements
		EstatusInicialEnviaDatosDscService {
	private final static Logger log = Logger
			.getLogger(EstatusInicialEnviaDatosDscServiceImpl.class);

	@Override
	public void actualizarEstatusInicialEnviaDatosDsc() {
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

		log.info("Venimos DESDE IniciaBatch.actualizaEstatusFolioCorporativo - llegamos al proceso EstatusInicialVonafoneServiceImpl.actualizarEstatusInicialVonafone");
		log.info("METER EL INSERT DE INICIO DE JAR AQUI");

	}

	@Override
	public void inicializaProperties() {
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

		System.out.println("Estaticos.RutaEnviaDatosDscProperties ...: "
				+ Estaticos.RutaEnviaDatosDscProperties);
		Estaticos.RutaEnviaDatosDscProperties = "1234567890";
		System.out.println("Estaticos.RutaEnviaDatosDscProperties ...: "
				+ Estaticos.RutaEnviaDatosDscProperties);
		System.out.println("Constantes.NOMBRE_PROPERTIES_PROCESA_DATOS ...: "
				+ Constantes.NOMBRE_PROPERTIES_PROCESA_DATOS);

		try {
			log.info(Cifrar.desencriptar("VKqss2S7c/WVwwEXFeOgvQ=="));

		} catch (Exception e) {
			e.printStackTrace();
			log.error("HAY ERROR ...!!!!");
		}
	}
}
