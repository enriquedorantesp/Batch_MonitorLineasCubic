package mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.dto;

import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.enviaDatosEnviaDatosDsc.util.MetodosVarios;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.json.clase.DeClaseaJsonRequest;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.json.clase.PeticionAServicioBeanJson;
import mx.com.telcel.di.sds.gsac.dsapp.Batch_2_MonitorLineasEnviaDatosDsc.json.clase.RespuestaServicioBeanJson;

public class FolioSisactDto {

	private String correlatorId;
	private String enterpriseId;
	private String equipo;
	private String iccid;
	private String imei;
	private String modelo;
	private String planId;
	private String providerId;
	private String region;
	private String msisdn;

	private String serviceName_P1;
	private String estado_P1;
	private String descripcion_P1;
	private String simStatus_P1;
	private String tipo_P1;
	private String I_INTENTOS_P1;
	private String REQUEST_P1;
	private String FECHAREQUEST_P1;
	private String FECHARESPONSE_P1;
	private String RESPONSE_P1;
	private String ESTATUS_P1;

	private String serviceName_P2;
	private String estado_P2;
	private String descripcion_P2;
	private String simStatus_P2;
	private String tipo_P2;
	private String I_INTENTOS_P2;
	private String REQUEST_P2;
	private String FECHAREQUEST_P2;
	private String FECHARESPONSE_P2;
	private String RESPONSE_P2;
	private String ESTATUS_P2;

	private String serviceName_P3;
	private String estado_P3;
	private String descripcion_P3;
	private String simStatus_P3;
	private String tipo_P3;
	private String I_INTENTOS_P3;
	private String REQUEST_P3;
	private String FECHAREQUEST_P3;
	private String FECHARESPONSE_P3;
	private String RESPONSE_P3;
	private String ESTATUS_P3;

	/**/private String FZAVENTA;
	/**/private String FOLIOSISACT;
	/**/private String I_regionDST;
	/**/private String V_PLAN;
	/**/private String D_FECHAACT;
	/**/private String DT_FECHAACT;
	private String V_CUENTAM2K;

	private String BANDERA;

	private PeticionAServicioBeanJson pasbJSON;// DE CLASE A STRING
	private RespuestaServicioBeanJson rsbJSON;// DE STRING A CLASE
	private String ArmaRequest;

	public String getArmaRequest_P1() {// DE CLASE A STRING

		pasbJSON.setCorrelatorId(MetodosVarios.validaNull(correlatorId));
		pasbJSON.setEnterpriseId(MetodosVarios.validaNull(enterpriseId));
		pasbJSON.setEquipo(MetodosVarios.validaNull(equipo));
		pasbJSON.setIccid(MetodosVarios.validaNull(iccid));
		pasbJSON.setImei(MetodosVarios.validaNull(imei));
		pasbJSON.setModelo(MetodosVarios.validaNull(modelo));
		pasbJSON.setPlanId(MetodosVarios.validaNull(planId));
		pasbJSON.setProviderId(MetodosVarios.validaNull(providerId));
		pasbJSON.setRegion(MetodosVarios.validaNull(region));
		pasbJSON.setMsisdn(MetodosVarios.validaNull(msisdn));
		pasbJSON.setServiceName(MetodosVarios.validaNull(serviceName_P1));
		pasbJSON.setEstado(MetodosVarios.validaNull(estado_P1));
		pasbJSON.setDescripcion(MetodosVarios.validaNull(descripcion_P1));
		pasbJSON.setSimStatus(MetodosVarios.validaNull(simStatus_P1));
		pasbJSON.setTipo(MetodosVarios.validaNull(tipo_P1));

		DeClaseaJsonRequest dcaJsonREQUEST = new DeClaseaJsonRequest();
		String cadenaJSON = dcaJsonREQUEST.obtenJson(pasbJSON);

		return cadenaJSON;
	}

	public String getArmaRequest_P2() {// DE CLASE A STRING

		pasbJSON.setCorrelatorId(MetodosVarios.validaNull(correlatorId));
		pasbJSON.setEnterpriseId(MetodosVarios.validaNull(enterpriseId));
		pasbJSON.setEquipo(MetodosVarios.validaNull(equipo));
		pasbJSON.setIccid(MetodosVarios.validaNull(iccid));
		pasbJSON.setImei(MetodosVarios.validaNull(imei));
		pasbJSON.setModelo(MetodosVarios.validaNull(modelo));
		pasbJSON.setPlanId(MetodosVarios.validaNull(planId));
		pasbJSON.setProviderId(MetodosVarios.validaNull(providerId));
		pasbJSON.setRegion(MetodosVarios.validaNull(region));
		pasbJSON.setMsisdn(MetodosVarios.validaNull(msisdn));

		pasbJSON.setServiceName(MetodosVarios.validaNull(serviceName_P2));
		pasbJSON.setEstado(MetodosVarios.validaNull(estado_P2));
		pasbJSON.setDescripcion(MetodosVarios.validaNull(descripcion_P2));
		pasbJSON.setSimStatus(MetodosVarios.validaNull(simStatus_P2));
		pasbJSON.setTipo(MetodosVarios.validaNull(tipo_P2));

		DeClaseaJsonRequest dcaJsonREQUEST = new DeClaseaJsonRequest();
		String cadenaJSON = dcaJsonREQUEST.obtenJson(pasbJSON);

		return cadenaJSON;
	}

	public String getArmaRequest_P3() {// DE CLASE A STRING

		pasbJSON.setCorrelatorId(MetodosVarios.validaNull(correlatorId));
		pasbJSON.setEnterpriseId(MetodosVarios.validaNull(enterpriseId));
		pasbJSON.setEquipo(MetodosVarios.validaNull(equipo));
		pasbJSON.setIccid(MetodosVarios.validaNull(iccid));
		pasbJSON.setImei(MetodosVarios.validaNull(imei));
		pasbJSON.setModelo(MetodosVarios.validaNull(modelo));
		pasbJSON.setPlanId(MetodosVarios.validaNull(planId));
		pasbJSON.setProviderId(MetodosVarios.validaNull(providerId));
		pasbJSON.setRegion(MetodosVarios.validaNull(region));
		pasbJSON.setMsisdn(MetodosVarios.validaNull(msisdn));

		pasbJSON.setServiceName(MetodosVarios.validaNull(serviceName_P3));
		pasbJSON.setEstado(MetodosVarios.validaNull(estado_P3));
		pasbJSON.setDescripcion(MetodosVarios.validaNull(descripcion_P3));
		pasbJSON.setSimStatus(MetodosVarios.validaNull(simStatus_P3));
		pasbJSON.setTipo(MetodosVarios.validaNull(tipo_P3));

		DeClaseaJsonRequest dcaJsonREQUEST = new DeClaseaJsonRequest();
		String cadenaJSON = dcaJsonREQUEST.obtenJson(pasbJSON);

		return cadenaJSON;
	}

	@Override
	public String toString() {
		return "FolioSisactDto [correlatorId=" + correlatorId
				+ ", enterpriseId=" + enterpriseId + ", equipo=" + equipo
				+ ", iccid=" + iccid + ", imei=" + imei + ", modelo=" + modelo
				+ ", planId=" + planId + ", providerId=" + providerId
				+ ", region=" + region + ", msisdn=" + msisdn
				+ ", serviceName_P1=" + serviceName_P1 + ", estado_P1="
				+ estado_P1 + ", descripcion_P1=" + descripcion_P1
				+ ", simStatus_P1=" + simStatus_P1 + ", tipo_P1=" + tipo_P1
				+ ", I_INTENTOS_P1=" + I_INTENTOS_P1 + ", REQUEST_P1="
				+ REQUEST_P1 + ", FECHAREQUEST_P1=" + FECHAREQUEST_P1
				+ ", FECHARESPONSE_P1=" + FECHARESPONSE_P1 + ", RESPONSE_P1="
				+ RESPONSE_P1 + ", ESTATUS_P1=" + ESTATUS_P1 + ", FZAVENTA="
				+ FZAVENTA + ", FOLIOSISACT=" + FOLIOSISACT + ", I_regionDST="
				+ I_regionDST + ", V_PLAN=" + V_PLAN + ", D_FECHAACT="
				+ D_FECHAACT + ", DT_FECHAACT=" + DT_FECHAACT
				+ ", V_CUENTAM2K=" + V_CUENTAM2K + ", pasbJSON=" + pasbJSON
				+ ", rsbJSON=" + rsbJSON + ", ArmaRequest=" + ArmaRequest + "]";
	}

	public String getServiceName_P2() {
		return serviceName_P2;
	}

	public void setServiceName_P2(String serviceName_P2) {
		this.serviceName_P2 = serviceName_P2;
	}

	public String getEstado_P2() {
		return estado_P2;
	}

	public void setEstado_P2(String estado_P2) {
		this.estado_P2 = estado_P2;
	}

	public String getDescripcion_P2() {
		return descripcion_P2;
	}

	public void setDescripcion_P2(String descripcion_P2) {
		this.descripcion_P2 = descripcion_P2;
	}

	public String getSimStatus_P2() {
		return simStatus_P2;
	}

	public void setSimStatus_P2(String simStatus_P2) {
		this.simStatus_P2 = simStatus_P2;
	}

	public String getTipo_P2() {
		return tipo_P2;
	}

	public void setTipo_P2(String tipo_P2) {
		this.tipo_P2 = tipo_P2;
	}

	public String getI_INTENTOS_P2() {
		return I_INTENTOS_P2;
	}

	public void setI_INTENTOS_P2(String i_INTENTOS_P2) {
		I_INTENTOS_P2 = i_INTENTOS_P2;
	}

	public String getREQUEST_P2() {
		return REQUEST_P2;
	}

	public void setREQUEST_P2(String rEQUEST_P2) {
		REQUEST_P2 = rEQUEST_P2;
	}

	public String getFECHAREQUEST_P2() {
		return FECHAREQUEST_P2;
	}

	public void setFECHAREQUEST_P2(String fECHAREQUEST_P2) {
		FECHAREQUEST_P2 = fECHAREQUEST_P2;
	}

	public String getFECHARESPONSE_P2() {
		return FECHARESPONSE_P2;
	}

	public void setFECHARESPONSE_P2(String fECHARESPONSE_P2) {
		FECHARESPONSE_P2 = fECHARESPONSE_P2;
	}

	public String getRESPONSE_P2() {
		return RESPONSE_P2;
	}

	public void setRESPONSE_P2(String rESPONSE_P2) {
		RESPONSE_P2 = rESPONSE_P2;
	}

	public String getESTATUS_P2() {
		return ESTATUS_P2;
	}

	public void setESTATUS_P2(String eSTATUS_P2) {
		ESTATUS_P2 = eSTATUS_P2;
	}

	public String getServiceName_P3() {
		return serviceName_P3;
	}

	public void setServiceName_P3(String serviceName_P3) {
		this.serviceName_P3 = serviceName_P3;
	}

	public String getEstado_P3() {
		return estado_P3;
	}

	public void setEstado_P3(String estado_P3) {
		this.estado_P3 = estado_P3;
	}

	public String getDescripcion_P3() {
		return descripcion_P3;
	}

	public void setDescripcion_P3(String descripcion_P3) {
		this.descripcion_P3 = descripcion_P3;
	}

	public String getSimStatus_P3() {
		return simStatus_P3;
	}

	public void setSimStatus_P3(String simStatus_P3) {
		this.simStatus_P3 = simStatus_P3;
	}

	public String getTipo_P3() {
		return tipo_P3;
	}

	public void setTipo_P3(String tipo_P3) {
		this.tipo_P3 = tipo_P3;
	}

	public String getI_INTENTOS_P3() {
		return I_INTENTOS_P3;
	}

	public void setI_INTENTOS_P3(String i_INTENTOS_P3) {
		I_INTENTOS_P3 = i_INTENTOS_P3;
	}

	public String getREQUEST_P3() {
		return REQUEST_P3;
	}

	public void setREQUEST_P3(String rEQUEST_P3) {
		REQUEST_P3 = rEQUEST_P3;
	}

	public String getFECHAREQUEST_P3() {
		return FECHAREQUEST_P3;
	}

	public void setFECHAREQUEST_P3(String fECHAREQUEST_P3) {
		FECHAREQUEST_P3 = fECHAREQUEST_P3;
	}

	public String getFECHARESPONSE_P3() {
		return FECHARESPONSE_P3;
	}

	public void setFECHARESPONSE_P3(String fECHARESPONSE_P3) {
		FECHARESPONSE_P3 = fECHARESPONSE_P3;
	}

	public String getRESPONSE_P3() {
		return RESPONSE_P3;
	}

	public void setRESPONSE_P3(String rESPONSE_P3) {
		RESPONSE_P3 = rESPONSE_P3;
	}

	public String getESTATUS_P3() {
		return ESTATUS_P3;
	}

	public void setESTATUS_P3(String eSTATUS_P3) {
		ESTATUS_P3 = eSTATUS_P3;
	}

	public String getCorrelatorId() {
		return correlatorId;
	}

	public void setCorrelatorId(String correlatorId) {
		this.correlatorId = correlatorId;
	}

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getIccid() {
		return iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getServiceName_P1() {
		return serviceName_P1;
	}

	public void setServiceName_P1(String serviceName_P1) {
		this.serviceName_P1 = serviceName_P1;
	}

	public String getEstado_P1() {
		return estado_P1;
	}

	public void setEstado_P1(String estado_P1) {
		this.estado_P1 = estado_P1;
	}

	public String getDescripcion_P1() {
		return descripcion_P1;
	}

	public void setDescripcion_P1(String descripcion_P1) {
		this.descripcion_P1 = descripcion_P1;
	}

	public String getSimStatus_P1() {
		return simStatus_P1;
	}

	public void setSimStatus_P1(String simStatus_P1) {
		this.simStatus_P1 = simStatus_P1;
	}

	public String getTipo_P1() {
		return tipo_P1;
	}

	public void setTipo_P1(String tipo_P1) {
		this.tipo_P1 = tipo_P1;
	}

	public String getI_INTENTOS_P1() {
		return I_INTENTOS_P1;
	}

	public void setI_INTENTOS_P1(String i_INTENTOS_P1) {
		I_INTENTOS_P1 = i_INTENTOS_P1;
	}

	public String getREQUEST_P1() {
		return REQUEST_P1;
	}

	public void setREQUEST_P1(String rEQUEST_P1) {
		REQUEST_P1 = rEQUEST_P1;
	}

	public String getFECHAREQUEST_P1() {
		return FECHAREQUEST_P1;
	}

	public void setFECHAREQUEST_P1(String fECHAREQUEST_P1) {
		FECHAREQUEST_P1 = fECHAREQUEST_P1;
	}

	public String getFECHARESPONSE_P1() {
		return FECHARESPONSE_P1;
	}

	public void setFECHARESPONSE_P1(String fECHARESPONSE_P1) {
		FECHARESPONSE_P1 = fECHARESPONSE_P1;
	}

	public String getRESPONSE_P1() {
		return RESPONSE_P1;
	}

	public void setRESPONSE_P1(String rESPONSE_P1) {
		RESPONSE_P1 = rESPONSE_P1;
	}

	public String getESTATUS_P1() {
		return ESTATUS_P1;
	}

	public void setESTATUS_P1(String eSTATUS_P1) {
		ESTATUS_P1 = eSTATUS_P1;
	}

	public String getFZAVENTA() {
		return FZAVENTA;
	}

	public void setFZAVENTA(String fZAVENTA) {
		FZAVENTA = fZAVENTA;
	}

	public String getFOLIOSISACT() {
		return FOLIOSISACT;
	}

	public void setFOLIOSISACT(String fOLIOSISACT) {
		FOLIOSISACT = fOLIOSISACT;
	}

	public String getI_regionDST() {
		return I_regionDST;
	}

	public void setI_regionDST(String i_regionDST) {
		I_regionDST = i_regionDST;
	}

	public String getV_PLAN() {
		return V_PLAN;
	}

	public void setV_PLAN(String v_PLAN) {
		V_PLAN = v_PLAN;
	}

	public String getD_FECHAACT() {
		return D_FECHAACT;
	}

	public void setD_FECHAACT(String d_FECHAACT) {
		D_FECHAACT = d_FECHAACT;
	}

	public String getDT_FECHAACT() {
		return DT_FECHAACT;
	}

	public void setDT_FECHAACT(String dT_FECHAACT) {
		DT_FECHAACT = dT_FECHAACT;
	}

	public String getV_CUENTAM2K() {
		return V_CUENTAM2K;
	}

	public void setV_CUENTAM2K(String v_CUENTAM2K) {
		V_CUENTAM2K = v_CUENTAM2K;
	}

	public PeticionAServicioBeanJson getPasbJSON() {
		return pasbJSON;
	}

	public void setPasbJSON(PeticionAServicioBeanJson pasbJSON) {
		this.pasbJSON = pasbJSON;
	}

	public RespuestaServicioBeanJson getRsbJSON() {
		return rsbJSON;
	}

	public void setRsbJSON(RespuestaServicioBeanJson rsbJSON) {
		this.rsbJSON = rsbJSON;
	}

	public String getArmaRequest() {
		return ArmaRequest;
	}

	public void setArmaRequest(String armaRequest) {
		ArmaRequest = armaRequest;
	}

	public String getBANDERA() {
		return BANDERA;
	}

	public void setBANDERA(String bANDERA) {
		BANDERA = bANDERA;
	}

}