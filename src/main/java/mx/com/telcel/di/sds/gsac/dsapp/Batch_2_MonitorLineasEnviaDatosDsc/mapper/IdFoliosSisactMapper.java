package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dto.FolioSisactDto;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.MetodosVarios;

import org.springframework.jdbc.core.RowMapper;

public class IdFoliosSisactMapper implements RowMapper<FolioSisactDto> {

	@Override
	public FolioSisactDto mapRow(ResultSet rs, int rowNum) throws SQLException {

		FolioSisactDto datosFolioSisactDto = new FolioSisactDto();

		datosFolioSisactDto.setCorrelatorId(MetodosVarios.IdFechaTiempo());
		datosFolioSisactDto.setEnterpriseId(MetodosVarios.validaNull(rs
				.getString("ENTERPRISEID")));// *
		datosFolioSisactDto.setEquipo(MetodosVarios.validaNull(rs
				.getString("V_MARCA")));
		datosFolioSisactDto.setIccid(MetodosVarios.validaNull(rs
				.getString("V_ICCID")));
		datosFolioSisactDto.setImei(MetodosVarios.validaNull(rs
				.getString("V_IMEI")));
		datosFolioSisactDto.setModelo(MetodosVarios.validaNull(rs
				.getString("V_MODELO")));
		datosFolioSisactDto.setPlanId(MetodosVarios.validaNull(rs
				.getString("V_PLAN")));
		datosFolioSisactDto.setProviderId(MetodosVarios.validaNull(rs
				.getString("PROVIDERID")));// *
		datosFolioSisactDto.setRegion(MetodosVarios.validaNull(rs
				.getString("I_REGIONDST")));
		datosFolioSisactDto.setMsisdn(MetodosVarios.validaNull(rs
				.getString("V_CELULARM2K")));

		datosFolioSisactDto.setServiceName_P1("PROVISIONING");

		datosFolioSisactDto.setEstado_P1("");
		datosFolioSisactDto.setDescripcion_P1("");
		datosFolioSisactDto.setSimStatus_P1("INVENTORY");
		datosFolioSisactDto.setTipo_P1("1");
		datosFolioSisactDto.setI_INTENTOS_P1("1");

		datosFolioSisactDto.setServiceName_P2("PROVISIONING");

		datosFolioSisactDto.setEstado_P2("");
		datosFolioSisactDto.setDescripcion_P2("");
		datosFolioSisactDto.setSimStatus_P2("INVENTORY");
		datosFolioSisactDto.setTipo_P2("2");
		datosFolioSisactDto.setI_INTENTOS_P2("0");

		datosFolioSisactDto.setServiceName_P3("PROVISIONING");

		datosFolioSisactDto.setEstado_P3("EX");
		datosFolioSisactDto.setDescripcion_P3("EXITO");
		datosFolioSisactDto.setSimStatus_P3("ACTIVATION");
		datosFolioSisactDto.setTipo_P3("3");
		datosFolioSisactDto.setI_INTENTOS_P3("0");

		datosFolioSisactDto.setFZAVENTA(MetodosVarios.validaNull(rs
				.getString("V_CLAVEDST")));
		datosFolioSisactDto.setFOLIOSISACT(MetodosVarios.validaNull(rs
				.getString("D_FOLIODST")));
		datosFolioSisactDto.setI_regionDST(MetodosVarios.validaNull(rs
				.getString("I_REGIONDST")));
		datosFolioSisactDto.setV_PLAN(MetodosVarios.validaNull(rs
				.getString("V_PLAN")));
		datosFolioSisactDto.setD_FECHAACT(MetodosVarios.validaNull(rs
				.getString("D_FECHAACT")));
		datosFolioSisactDto.setDT_FECHAACT(MetodosVarios.validaNull(rs
				.getString("DT_FECHAACT")));
		datosFolioSisactDto.setV_CUENTAM2K(MetodosVarios.validaNull(rs
				.getString("V_CUENTAM2K")));

		String ArmadoRequest1 = "{\"correlatorId\": \""
				+ datosFolioSisactDto.getCorrelatorId()
				+ "\",\"descripcion\": \""
				+ datosFolioSisactDto.getDescripcion_P1()
				+ "\",\"enterpriseId\": \""
				+ datosFolioSisactDto.getEnterpriseId() + "\",\"equipo\": \""
				+ datosFolioSisactDto.getEquipo() + "\",\"estado\": \""
				+ datosFolioSisactDto.getEstado_P1() + "\",\"iccid\": \""
				+ datosFolioSisactDto.getIccid() + "\",\"imei\": \""
				+ datosFolioSisactDto.getImei() + "\",\"modelo\": \""
				+ datosFolioSisactDto.getModelo() + "\",\"msisdn\": \""
				+ datosFolioSisactDto.getMsisdn() + "\",\"planId\": \""
				+ datosFolioSisactDto.getPlanId() + "\",\"providerId\": \""
				+ datosFolioSisactDto.getProviderId() + "\",\"region\": \""
				+ datosFolioSisactDto.getRegion() + "\",\"serviceName\": \""
				+ datosFolioSisactDto.getServiceName_P1()
				+ "\",\"simStatus\": \""
				+ datosFolioSisactDto.getSimStatus_P1() + "\",\"tipo\": \""
				+ datosFolioSisactDto.getTipo_P1() + "\"}";
		datosFolioSisactDto.setREQUEST_P1(ArmadoRequest1);
		datosFolioSisactDto.setFECHAREQUEST_P1(MetodosVarios
				.ObtenerFechaTiempo());// eJEMPLO: 2024-01-30 11:45:00

		String ArmadoRequest2 = "{\"correlatorId\": \""
				+ datosFolioSisactDto.getCorrelatorId()
				+ "\",\"descripcion\": \""
				+ datosFolioSisactDto.getDescripcion_P2()
				+ "\",\"enterpriseId\": \""
				+ datosFolioSisactDto.getEnterpriseId() + "\",\"equipo\": \""
				+ datosFolioSisactDto.getEquipo() + "\",\"estado\": \""
				+ datosFolioSisactDto.getEstado_P2() + "\",\"iccid\": \""
				+ datosFolioSisactDto.getIccid() + "\",\"imei\": \""
				+ datosFolioSisactDto.getImei() + "\",\"modelo\": \""
				+ datosFolioSisactDto.getModelo() + "\",\"msisdn\": \""
				+ datosFolioSisactDto.getMsisdn() + "\",\"planId\": \""
				+ datosFolioSisactDto.getPlanId() + "\",\"providerId\": \""
				+ datosFolioSisactDto.getProviderId() + "\",\"region\": \""
				+ datosFolioSisactDto.getRegion() + "\",\"serviceName\": \""
				+ datosFolioSisactDto.getServiceName_P2()
				+ "\",\"simStatus\": \""
				+ datosFolioSisactDto.getSimStatus_P2() + "\",\"tipo\": \""
				+ datosFolioSisactDto.getTipo_P2() + "\"}";
		datosFolioSisactDto.setREQUEST_P2(ArmadoRequest2);

		String ArmadoRequest = "{\"correlatorId\": \""
				+ datosFolioSisactDto.getCorrelatorId()
				+ "\",\"descripcion\": \""
				+ datosFolioSisactDto.getDescripcion_P3()
				+ "\",\"enterpriseId\": \""
				+ datosFolioSisactDto.getEnterpriseId() + "\",\"equipo\": \""
				+ datosFolioSisactDto.getEquipo() + "\",\"estado\": \""
				+ datosFolioSisactDto.getEstado_P3() + "\",\"iccid\": \""
				+ datosFolioSisactDto.getIccid() + "\",\"imei\": \""
				+ datosFolioSisactDto.getImei() + "\",\"modelo\": \""
				+ datosFolioSisactDto.getModelo() + "\",\"msisdn\": \""
				+ datosFolioSisactDto.getMsisdn() + "\",\"planId\": \""
				+ datosFolioSisactDto.getPlanId() + "\",\"providerId\": \""
				+ datosFolioSisactDto.getProviderId() + "\",\"region\": \""
				+ datosFolioSisactDto.getRegion() + "\",\"serviceName\": \""
				+ datosFolioSisactDto.getServiceName_P3()
				+ "\",\"simStatus\": \""
				+ datosFolioSisactDto.getSimStatus_P3() + "\",\"tipo\": \""
				+ datosFolioSisactDto.getTipo_P3() + "\"}";
		datosFolioSisactDto.setREQUEST_P3(ArmadoRequest);

		return datosFolioSisactDto;
	}
}
