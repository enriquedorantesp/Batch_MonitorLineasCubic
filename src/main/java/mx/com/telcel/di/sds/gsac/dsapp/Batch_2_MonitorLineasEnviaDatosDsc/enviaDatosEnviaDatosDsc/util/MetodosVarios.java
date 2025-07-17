package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util;

import java.util.Calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dao.FolioEnviaDatosDscDao;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dto.FoliosCorreoElectronicoEnviaDatosDscDto;

import org.apache.log4j.Logger;

public class MetodosVarios {

	private static Logger log = Logger.getLogger(MetodosVarios.class.getName());

	public static String ObtenerMarcaTiempo() {
		String RespuestaMarcaTiempo;

		Calendar c = Calendar.getInstance();
		c.setTimeInMillis((long) System.currentTimeMillis());

		RespuestaMarcaTiempo = String.format("%02d:%02d:%02d",
				(c.get(Calendar.HOUR_OF_DAY)), (c.get(Calendar.MINUTE)),
				(c.get(Calendar.SECOND)));
		log.info("RespuestaMarcaTiempo ...:" + RespuestaMarcaTiempo);

		return RespuestaMarcaTiempo;
	}

	public static String ObtenerFecha() {
		String RespuestaObtenerFecha;

		Calendar c = Calendar.getInstance();
		c.setTimeInMillis((long) System.currentTimeMillis());

		RespuestaObtenerFecha = String.format("%04d-%02d-%02d-",
				(c.get(Calendar.YEAR)), (c.get(Calendar.MONTH) + 1),
				(c.get(Calendar.DAY_OF_MONTH)));
		log.info("RespuestaObtenerFecha ...:" + RespuestaObtenerFecha);

		return RespuestaObtenerFecha;
	}

	public static String ObtenerFechaTiempo() {
		String RespuestaObtenerFechaTiempo;

		Calendar c = Calendar.getInstance();
		c.setTimeInMillis((long) System.currentTimeMillis());

		// 2024-01-30 11:45:00 EJEMPLO
		RespuestaObtenerFechaTiempo = String.format(
				"%04d-%02d-%02d %02d:%02d:%02d", (c.get(Calendar.YEAR)),
				(c.get(Calendar.MONTH) + 1), (c.get(Calendar.DAY_OF_MONTH)),
				(c.get(Calendar.HOUR_OF_DAY)), (c.get(Calendar.MINUTE)),
				(c.get(Calendar.SECOND)));

		return RespuestaObtenerFechaTiempo;
	}

	public static String IdFechaTiempo() {
		String RespuestaIdFechaTiempo;

		Calendar c = Calendar.getInstance();
		c.setTimeInMillis((long) System.currentTimeMillis());

		RespuestaIdFechaTiempo = String.format("%04d%02d%02d%02d%02d%02d%03d",
				(c.get(Calendar.YEAR)), (c.get(Calendar.MONTH) + 1),
				(c.get(Calendar.DAY_OF_MONTH)), (c.get(Calendar.HOUR_OF_DAY)),
				(c.get(Calendar.MINUTE)), (c.get(Calendar.SECOND)),
				(c.get(Calendar.MILLISECOND)));

		return RespuestaIdFechaTiempo;
	}

	public static String MarcaTiempoEntreHorario() {

		String RespuestaMarcaTiempoEntreHorario;
		Calendar MarcaTiempo = Calendar.getInstance();
		MarcaTiempo.setTimeInMillis((long) System.currentTimeMillis());

		RespuestaMarcaTiempoEntreHorario = String.format("%02d:%02d:%02d",
				(MarcaTiempo.get(Calendar.HOUR_OF_DAY)),
				(MarcaTiempo.get(Calendar.MINUTE)),
				(MarcaTiempo.get(Calendar.SECOND)));
		System.out.println("RespuestaMarcaTiempoEntreHorario ...:"
				+ RespuestaMarcaTiempoEntreHorario);

		Calendar calendario = Calendar.getInstance();

		int horaActual = calendario.get(Calendar.HOUR_OF_DAY);
		int minutosActual = calendario.get(Calendar.MINUTE);
		int segundosActual = calendario.get(Calendar.SECOND);

		// DEFINIR LAS HORAS DE INICIO Y FIN PRIMER BLOQUE 09:00:00 a 12:59:59
		// HRS
		int horaInicioAM = 9;
		int minutosInicioAM = 00;
		int segundosInicioAM = 00;

		int horaFinAM = 12;// 12-13
		int minutosFinAM = 59;// 59-05
		int segundosFinAM = 59;

		// DEFINIR LAS HORAS DE INICIO Y FIN SEGUNDO BLOQUE 13:00:00 a 17:59:59
		// HRS
		int horaInicioPM = 13;
		int minutosInicioPM = 00;
		int segundosInicioPM = 00;

		int horaFinPM = 18;// 17-18
		int minutosFinPM = 59;// 59-05
		int segundosFinPM = 59;

		if (horaActual >= horaInicioAM && horaActual <= horaFinAM
				&& minutosActual >= minutosInicioAM
				&& minutosActual <= minutosFinAM
				&& segundosActual >= segundosInicioAM
				&& segundosActual <= segundosFinAM) {
			log.info("El tiempo AM "
					+ horaActual
					+ ":"
					+ minutosActual
					+ ":"
					+ segundosActual
					+ " actual está entre las horas:minuto:segundo de inicio y fin 02.");
			RespuestaMarcaTiempoEntreHorario = "AM";

		} else if (horaActual >= horaInicioPM && horaActual <= horaFinPM
				&& minutosActual >= minutosInicioPM
				&& minutosActual <= minutosFinPM
				&& segundosActual >= segundosInicioPM
				&& segundosActual <= segundosFinPM) {
			log.info("El tiempo PM "
					+ horaActual
					+ ":"
					+ minutosActual
					+ ":"
					+ segundosActual
					+ " actual está entre las horas:minuto:segundo de inicio y fin 02.");
			RespuestaMarcaTiempoEntreHorario = "PM";

		} else {
			log.info("La hora " + horaActual + ":" + minutosActual + ":"
					+ segundosActual
					+ " actual NO está entre las horas de inicio y fin.");
			RespuestaMarcaTiempoEntreHorario = "";
		}
		log.info("RespuestaMarcaTiempoEntreHorario ...:"
				+ RespuestaMarcaTiempoEntreHorario);

		return RespuestaMarcaTiempoEntreHorario;
	}

	public static String validaNull(String str) {
		String srcs = str;
		if (srcs == null) {
			srcs = "";
		}
		return srcs.trim();
	}

	public static int validaNull(Integer in) {
		Integer srcs = in;
		if (srcs == null) {
			srcs = 0;
		}
		return srcs;
	}

	public static double validaNull(Double in) {
		Double srcs = in;
		if (srcs == null) {
			srcs = 0.00;
		}
		return srcs;
	}

	public static String getFechaHoraRequest() {
		return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS")
				.format(new Date());
	}

	public static int getTimeOut() {
		int defaultValueTimeOut = 10000;

		try {

		} catch (NumberFormatException ex) {
			return defaultValueTimeOut;
		} catch (Exception ex) {
			return defaultValueTimeOut;
		}

		return defaultValueTimeOut;
	}

	public static int EjecutaActualizacionReporteEnviaDatosDsc(
			FoliosCorreoElectronicoEnviaDatosDscDto registro) {
		int RespuestaEjecutaActualizacionReporteEnviaDatosDsc = 0;
		FolioEnviaDatosDscDao foliosEnviaDatosDscDao0 = null;

		if (registro.getUpDateReportePM() == null) {
			// EJECUTA UPDATE: REGISTRO EN ENVIADATOSDSC REPORTE EN AM
			RespuestaEjecutaActualizacionReporteEnviaDatosDsc = foliosEnviaDatosDscDao0
					.UpDate_P1_EnviaDatosDsc(registro.getUpDateReporteAM());
		} else {
			// EJECUTA UPDATE: REGISTRO EN ENVIADATOSDSC REPORTE EN AM
			RespuestaEjecutaActualizacionReporteEnviaDatosDsc = foliosEnviaDatosDscDao0
					.UpDate_P1_EnviaDatosDsc(registro.getUpDateReportePM());
		}

		return RespuestaEjecutaActualizacionReporteEnviaDatosDsc;
	}

}