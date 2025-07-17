package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dto.FoliosCorreoElectronicoEnviaDatosDscDto;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dto.FoliosEnviaDatosDscDto;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.MetodosVarios;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.QuerysDinamicos;

import org.springframework.jdbc.core.RowMapper;

public class IdFoliosCorreoElectronicoMapper implements
		RowMapper<FoliosCorreoElectronicoEnviaDatosDscDto> {

	String PaseTiempo;

	public IdFoliosCorreoElectronicoMapper(String varPaseTiempo) {
		this.PaseTiempo = varPaseTiempo;
	}

	public IdFoliosCorreoElectronicoMapper() {
	}

	@Override
	public FoliosCorreoElectronicoEnviaDatosDscDto mapRow(ResultSet rs,
			int rowNum) throws SQLException {

		FoliosCorreoElectronicoEnviaDatosDscDto datosFoliosCorreoElectronicoEnviaDatosDscDto = new FoliosCorreoElectronicoEnviaDatosDscDto();
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		datosFoliosCorreoElectronicoEnviaDatosDscDto.setI_IDDSC(MetodosVarios
				.validaNull(rs.getString("I_IDDSC")));
		datosFoliosCorreoElectronicoEnviaDatosDscDto
				.setV_FUERZAVENTA(MetodosVarios.validaNull(rs
						.getString("V_FUERZAVENTA")));
		datosFoliosCorreoElectronicoEnviaDatosDscDto
				.setD_FOLIOSISACT(MetodosVarios.validaNull(rs
						.getString("D_FOLIOSISACT")));
		datosFoliosCorreoElectronicoEnviaDatosDscDto.setI_REGION(MetodosVarios
				.validaNull(rs.getString("I_REGION")));
		datosFoliosCorreoElectronicoEnviaDatosDscDto.setV_IMEI(MetodosVarios
				.validaNull(rs.getString("V_IMEI")));
		datosFoliosCorreoElectronicoEnviaDatosDscDto
				.setV_CUENTAM2K(MetodosVarios.validaNull(rs
						.getString("V_CUENTAM2K")));
		datosFoliosCorreoElectronicoEnviaDatosDscDto.setV_PLAN(MetodosVarios
				.validaNull(rs.getString("V_PLAN")));
		datosFoliosCorreoElectronicoEnviaDatosDscDto.setV_MARCA(MetodosVarios
				.validaNull(rs.getString("V_MARCA")));
		datosFoliosCorreoElectronicoEnviaDatosDscDto.setV_MODELO(MetodosVarios
				.validaNull(rs.getString("V_MODELO")));
		datosFoliosCorreoElectronicoEnviaDatosDscDto.setDT_FECHARESPONSE(rs
				.getString("DT_FECHARESPONSE") != null ? formato.format(rs
				.getDate("DT_FECHARESPONSE")) : "");
		datosFoliosCorreoElectronicoEnviaDatosDscDto.setV_ESTATUS(MetodosVarios
				.validaNull(rs.getString("V_ESTATUS")));
		datosFoliosCorreoElectronicoEnviaDatosDscDto.setREGISTRO(MetodosVarios
				.validaNull(rs.getString("REGISTRO")));

		datosFoliosCorreoElectronicoEnviaDatosDscDto
				.setI_INTENTOS(MetodosVarios.validaNull(rs
						.getString("I_INTENTOS")));
		datosFoliosCorreoElectronicoEnviaDatosDscDto.setETAPA(MetodosVarios
				.validaNull(rs.getString("ETAPA")));

		FoliosEnviaDatosDscDto fvDto = new FoliosEnviaDatosDscDto();

		fvDto.setI_IDDSC(datosFoliosCorreoElectronicoEnviaDatosDscDto
				.getI_IDDSC());
		fvDto.setD_FOLIOSISACT(datosFoliosCorreoElectronicoEnviaDatosDscDto
				.getD_FOLIOSISACT());
		fvDto.setV_FUERZAVENTA(datosFoliosCorreoElectronicoEnviaDatosDscDto
				.getV_FUERZAVENTA());
		fvDto.setI_REGION(datosFoliosCorreoElectronicoEnviaDatosDscDto
				.getI_REGION());

		if (PaseTiempo.equalsIgnoreCase("AM")) {
			fvDto.setBANDERA("4");
			String queryUpDate_P4_EnviaDatosDsc = QuerysDinamicos
					.ArmaUpDate_P4_AEnviaDatosDsc(fvDto, null);
			datosFoliosCorreoElectronicoEnviaDatosDscDto
					.setUpDateReporteAM(queryUpDate_P4_EnviaDatosDsc);
		} else if (PaseTiempo.equalsIgnoreCase("PM")) {
			fvDto.setBANDERA("5");
			String queryUpDate_P5_EnviaDatosDsc = QuerysDinamicos
					.ArmaUpDate_P5_AEnviaDatosDsc(fvDto, null);
			datosFoliosCorreoElectronicoEnviaDatosDscDto
					.setUpDateReportePM(queryUpDate_P5_EnviaDatosDsc);
		} else {
			System.out.println("valio para dos cosas ...");
		}
		return datosFoliosCorreoElectronicoEnviaDatosDscDto;
	}
}
