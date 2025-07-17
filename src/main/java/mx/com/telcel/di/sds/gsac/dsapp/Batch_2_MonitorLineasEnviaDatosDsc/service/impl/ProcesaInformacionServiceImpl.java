package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.telcel.mail.EnviaMail;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.correoElectronico.ServidorDestino;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dao.impl.FolioEnviaDatosDscDaoImpl;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dto.FoliosCorreoElectronicoEnviaDatosDscDto;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.Constantes;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.ObtenerPropiedades;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.service.ProcesaInformacionService;

@Service
public class ProcesaInformacionServiceImpl implements ProcesaInformacionService {
	private final static Logger log = Logger
			.getLogger(ProcesaInformacionServiceImpl.class);
	private static ObtenerPropiedades propiedades = new ObtenerPropiedades(
			Constantes.NOMBRE_PROPERTIES_CORREO);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void enviaCorreoElectronico(
			List<FoliosCorreoElectronicoEnviaDatosDscDto> registros,
			ServidorDestino servidor) {
		try {
			String leyenda = Constantes.LEYENDA_CORREO;// SHG NO SE OCUPA

			String setFrom = (propiedades
					.obtenerPropiedades(Constantes.CORREO_ORIGEN));
			String sendTo = servidor.getDestinatarios();
			log.info("            setFrom ...: " + setFrom);
			log.info("             sendTo ...: " + sendTo);

			EnviaMail mail = new EnviaMail(Constantes.DEFAULT_CONFIG_MAIL,
					Constantes.DEFAULT_CONFIG_MAIL);
			mail.setFrom(setFrom);

			mail.setSubject(propiedades
					.obtenerPropiedades(Constantes.ASUNTO_CORREO_ERROR_ARCHIVO));
			log.info("mail.getSubject" + mail.getSubject());

			servidor.setAmbiente(Constantes.LEYENDA_AMBIENTE);
			servidor.setIp(Constantes.LEYENDA_SERVIDOR);
			servidor.setUsuario(Constantes.LEYENDA_USUARIO);
			log.info("servidor.getAmbient...: " + servidor.getAmbiente());
			log.info("servidor.getIp     ...: " + servidor.getIp());
			log.info("servidor.getUsuario...: " + servidor.getUsuario());

			mail.addContent(generaContenido(leyenda, registros, servidor));

			mail.setTo(sendTo);

			mail.setContent("text/html; text/css; charset=utf-8");
			log.info("     mail.getConten...:" + mail.getContent());

			mail.sendMultipart();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String generaContenido(String leyenda,
			List<FoliosCorreoElectronicoEnviaDatosDscDto> registros,
			ServidorDestino servidor) {
		StringBuilder tablaHtml = new StringBuilder();

		String firma1 = "\n\nFavor de validar.";
		String firma2 = "\n\nNo responder a este correo, es un envio automatico.";

		tablaHtml.append("<HTML>");
		tablaHtml.append("<HEAD>");
		tablaHtml.append("<TITLE>PROPUESTA TABLA ENVIADATOSDSC</TITLE>");
		tablaHtml.append("<META charset=\"utf-8\">");
		tablaHtml.append("<STYLE>");
		tablaHtml.append(this.getStyles());
		tablaHtml.append("</STYLE>");
		tablaHtml.append("</HEAD>");
		tablaHtml.append("<BODY STYLE=\"background-color: #EFF8FB;\">");

		tablaHtml.append("<BR>");
		tablaHtml
				.append("<BR><TABLE STYLE=\"background-color: #E0ECF8;\"><TR><TD><BR>");
		tablaHtml
				.append("<TABLE ID=\"Id_Table\"><TR><TD ID=\"Id_Td0\" COLSPAN=\"11\" ALIGN=\"CENTER\">");
		tablaHtml
				.append("Por medio del presente se hace la notificación de las activaciones en error durante la interacción con DSC a través del API GestionarEmpresaServices v39.0 – guardarLineaEmpresa.");
		tablaHtml.append("</TD></TR><TR ID=\"Id_Tr\">"
				+ "<TH ID=\"Id_Th\">Tipo</TH>"
				+ "<TH ID=\"Id_Th\">Fuerza de Venta</TH><"
				+ "TH ID=\"Id_Th\">Folio</TH>" + "<TH ID=\"Id_Th\">Region</TH>"
				+ "<TH ID=\"Id_Th\">Celular</TH>"
				+ "<TH ID=\"Id_Th\">Cuenta</TH>"
				+ "<TH ID=\"Id_Th\">Iccid</TH>" + "<TH ID=\"Id_Th\">Etapa</TH>"
				+ "<TH ID=\"Id_Th\">INTENTO</TH>"
				+ "<TH ID=\"Id_Th\">REQUEST</TH>"
				+ "<TH ID=\"Id_Th\">RESPONSE</TH>" + "</TR>");

		if (registros.size() > 0) {
			int consecutivo = 1;
			String varComplemento = "";
			for (FoliosCorreoElectronicoEnviaDatosDscDto registro : registros) {
				tablaHtml.append(registro.getREGISTRO());

				varComplemento = consecutivo + " DE " + registros.size()
						+ " :: " + registro.getD_FOLIOSISACT() + "/"
						+ registro.getI_REGION() + "/"
						+ registro.getV_FUERZAVENTA() + "/"
						+ registro.getV_TIPO() + "/" + registro.getI_IDDSC()
						+ " :: SELECT * FROM TG_ENVIADATOSDSC WHERE I_IDDSC = "
						+ registro.getI_IDDSC() + " AND V_TIPO = '"
						+ registro.getV_TIPO() + " AND V_FUERZAVENTA = '"
						+ registro.getV_FUERZAVENTA()
						+ "' AND D_FOLIOSISACT = "
						+ registro.getD_FOLIOSISACT() + " AND I_REGION = "
						+ registro.getI_REGION() + ";";
				registro.setCOMPLEMENTOINFO(varComplemento);

				EjecutaActualizacionReporteEnviaDatosDsc(registro);
				consecutivo++;
			}

		} else {
			tablaHtml
					.append("<TR ID=\"ID_TR\"><TD ID=\"ID_TD1\" COLSPAN=\"11\" ALIGN=\"CENTER\">.</TR>");
			tablaHtml
					.append("<TR ID=\"ID_TR\"><TD ID=\"ID_TD\" COLSPAN=\"11\" ALIGN=\"CENTER\">NO HAY NADA QUE NOTIFICAR DE LAS ACTIVACIONES EN ERROR DURANTE LA INTERACCIÓN CON DSC A TRAVÉS DEL API GESTIONAREMPRESASERVICES V39.0 – GUARDARLINEAEMPRESA.</TR>");
			tablaHtml
					.append("<TR ID=\"ID_TR\"><TD ID=\"ID_TD1\" COLSPAN=\"11\" ALIGN=\"CENTER\">.</TR>");
			log.info("No hay Registros a procesar de tabla ENVIADATOSDSC...");
		}

		tablaHtml.append("</TR></TABLE><BR></TD></TR></TABLE>");
		// }

		tablaHtml.append("<br><br>");
		tablaHtml.append("<p>" + firma1 + "</p>");
		tablaHtml.append("<p>" + firma2 + "</p>");
		tablaHtml.append("</BODY></HTML>");

		String varTABLA = tablaHtml.toString();
		log.info("CONTENIDO CORREO ...:" + varTABLA);

		return varTABLA;
	}

	private int EjecutaActualizacionReporteEnviaDatosDsc(
			FoliosCorreoElectronicoEnviaDatosDscDto registro) {
		int RespuestaEjecutaActualizacionReporteEnviaDatosDsc = 0;
		FolioEnviaDatosDscDaoImpl foliosEnviaDatosDscDao0 = null;

		if (registro.getUpDateReportePM() == null) {
			RespuestaEjecutaActualizacionReporteEnviaDatosDsc = jdbcTemplate
					.update(registro.getUpDateReporteAM());
			log.info("UpdateEnviaDatosDsc afectados...: "
					+ RespuestaEjecutaActualizacionReporteEnviaDatosDsc
					+ " :: " + registro.getCOMPLEMENTOINFO());
		} else {
			RespuestaEjecutaActualizacionReporteEnviaDatosDsc = jdbcTemplate
					.update(registro.getUpDateReportePM());
			log.info("UpdateEnviaDatosDsc afectados...: "
					+ RespuestaEjecutaActualizacionReporteEnviaDatosDsc
					+ " :: " + registro.getCOMPLEMENTOINFO());
		}

		return RespuestaEjecutaActualizacionReporteEnviaDatosDsc;
	}

	private String getStyles() {
		return "body             {font-family: Arial, Helvetica, sans-serif; } "
				+ "#Id_Table        {font-family: \"Lucida Sans Unicode\", \"Lucida Grande\", Sans-Serif; font-size: 12px; margin: 45px; width: 95%; text-align: left; border-collapse: collapse; } "
				+ "#Id_Th           {font-size: 13px; font-weight: normal; padding: 8px; background: #b9c9fe;	border-top: 4px solid #aabcfe; border-bottom: 1px solid #fff; color: #039; } "
				+ "#Id_Td           {padding: 8px; background: #e8edff; border-bottom: 1px solid #fff; color: #669;    border-top: 1px solid transparent; } "
				+ "#Id_Td0          {padding: 8px; background: #0404B4; border-bottom: 1px solid #fff; color: #ffffff; border-top: 1px solid transparent; } "
				+ "#Id_Td1          {padding: 8px; background: #FFFFFF; border-bottom: 1px solid #fff; color: #669;    border-top: 1px solid transparent; } "
				+ "#Id_Tr:hover td  {background: #d0dafd; color: #339; }";
	}

}
