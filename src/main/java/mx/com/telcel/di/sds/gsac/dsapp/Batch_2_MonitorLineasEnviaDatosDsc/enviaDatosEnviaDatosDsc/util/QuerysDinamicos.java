package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util;

import java.util.List;

import org.apache.log4j.Logger;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dto.FolioSisactDto;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dto.FoliosEnviaDatosDscDto;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.beans.InfoUpDateEnviaDatosDscBean;

public class QuerysDinamicos {
	private final static Logger log = Logger.getLogger(QuerysDinamicos.class);
	private ObtenerPropiedades propiedades00 = new ObtenerPropiedades(
			"db.properties");

	public static String ArmaDeletefoliosEnviaDatosDsc(
			List<FoliosEnviaDatosDscDto> listaElementos) {
		String RespuestaArmaDeletefoliosEnviaDatosDsc = "";
		RespuestaArmaDeletefoliosEnviaDatosDsc = ArmaQueryDeletefoliosEnviaDatosDsc(listaElementos);
		return RespuestaArmaDeletefoliosEnviaDatosDsc;
	}

	public static String ArmaInsertAEnviaDatosDsc(FolioSisactDto elemento) {
		InfoUpDateEnviaDatosDscBean IudvB = new InfoUpDateEnviaDatosDscBean(
				elemento);
		String RespuestaArmaInsertAEnviaDatosDsc = "";
		RespuestaArmaInsertAEnviaDatosDsc = ArmaQueryInsertAEnviaDatosDsc(IudvB);
		return RespuestaArmaInsertAEnviaDatosDsc;
	}

	public static String ArmaSelect_P123_AEnviaDatosDsc(FolioSisactDto elemento) {
		InfoUpDateEnviaDatosDscBean IudvB = new InfoUpDateEnviaDatosDscBean(
				elemento);
		String RespuestaArmaSelect_P123_AEnviaDatosDsc = "";
		RespuestaArmaSelect_P123_AEnviaDatosDsc = ArmaElementofoliosEnviaDatosDsc(IudvB);
		return RespuestaArmaSelect_P123_AEnviaDatosDsc;
	}

	public static String ArmaSelect_P123_AVodafone(
			FoliosEnviaDatosDscDto elemento) {
		InfoUpDateEnviaDatosDscBean IudvB = new InfoUpDateEnviaDatosDscBean(
				elemento);
		String RespuestaArmaSelect_P123_AEnviaDatosDsc = "";
		RespuestaArmaSelect_P123_AEnviaDatosDsc = ArmaElementofoliosEnviaDatosDsc(IudvB);
		return RespuestaArmaSelect_P123_AEnviaDatosDsc;
	}

	public static String ArmaUpDate_P1_AEnviaDatosDsc(
			FoliosEnviaDatosDscDto foliosEnviaDatosDsc, FolioSisactDto elemento) {
		InfoUpDateEnviaDatosDscBean IudvB = new InfoUpDateEnviaDatosDscBean(
				foliosEnviaDatosDsc, elemento);
		String RespuestaArmaUpDate_P1_AEnviaDatosDsc = "";
		RespuestaArmaUpDate_P1_AEnviaDatosDsc = ArmaUpdateAEnviaDatosDsc(IudvB);
		return RespuestaArmaUpDate_P1_AEnviaDatosDsc;
	}

	public static String ArmaUpDate_P2_AEnviaDatosDsc(
			FoliosEnviaDatosDscDto foliosEnviaDatosDsc, FolioSisactDto elemento) {
		InfoUpDateEnviaDatosDscBean IudvB = new InfoUpDateEnviaDatosDscBean(
				foliosEnviaDatosDsc, elemento);
		String RespuestaArmaUpDate_P2_AEnviaDatosDsc = "";
		RespuestaArmaUpDate_P2_AEnviaDatosDsc = ArmaUpdateAEnviaDatosDsc(IudvB);
		return RespuestaArmaUpDate_P2_AEnviaDatosDsc;
	}

	public static String ArmaUpDate_P3_AEnviaDatosDsc(
			FoliosEnviaDatosDscDto foliosEnviaDatosDsc, FolioSisactDto elemento) {
		InfoUpDateEnviaDatosDscBean IudvB = new InfoUpDateEnviaDatosDscBean(
				foliosEnviaDatosDsc, elemento);
		String RespuestaArmaUpDate_P3_AEnviaDatosDsc = "";
		RespuestaArmaUpDate_P3_AEnviaDatosDsc = ArmaUpdateAEnviaDatosDsc(IudvB);
		return RespuestaArmaUpDate_P3_AEnviaDatosDsc;
	}

	public static String ArmaUpDate_P4_AEnviaDatosDsc(
			FoliosEnviaDatosDscDto foliosEnviaDatosDsc, FolioSisactDto elemento) {
		InfoUpDateEnviaDatosDscBean IudvB = new InfoUpDateEnviaDatosDscBean(
				foliosEnviaDatosDsc, elemento);
		String RespuestaArmaUpDate_P4_AEnviaDatosDsc = "";
		RespuestaArmaUpDate_P4_AEnviaDatosDsc = ArmaUpdateAEnviaDatosDsc(IudvB);
		return RespuestaArmaUpDate_P4_AEnviaDatosDsc;
	}

	public static String ArmaUpDate_P5_AEnviaDatosDsc(
			FoliosEnviaDatosDscDto foliosEnviaDatosDsc, FolioSisactDto elemento) {
		InfoUpDateEnviaDatosDscBean IudvB = new InfoUpDateEnviaDatosDscBean(
				foliosEnviaDatosDsc, elemento);
		String RespuestaArmaUpDate_P5_AEnviaDatosDsc = "";
		RespuestaArmaUpDate_P5_AEnviaDatosDsc = ArmaUpdateAEnviaDatosDsc(IudvB);
		return RespuestaArmaUpDate_P5_AEnviaDatosDsc;
	}

	// ****************************************************************************************************************************************************************************************************************************************************
	private static String ArmaUpdateAEnviaDatosDsc(
			InfoUpDateEnviaDatosDscBean IudvB) {

		String RespuestaArmaUpdateAEnviaDatosDsc = "";
		int UNO = 1, DOS = 2, TRES = 3, CUATRO = 4, CINCO = 5;
		int ValElementoRegistrosfoliosEnviaDatosDscBANDERA = Integer
				.parseInt(IudvB.getBANDERA());

		if (ValElementoRegistrosfoliosEnviaDatosDscBANDERA == UNO) {// PROCESO 1
			RespuestaArmaUpdateAEnviaDatosDsc = "UPDATE TG_ENVIADATOSDSC"
					+ " SET I_INTENTOS_P1 = "
					+ IudvB.getI_INTENTOS_P1()
					+ ", LV_REQUEST_P1 = '"
					+ IudvB.getLV_REQUEST_P1()
					+ "', DT_FECHAREQUEST_P1 = '"
					+ IudvB.getDT_FECHAREQUEST_P1()
					+ "',"
					+ " DT_FECHARESPONSE_P1 = '"
					+ IudvB.getDT_FECHARESPONSE_P1()
					+ "', LV_RESPONSE_P1 = '"
					+ IudvB.getLV_RESPONSE_P1()
					+ "'"
					+ ", V_ESTATUS_P1 = '"
					+ IudvB.getV_ESTATUS_P1()
					+ "'"
					+ " WHERE I_IDDSC = "
					+ IudvB.getI_IDDSC()
					+ " AND V_FUERZAVENTA = '"
					+ IudvB.getV_FUERZAVENTA()
					+ "' AND D_FOLIOSISACT = "
					+ IudvB.getD_FOLIOSISACT()
					+ " AND I_REGION = "
					+ IudvB.getI_REGION() + ";";
		} else if (ValElementoRegistrosfoliosEnviaDatosDscBANDERA == DOS) {// PROCESO
																			// 2
			RespuestaArmaUpdateAEnviaDatosDsc = "UPDATE TG_ENVIADATOSDSC"
					+ " SET I_INTENTOS_P2 = "
					+ IudvB.getI_INTENTOS_P2()
					+ ", LV_REQUEST_P2 = '"
					+ IudvB.getLV_REQUEST_P2()
					+ "', DT_FECHAREQUEST_P2 = '"
					+ IudvB.getDT_FECHAREQUEST_P2()
					+ "',"
					+ " DT_FECHARESPONSE_P2 = '"
					+ IudvB.getDT_FECHARESPONSE_P2()
					+ "', LV_RESPONSE_P2 = '"
					+ IudvB.getLV_RESPONSE_P2()
					+ "'"
					+ ", V_ESTATUS_P2 = '"
					+ IudvB.getV_ESTATUS_P2()
					+ "'"
					+ " WHERE I_IDDSC = "
					+ IudvB.getI_IDDSC()
					+ " AND V_FUERZAVENTA = '"
					+ IudvB.getV_FUERZAVENTA()
					+ "' AND D_FOLIOSISACT = "
					+ IudvB.getD_FOLIOSISACT()
					+ " AND I_REGION = "
					+ IudvB.getI_REGION() + ";";
		} else if (ValElementoRegistrosfoliosEnviaDatosDscBANDERA == TRES) {// PROCESO
																			// 3
			RespuestaArmaUpdateAEnviaDatosDsc = "UPDATE TG_ENVIADATOSDSC"
					+ " SET I_INTENTOS_P3 = "
					+ IudvB.getI_INTENTOS_P3()
					+ ", LV_REQUEST_P3 = '"
					+ IudvB.getLV_REQUEST_P3()
					+ "', DT_FECHAREQUEST_P3 = '"
					+ IudvB.getDT_FECHAREQUEST_P3()
					+ "',"
					+ " DT_FECHARESPONSE_P3 = '"
					+ IudvB.getDT_FECHARESPONSE_P3()
					+ "', LV_RESPONSE_P3 = '"
					+ IudvB.getLV_RESPONSE_P3()
					+ "'"
					+ ", V_ESTATUS_P3 = '"
					+ IudvB.getV_ESTATUS_P3()
					+ "'"
					+ " WHERE I_IDDSC = "
					+ IudvB.getI_IDDSC()
					+ " AND V_FUERZAVENTA = '"
					+ IudvB.getV_FUERZAVENTA()
					+ "' AND D_FOLIOSISACT = "
					+ IudvB.getD_FOLIOSISACT()
					+ " AND I_REGION = "
					+ IudvB.getI_REGION() + ";";
		} else if (ValElementoRegistrosfoliosEnviaDatosDscBANDERA == CUATRO) {// PROCESO
																				// 4
																				// AM
			RespuestaArmaUpdateAEnviaDatosDsc = "UPDATE TG_ENVIADATOSDSC"
					+ " SET I_REPORTE_1 = 1, DT_FECHAREPORTE_1 = CURRENT"
					+ " WHERE I_IDDSC = " + IudvB.getI_IDDSC()
					+ " AND V_FUERZAVENTA = '" + IudvB.getV_FUERZAVENTA()
					+ "' AND D_FOLIOSISACT = " + IudvB.getD_FOLIOSISACT()
					+ " AND I_REGION = " + IudvB.getI_REGION() + ";";
		} else if (ValElementoRegistrosfoliosEnviaDatosDscBANDERA == CINCO) {// PROCESO
																				// 5
																				// PM
			RespuestaArmaUpdateAEnviaDatosDsc = "UPDATE TG_ENVIADATOSDSC"
					+ " SET I_REPORTE_2 = 1, DT_FECHAREPORTE_2 = CURRENT "
					+ " WHERE I_IDDSC = " + IudvB.getI_IDDSC()
					+ " AND V_FUERZAVENTA = '" + IudvB.getV_FUERZAVENTA()
					+ "' AND D_FOLIOSISACT = " + IudvB.getD_FOLIOSISACT()
					+ " AND I_REGION = " + IudvB.getI_REGION() + ";";
		}
		log.info("RespuestaArmaUpdateAEnviaDatosDsc ...: "
				+ RespuestaArmaUpdateAEnviaDatosDsc);

		return RespuestaArmaUpdateAEnviaDatosDsc;
	}

	private static String ArmaElementofoliosEnviaDatosDsc(
			InfoUpDateEnviaDatosDscBean IudvB) {

		String RespuestaArmaElementofoliosEnviaDatosDsc = "";
		RespuestaArmaElementofoliosEnviaDatosDsc = ""
				+ "SELECT "
				+ "I_IDDSC,V_FUERZAVENTA,D_FOLIOSISACT,I_REGION,V_CELULAR,V_CUENTA "
				+ ",I_INTENTOS_P1,LV_REQUEST_P1,DT_FECHAREQUEST_P1,DT_FECHARESPONSE_P1,LV_RESPONSE_P1,V_ESTATUS_P1 "
				+ ",I_INTENTOS_P2,LV_REQUEST_P2,DT_FECHAREQUEST_P2,DT_FECHARESPONSE_P2,LV_RESPONSE_P2,V_ESTATUS_P2 "
				+ ",I_INTENTOS_P3,LV_REQUEST_P3,DT_FECHAREQUEST_P3,DT_FECHARESPONSE_P3,LV_RESPONSE_P3,V_ESTATUS_P3 "
				+ ",I_REPORTE_1,DT_FECHAREPORTE_1,I_REPORTE_2,DT_FECHAREPORTE_2 "
				+ ", CASE "
				+ "   WHEN  (V_ESTATUS_P1='error' AND I_INTENTOS_P1=3)                                                                                              THEN '0' "
				+ "   WHEN  (V_ESTATUS_P2='error' AND I_INTENTOS_P2=3)                                                                                              THEN '0' "
				+ "   WHEN  (V_ESTATUS_P3='error' AND I_INTENTOS_P3=3)                                                                                              THEN '0' "
				+ "   WHEN  (V_ESTATUS_P1='exito' AND V_ESTATUS_P2='exito' AND V_ESTATUS_P3='exito')                                                                THEN '0' "
				+ "   WHEN ((V_ESTATUS_P1='exito'  OR V_ESTATUS_P2='exito' OR V_ESTATUS_P3='error') AND (I_INTENTOS_P3=1 OR I_INTENTOS_P3=2))                       THEN '3' "
				+ "   WHEN ((V_ESTATUS_P1='exito'  OR V_ESTATUS_P2='exito') AND (I_INTENTOS_P2=1 OR I_INTENTOS_P2=2 OR I_INTENTOS_P2=3))                            THEN '3' "
				+ "   WHEN ((V_ESTATUS_P1='exito'  OR V_ESTATUS_P2='error') AND (I_INTENTOS_P2=1 OR I_INTENTOS_P2=2))                                               THEN '2' "
				+ "   WHEN  (V_ESTATUS_P1='exito' AND (I_INTENTOS_P1=1 OR I_INTENTOS_P1=2 OR I_INTENTOS_P1=3))                                                      THEN '2' "
				+ "   WHEN  (V_ESTATUS_P1='error' AND (I_INTENTOS_P1=1 OR I_INTENTOS_P1=2))                                                                         THEN '1' "
				+ "   ELSE '666-ERROR EN BD' END AS BANDERA "
				+ "FROM TG_ENVIADATOSDSC " + "WHERE " + "V_FUERZAVENTA='"
				+ IudvB.getV_FUERZAVENTA() + "' " + "AND D_FOLIOSISACT="
				+ IudvB.getD_FOLIOSISACT() + " " + "AND I_REGION="
				+ IudvB.getI_REGION() + ";";

		log.info("RespuestaArmaElementofoliosEnviaDatosDsc ...: "
				+ RespuestaArmaElementofoliosEnviaDatosDsc);

		return RespuestaArmaElementofoliosEnviaDatosDsc;
	}

	private static String ArmaQueryDeletefoliosEnviaDatosDsc(
			List<FoliosEnviaDatosDscDto> listaElementos) {

		String RespuestaArmaDeletefoliosEnviaDatosDsc = "";
		RespuestaArmaDeletefoliosEnviaDatosDsc = "DELETE TG_ENVIADATOSDSC WHERE D_FOLIOSISACT IN(";
		String valAUX = "";
		int contador = 0;
		for (FoliosEnviaDatosDscDto elemento : listaElementos) {
			if (contador == 0) {
				valAUX += elemento.getD_FOLIOSISACT();
				contador++;
			} else {
				valAUX += "," + elemento.getD_FOLIOSISACT();
			}
		}
		RespuestaArmaDeletefoliosEnviaDatosDsc += valAUX + ");";
		log.info("RespuestaArmaDeletefoliosEnviaDatosDsc ...: "
				+ RespuestaArmaDeletefoliosEnviaDatosDsc);

		return RespuestaArmaDeletefoliosEnviaDatosDsc;
	}

	private static String ArmaQueryInsertAEnviaDatosDsc(
			InfoUpDateEnviaDatosDscBean IudvB) {
		String RespuestaArmaInsertAEnviaDatosDsc = "";

		/* (NO NULL)METE VALORES EN TODAS LAS COLUMNAS */
		RespuestaArmaInsertAEnviaDatosDsc = "INSERT INTO TG_ENVIADATOSDSC(V_FUERZAVENTA,                D_FOLIOSISACT,                I_REGION,                V_CELULAR,                V_CUENTA,                I_INTENTOS_P1,                  LV_REQUEST_P1,                  DT_FECHAREQUEST_P1,                  DT_FECHARESPONSE_P1,                 LV_RESPONSE_P1,                 V_ESTATUS_P1,                I_INTENTOS_P2,                  LV_REQUEST_P2,    DT_FECHAREQUEST_P2,   DT_FECHARESPONSE_P2, LV_RESPONSE_P2, V_ESTATUS_P2,                I_INTENTOS_P3,                  LV_REQUEST_P3,    DT_FECHAREQUEST_P3,   DT_FECHARESPONSE_P3, LV_RESPONSE_P3, V_ESTATUS_P3, I_REPORTE_1,     DT_FECHAREPORTE_1, I_REPORTE_2,     DT_FECHAREPORTE_2) VALUES ("
				+ "'"
				+ IudvB.getV_FUERZAVENTA()
				+ "', "
				+ IudvB.getD_FOLIOSISACT()
				+ ", "
				+ IudvB.getI_REGION()
				+ ", "
				+ IudvB.getV_CELULAR()
				+ ", "
				+ IudvB.getV_CUENTA()
				+ ", "
				+ IudvB.getI_INTENTOS_P1()
				+ ", '"
				+ IudvB.getLV_REQUEST_P1()
				+ "', '"
				+ IudvB.getDT_FECHAREQUEST_P1()
				+ "', '"
				+ IudvB.getDT_FECHARESPONSE_P1()
				+ "','"
				+ IudvB.getLV_RESPONSE_P1()
				+ "','"
				+ IudvB.getV_ESTATUS_P1()
				+ "', "
				+ IudvB.getI_INTENTOS_P2()
				+ ", '"
				+ IudvB.getLV_REQUEST_P2()
				+ "', '0001-01-01 00:00:01', '0001-01-01 00:00:01',      'xyztsRP',      'xyzts', "
				+ IudvB.getI_INTENTOS_P3()
				+ ", '"
				+ IudvB.getLV_REQUEST_P3()
				+ "', '0001-01-01 00:00:01', '0001-01-01 00:00:01',      'xyztsRP',      'xyzts',          -1, '0001-01-01 00:00:01',          -1, '0001-01-01 00:00:01');";
		log.info("RespuestaArmaInsertAEnviaDatosDsc ...: "
				+ RespuestaArmaInsertAEnviaDatosDsc);

		return RespuestaArmaInsertAEnviaDatosDsc;
	}

}
