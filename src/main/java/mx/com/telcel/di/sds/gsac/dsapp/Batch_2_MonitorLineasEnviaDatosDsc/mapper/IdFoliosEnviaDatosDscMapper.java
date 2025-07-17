package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dto.FoliosEnviaDatosDscDto;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.MetodosVarios;

import org.springframework.jdbc.core.RowMapper;

public class IdFoliosEnviaDatosDscMapper implements
		RowMapper<FoliosEnviaDatosDscDto> {

	@Override
	public FoliosEnviaDatosDscDto mapRow(ResultSet rs, int rowNum)
			throws SQLException {

		FoliosEnviaDatosDscDto datosDatosEnviaDatosDscDto = new FoliosEnviaDatosDscDto();
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		datosDatosEnviaDatosDscDto.setI_IDDSC(rs.getString("I_IDDSC"));
		datosDatosEnviaDatosDscDto.setV_FUERZAVENTA(rs
				.getString("V_FUERZAVENTA"));
		datosDatosEnviaDatosDscDto.setD_FOLIOSISACT(rs
				.getString("D_FOLIOSISACT"));
		datosDatosEnviaDatosDscDto.setI_REGION(rs.getString("I_REGION"));
		datosDatosEnviaDatosDscDto.setV_CELULAR(rs.getString("V_CELULAR"));
		datosDatosEnviaDatosDscDto.setV_CUENTA(rs.getString("V_CUENTA"));

		datosDatosEnviaDatosDscDto.setI_INTENTOS_P1(rs
				.getString("I_INTENTOS_P1"));
		datosDatosEnviaDatosDscDto.setLV_REQUEST_P1(rs
				.getString("LV_REQUEST_P1"));
		datosDatosEnviaDatosDscDto.setDT_FECHAREQUEST_P1(rs
				.getDate("DT_FECHAREQUEST_P1") != null ? formato.format(rs
				.getDate("DT_FECHAREQUEST_P1")) : "");
		datosDatosEnviaDatosDscDto.setDT_FECHARESPONSE_P1(rs
				.getDate("DT_FECHARESPONSE_P1") != null ? formato.format(rs
				.getDate("DT_FECHARESPONSE_P1")) : "");
		datosDatosEnviaDatosDscDto.setLV_RESPONSE_P1(rs
				.getString("LV_RESPONSE_P1"));
		datosDatosEnviaDatosDscDto
				.setV_ESTATUS_P1(rs.getString("V_ESTATUS_P1"));

		datosDatosEnviaDatosDscDto.setI_INTENTOS_P2(MetodosVarios.validaNull(rs
				.getString("I_INTENTOS_P2")));
		datosDatosEnviaDatosDscDto.setLV_REQUEST_P2(MetodosVarios.validaNull(rs
				.getString("LV_REQUEST_P2")));
		datosDatosEnviaDatosDscDto.setDT_FECHAREQUEST_P2(rs
				.getString("DT_FECHAREQUEST_P2") != null ? formato.format(rs
				.getDate("DT_FECHAREQUEST_P2")) : "");
		datosDatosEnviaDatosDscDto.setDT_FECHARESPONSE_P2(rs
				.getDate("DT_FECHARESPONSE_P2") != null ? formato.format(rs
				.getDate("DT_FECHARESPONSE_P2")) : "");
		datosDatosEnviaDatosDscDto.setLV_RESPONSE_P2(MetodosVarios
				.validaNull(rs.getString("LV_RESPONSE_P2")));
		datosDatosEnviaDatosDscDto.setV_ESTATUS_P2(MetodosVarios.validaNull(rs
				.getString("V_ESTATUS_P2")));

		datosDatosEnviaDatosDscDto.setI_INTENTOS_P3(MetodosVarios.validaNull(rs
				.getString("I_INTENTOS_P3")));
		datosDatosEnviaDatosDscDto.setLV_REQUEST_P3(MetodosVarios.validaNull(rs
				.getString("LV_REQUEST_P3")));
		datosDatosEnviaDatosDscDto.setDT_FECHAREQUEST_P3(rs
				.getString("DT_FECHAREQUEST_P3") != null ? formato.format(rs
				.getDate("DT_FECHAREQUEST_P3")) : "");
		datosDatosEnviaDatosDscDto.setDT_FECHARESPONSE_P3(rs
				.getDate("DT_FECHARESPONSE_P3") != null ? formato.format(rs
				.getDate("DT_FECHARESPONSE_P3")) : "");
		datosDatosEnviaDatosDscDto.setLV_RESPONSE_P3(MetodosVarios
				.validaNull(rs.getString("LV_RESPONSE_P3")));
		datosDatosEnviaDatosDscDto.setV_ESTATUS_P3(MetodosVarios.validaNull(rs
				.getString("V_ESTATUS_P3")));

		datosDatosEnviaDatosDscDto.setBANDERA(MetodosVarios.validaNull(rs
				.getString("BANDERA")));

		return datosDatosEnviaDatosDscDto;
	}
}
